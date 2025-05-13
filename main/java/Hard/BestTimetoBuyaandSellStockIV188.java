package Hard;

import java.util.Arrays;

public class BestTimetoBuyaandSellStockIV188 {

    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int[] profitAfterBuying = new int[k + 1];
        int[] profitAfterSelling = new int[k + 1];

          Arrays.fill(profitAfterBuying, Integer.MIN_VALUE);
        for (int i = 0; i < n; i++) {
            int curPrice = prices[i];
            for (int j = 1; j<k+1; j++) {
                profitAfterBuying[j] =  Math.max(profitAfterBuying[j],  profitAfterSelling[j - 1] - curPrice);
                profitAfterSelling[j] = Math.max(profitAfterSelling[j], profitAfterBuying[j] + curPrice);
            }
        }
        return profitAfterSelling[k];
}

        public static void main(String[] args){
            BestTimetoBuyaandSellStockIV188 btbs=new BestTimetoBuyaandSellStockIV188();
            //int[] prices = {2,4,1};
            //int[] prices = {3,2,6,5,0,3};
            //int[] prices = {3,2,6,5,0,3};

           //int[] prices = {2,1,2,1,0,0,1};//2
            //int[] prices  ={ 3,3,5,0,0,3,1,4 };//6
           // int[] prices  ={3,2,6,5,0,3};//7
            int[] prices  ={ 1,10,4,3,1,2,5,9,6,10};
            int k = 2;
            int output = btbs.maxProfit(k,prices);
            System.out.println("output"+output);
        }
    }
