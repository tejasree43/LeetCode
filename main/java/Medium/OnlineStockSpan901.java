package Medium;

import java.util.Stack;

public class OnlineStockSpan901 {


    Stack<int[]> stack ;;

    OnlineStockSpan901(){
       stack = new Stack<>();
    }

    public int next(int price) {

        int span = 1;

        while(!stack.isEmpty()&&price>=stack.peek()[0]){
            span += stack.pop()[1];
        }
        stack.push(new int[]{price,span});

        return span;
    }

    public static void main(String[] args){
        OnlineStockSpan901 obj = new OnlineStockSpan901();
        int price = 100;
        int output1 = obj.next(price);
        System.out.println("output1= "+output1);
        int outputE = obj.next(50);
        System.out.println("outputE= "+outputE);
        int price2 =80;

        int output2 = obj.next(price2);
        System.out.println("output2= "+output2);
        int price3 =60;
        int output3 = obj.next(price3);
        System.out.println("output3= "+output3);
        int price4 =70;
        int output4 = obj.next(price4);
        System.out.println("output4= "+output4);
        int price5 =60;
        int output5 = obj.next(price5);
        System.out.println("output5= "+output5);
        int price6 =85;
        int output6 = obj.next(price6);
        System.out.println("output6= "+output6);

    }

}


    /*Design an algorithm that collects daily price quotes for some stock and returns the span of that stock's price for the current day.
    The span of the stock's price in one day is the maximum number of consecutive days (starting from that day
    and going backward) for which the stock price was less than or equal to the price of that day.

        Explanation
        StockSpanner stockSpanner = new StockSpanner();
        stockSpanner.next(100); // return 1
        stockSpanner.next(80);  // return 1
        stockSpanner.next(60);  // return 1
        stockSpanner.next(70);  // return 2
        stockSpanner.next(60);  // return 1
        stockSpanner.next(75);  // return 4, because the last 4 prices (including today's price of 75) were less than or equal to today's price.
        stockSpanner.next(85);  // return 6*/