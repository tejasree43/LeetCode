package Medium;

public class BestimetoBuyandSellStockwithTransactionFee714 {

 public int maxProfit(int[] prices, int fee) {

     int n = prices.length;
     int[] buy = new int[n];
     int[] sell = new int[n];

     buy[0] = -prices[0];
     sell[0] = 0;

     int k = 0;
     for (int i = 1; i < n; i++) {

         buy[i] = Math.max(buy[i - 1], sell[i - 1] - prices[i]);
         sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i]);

         if(buy[i] >0){
             k++;
         }

     }

     return   sell[n-1];

     /*int maxSell = 0;
     int[] dp=new int[prices.length];
     dp[0]=prices[0];
     for(int i=1;i<prices.length;i++) {
         dp[i] = Math.min(dp[i-1], prices[i]);
     }

     for (int j =0; j < prices.length; j++) {

         maxSell = Math.max(maxSell,prices[j]-dp[j]-fee)  ;
     }
     System.out.println("maxSellPrice"+maxSell);

     return maxSell;
*/

 }

public static void main(String[] args){
    int[] prices = {1,10,4,3,1,2,5,9,6,10};

 /*int[]  prices = {1,3,2,8,4,9};
  int fee = 2;
*/
 //int[]  prices = {7,1,5,3,6,4};
//int[]  prices = {1,3,7,5,10,3};
int fee = 3;

BestimetoBuyandSellStockwithTransactionFee714 timetoBuy = new BestimetoBuyandSellStockwithTransactionFee714();
int output = timetoBuy.maxProfit(prices,fee);
System.out.println("output"+output);
}

}
