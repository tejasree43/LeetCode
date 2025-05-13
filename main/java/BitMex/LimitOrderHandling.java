package BitMex;

import java.util.*;

class Order {
    private String orderId;
    private char side;
    private int price;
    private int volume;

    public Order(String orderId, char side, int price, int volume) {
        this.orderId = orderId;
        this.side = side;
        this.price = price;
        this.volume = volume;
    }

    public String getOrderId() {
        return orderId;
    }

    public char getSide() {
        return side;
    }

    public int getPrice() {
        return price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}

class Trade {
    private String buyOrderId;
    private String sellOrderId;
    private int price;
    private int volume;

    public Trade(String buyOrderId, String sellOrderId, int price, int volume) {
        this.buyOrderId = buyOrderId;
        this.sellOrderId = sellOrderId;
        this.price = price;
        this.volume = volume;
    }

    public String getBuyOrderId() {
        return buyOrderId;
    }

    public String getSellOrderId() {
        return sellOrderId;
    }

    public int getPrice() {
        return price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}

class OrderBook {
    private List<Order> buyOrders;
    private List<Order> sellOrders;
    private List<Trade> trades;

    public OrderBook() {
        buyOrders = new ArrayList<>();
        sellOrders = new ArrayList<>();
        trades = new ArrayList<>();
    }

    public void addOrder(Order order) {
        if (order.getSide() == 'B') {
            processBuyOrder(order);
        } else if (order.getSide() == 'S') {
            processSellOrder(order);
        }
    }

    private void processBuyOrder(Order buyOrder) {
        Iterator<Order> sellIterator = sellOrders.iterator();

        while (sellIterator.hasNext()) {
            Order sellOrder = sellIterator.next();
            if (sellOrder.getPrice() <= buyOrder.getPrice()) {
                int tradeVolume = Math.min(sellOrder.getVolume(), buyOrder.getVolume());

                trades.add(new Trade(buyOrder.getOrderId(), sellOrder.getOrderId(), sellOrder.getPrice(), tradeVolume));

                buyOrder.setVolume(buyOrder.getVolume() - tradeVolume);
                sellOrder.setVolume(sellOrder.getVolume() - tradeVolume);

                if (sellOrder.getVolume() == 0) {
                    sellIterator.remove();
                }

                if (buyOrder.getVolume() == 0) {
                    return;
                }
            }
        }

        if (buyOrder.getVolume() > 0) {
            buyOrders.add(buyOrder);
        }
    }

    private void processSellOrder(Order sellOrder) {
        Iterator<Order> buyIterator = buyOrders.iterator();

        while (buyIterator.hasNext()) {
            Order buyOrder = buyIterator.next();
            if (buyOrder.getPrice() >= sellOrder.getPrice()) {
                int tradeVolume = Math.min(buyOrder.getVolume(), sellOrder.getVolume());

                trades.add(new Trade(buyOrder.getOrderId(), sellOrder.getOrderId(), sellOrder.getPrice(), tradeVolume));

                sellOrder.setVolume(sellOrder.getVolume() - tradeVolume);
                buyOrder.setVolume(buyOrder.getVolume() - tradeVolume);

                if (buyOrder.getVolume() == 0) {
                    buyIterator.remove();
                }

                if (sellOrder.getVolume() == 0) {
                    return;
                }
            }
        }

        if (sellOrder.getVolume() > 0) {
            sellOrders.add(sellOrder);
        }
    }

    public void printOrderBook() {
        Comparator<Order> buyComparator = Comparator.comparing(Order::getPrice).reversed();
        Comparator<Order> sellComparator = Comparator.comparing(Order::getPrice);

        Collections.sort(buyOrders, buyComparator);
        Collections.sort(sellOrders, sellComparator);

        int maxBuyVolume = buyOrders.stream().mapToInt(Order::getVolume).max().orElse(0);
        int maxSellVolume = sellOrders.stream().mapToInt(Order::getVolume).max().orElse(0);
        int maxVolume = Math.max(maxBuyVolume, maxSellVolume);

        StringBuilder orderBookBuilder = new StringBuilder();

        for (int i = maxVolume; i > 0; i--) {
            StringBuilder lineBuilder = new StringBuilder();

            lineBuilder.append(String.format("%,d ", i));

            for (Order buyOrder : buyOrders) {
                if (buyOrder.getVolume() >= i) {
                    lineBuilder.append(buyOrder.getPrice()).append(" ");
                } else {
                    lineBuilder.append("   | ");
                }
            }

            lineBuilder.append("| ");

            for (Order sellOrder : sellOrders) {
                if (sellOrder.getVolume() >= i) {
                    lineBuilder.append(sellOrder.getPrice()).append(" ");
                } else {
                    lineBuilder.append("    ");
                }
            }

            orderBookBuilder.append(lineBuilder.toString().trim()).append("\n");
        }

        System.out.println(orderBookBuilder.toString());
    }

    public void printTrades() {
        for (Trade trade : trades) {
            System.out.printf("trade %s,%s,%d,%d\n", trade.getBuyOrderId(), trade.getSellOrderId(),
                    trade.getPrice(), trade.getVolume());
        }
    }
}

public class LimitOrderHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        OrderBook orderBook = new OrderBook();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] orderData = line.split(",");

            String orderId = orderData[0];
            char side = orderData[1].charAt(0);
            int price = Integer.parseInt(orderData[2]);
            int volume = Integer.parseInt(orderData[3]);

            Order order = new Order(orderId, side, price, volume);
            orderBook.addOrder(order);
        }

        orderBook.printTrades();
        orderBook.printOrderBook();
    }
}
