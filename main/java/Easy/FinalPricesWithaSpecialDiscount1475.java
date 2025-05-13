package Easy;

import java.util.Arrays;
import java.util.Stack;

//Next smaller element question.
public class FinalPricesWithaSpecialDiscount1475 {
    public int[] finalPrices(int[] prices) {

        int n = prices.length;
        int[] answer = new int[n];

        answer[n-1] =prices[n-1];
        Stack<Integer> stack = new Stack<>();

        stack.push(prices[n-1]);
        for (int i=n-2;i>=0;i--)
        {

          while(!stack.isEmpty()&&prices[i]<stack.peek()){

              stack.pop();
          }
          if(stack.isEmpty()){
              answer[i]=prices[i];
          }
          else{
              answer[i] = prices[i]-stack.peek();
          }
          stack.push(prices[i]);
        }

        Arrays.stream(answer).forEach(System.out::println);


          return answer;
        }

    public static void main(String[] args){

    int[] prices ={8,7,4,2,8,1,7,7,10,1};
    FinalPricesWithaSpecialDiscount1475  finalPrices = new FinalPricesWithaSpecialDiscount1475();
    finalPrices.finalPrices(prices);

    }
}
