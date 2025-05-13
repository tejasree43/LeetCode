package Medium;

public class BestTimetoBuyandSellStock122 {
    public int maxProfit(int[] prices) {

        int sum=0;
        int[] dp = new int[prices.length];
        dp[0] = prices[0];

        for (int i = 1; i < prices.length; i++) {
            dp[i] = Math.min(dp[i - 1], prices[i]);
        }

        for (int j = 0; j < prices.length; j++) {
             if(prices[j] - dp[j]>0){
                sum+= (prices[j] - dp[j]);
             }
        }
        System.out.println("maxSellPrice" + sum);

        return sum;
    }
    public static void main(String[] args){
        int[] prices ={7,1,5,3,6,4};
        //int[] prices ={1,3,2,8,4,9};
        BestTimetoBuyandSellStock122 btbss=new BestTimetoBuyandSellStock122();
        btbss. maxProfit(prices);
    }
}

      /*7  1 5 3 6 4  ->i

      Note 1: Always fill first value in most dp approaches dp[0]=7 thats our original array first value.
      Note  2:  Now try to compare the to get min value i.e.,prices[i - 1], prices[i]
      Note  3:Now minus the values from original Arrays i.e.,{7,1,5,3,6,4} by index wise.
      Note 4.Now calculate sum with prices[j] - dp[j].

        Dp Array           Index Array    sum+=prices[j] - dp[j]
        dp[0]=7             7               0
        dp[1]=(7,1)=1       1               0
        dp[2]= (1,5)=1      5               4
        dp[3]= (5,3)=3      3               0
        dp[4]= (3,6)=3      6               3
        dp[5]=(6,4)= 4      4               0
*/