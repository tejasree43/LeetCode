package Easy;

public class BestTimetoBuyandSellStock121 {

    public int maxProfit(int[] prices) {

       // brute force approach with time limit exceed
       /* int minBuyPrice=prices[0];
        int maxSellPrice=0;
        int temp=0;
        for(int i=0;i<prices.length-1;i++) {

            if (minBuyPrice > prices[i]) {
                minBuyPrice = Math.min(minBuyPrice, prices[i]);
                temp = i;
            }

          for (int j =temp; j < prices.length; j++) {

                    maxSellPrice=Math.max(maxSellPrice,prices[j]-minBuyPrice)  ;
            }
       }*/

        //dynamic programming

        int maxSell=0;
        int[] dp=new int[prices.length];
        dp[0]=prices[0];

        //Get the smallest buy price
        for(int i=1;i<prices.length;i++) {
            dp[i] = Math.min(dp[i-1], prices[i]);
         }

        //subtract with smallest buy price
           for (int j =0; j < prices.length; j++) {
               maxSell=Math.max(maxSell,prices[j]-dp[j])  ;
            }
           System.out.println("maxSellPrice"+maxSell);

        return maxSell;
    }

    public static void main(String[] args){
        BestTimetoBuyandSellStock121 bTBSS=new BestTimetoBuyandSellStock121();
        int[]  prices = {7,5,1,3,6,4};
        bTBSS.maxProfit(prices);
    }
}
