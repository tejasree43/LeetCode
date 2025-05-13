package Medium;

import java.util.*;

public class CoinChange322 {
    public int coinChange(int[] coins, int amount) {


        int[] dp = new int[amount+1];

        Arrays.fill(dp,amount+1);
        dp[0] = 0;

        int[] coinUsed = new int[amount+1];

        for(int coin:coins){
        for(int i =1;i<=amount;i++){
            if(i-coin>=0) {
                dp[i] = Math.min(dp[i], dp[i - coin]+ 1);
                coinUsed[i] = coin;
            }
            }

        }


       if(dp[amount]>amount){
           return -1;
       }

        return dp[dp.length-1];
    }
    private void printCoins(int[] coinUsed, int amount) {
        List<Integer> coinsUsed = new ArrayList<>();
        while (amount > 0) {
            int coin = coinUsed[amount];
            coinsUsed.add(coin);
            amount -= coin;
        }
        System.out.println("Coins used: " + coinsUsed);
    }
    public static void main(String[] args){

       /* int[] coins = {1,2,5};
        int amount = 11;*/
        int[] coins = {2,5,10,1};
        int amount = 27;
        CoinChange322 coinChange=new CoinChange322();
        int coinOutput =  coinChange.coinChange(coins,amount);
        System.out.println("coinOutput"+coinOutput);

    }
}

//Time complexity O(N∗M)
//Dp Table
     /* 0 1 2 3 4 5 6 7 8 9 10 11

   1
   2
   5*/