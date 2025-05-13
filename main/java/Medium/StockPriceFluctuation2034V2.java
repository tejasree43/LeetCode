package Medium;

import java.util.HashMap;
import java.util.Map;

public class StockPriceFluctuation2034V2 {


    HashMap<Integer,Integer> hm=null;

    public StockPriceFluctuation2034V2() {
        hm=new HashMap<>();
    }

    public void update(int timestamp, int price) {
        hm.put(timestamp,price);
    }

    public int current() {
       int current=0;
       for(Map.Entry<Integer, Integer> entries :hm.entrySet()){
          int key= entries.getKey();
           current=Math.max(key,current);
       }
       if(current!=0) {
           return hm.get(current);
       }
       return current;
    }

    public int maximum() {
        int maximum=0;
        for(Map.Entry<Integer, Integer> entries :hm.entrySet()){
            int value= entries.getValue();
            maximum=Math.max(value,maximum);
        }

        return maximum;
    }

    public int minimum() {

        int minimum=Integer.MAX_VALUE;
        for(Map.Entry<Integer, Integer> entries :hm.entrySet()){
            int value= entries.getValue();
            minimum=Math.min(value,minimum);
        }

        return minimum;
    }

public static void main(String[] args){

StockPriceFluctuation2034V2 stock=new StockPriceFluctuation2034V2();
    stock.update(1, 10);
    stock.update(2, 5);
    int currentStockPrice=stock.current();
    System.out.println("currentStockPrice"+currentStockPrice);
    int maxValue =stock.maximum();
    System.out.println("maxValue"+maxValue);
    stock.update(1, 3);
    int maxUpdatedValue =stock.maximum();
    System.out.println("maxValue"+maxUpdatedValue);

    stock.update(4, 2);
    int minValue = stock.minimum();
    System.out.println("minValue"+minValue);






}
}
