package Easy;

public class MinCostClimbingStairs746 {
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {

       /* int n = cost.length;
         dp = new int[n];
         return Math.min(minCost(cost,n-1),minCost(cost,n-2));
      //  return Math.min(minCost(cost,n-1),1000);

    }

    private int minCost(int[] cost, int n) {

            if (n < 0) return 0;
            if (n==0 || n==1) return cost[n];
            if (dp[n] != 0) return dp[n];
            int n1= minCost(cost, n-1);
             int n2= minCost(cost, n-2);
             dp[n]=  cost[n]+ Math.min(n1,n2 );
            //dp[n] = cost[n]+ Math.min(1000,minCost(cost, n-2));

           return dp[n];
        }*/

        int n = cost.length;
        int[] dp = new  int[n];;

        for (int i = 0; i < n; i++) {

            if(i<2) dp[i]=cost[i];
           else {
                dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
            }
        }
        return Math.min(dp[n-1],dp[n-2]);
        //Step 5 - Optimization 3 - Fine Tuning - Reduce O(n) space to O(1).
       /* int n = cost.length;
        int first = cost[0];
        int second = cost[1];
        if (n <= 2) return Math.min(first, second);
        for (int i = 2; i < n; i++) {
            int curr = cost[i] + Math.min(first, second);
            first = second;
            second = curr;
        }
        return Math.min(first, second);*/
    }


    public static void main(String[] args) {
        int[] cost = { 10, 15, 20, 25, 30};
        MinCostClimbingStairs746 minCost = new MinCostClimbingStairs746();
        int output = minCost.minCostClimbingStairs(cost);
        System.out.println("output"+output);
    }
    }


