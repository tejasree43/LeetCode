package Medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class StockPriceFluctuation2034 {

    class stockRecord{
      int  timestamp;
     int price;
        stockRecord() {
        }
      stockRecord(int timestamp,int price){
      this.timestamp=timestamp;
      this.price=price;
     }
    }
    PriorityQueue<stockRecord> maxHeapPrice=null;
    PriorityQueue<stockRecord> minHeapPrice=null;
    stockRecord current;
    HashMap<Integer,Integer> hm=null;
    public StockPriceFluctuation2034() {
        current=new stockRecord();
        maxHeapPrice=new PriorityQueue<>((a,b)->b.price-a.price);
        minHeapPrice=new PriorityQueue<>((a,b)->a.price-b.price);

        hm=new HashMap<>();
    }

    public void update(int timestamp, int price) {

        stockRecord stock=new stockRecord(timestamp,price);
        if(timestamp>=current.timestamp){
            current=stock;
        }
        maxHeapPrice.add(stock);
        minHeapPrice.add(stock);
        hm.put(timestamp,price);

    }

    public int current() {
       return current.price;
    }

    public int maximum() {
      while(maxHeapPrice.peek().price!=hm.get(maxHeapPrice.peek().timestamp)){
          maxHeapPrice.poll();
      }
      return maxHeapPrice.peek().price;
    }

    public int minimum() {

        while(minHeapPrice.peek().price!=hm.get(minHeapPrice.peek().timestamp)){
            minHeapPrice.poll();
        }
        return minHeapPrice.peek().price;    }

public static void main(String[] args){

StockPriceFluctuation2034 stock=new StockPriceFluctuation2034();
    stock.update(1, 10);
    stock.update(2, 5);
    int currentStockPrice=stock.current();
    System.out.println("currentStockPrice"+currentStockPrice);
    int maxStockPrice=stock.maximum();
    System.out.println("currentStockPrice"+maxStockPrice);

    stock.update(1, 3);
    stock.maximum();
    stock.update(4, 2);
    int minStock = stock.minimum();
    System.out.println("minStock"+minStock);




}
}
