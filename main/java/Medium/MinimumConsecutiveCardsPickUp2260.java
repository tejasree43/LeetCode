package Medium;

import java.util.HashMap;
import java.util.Map;

public class MinimumConsecutiveCardsPickUp2260 {

    public int minimumCardPickup(int[] cards) {

        Map<Integer,Integer> hm=new HashMap<>();
        int MinValueOfcards=Integer.MAX_VALUE;
        for(int i=0;i<cards.length;i++){
            if(hm.containsKey(cards[i])){
                MinValueOfcards=Math.min(MinValueOfcards,i+1 - hm.get(cards[i]));

            }
            else{
                hm.put(cards[i],i);
             }
            }
        if(MinValueOfcards==Integer.MAX_VALUE)
        {
            return -1;
        }
        return MinValueOfcards;
    }
    public static void main(String[] args)
    {
       int [] cards = {3,4,2,3,4,7};
      // int[] cards = {95,11,8,65,5,86,30,27,30,73,15,91,30,7,37,26,55,76,60,43,36,85,47,96,6};
      //  int[] cards ={70,37,70,41,1,62,71,49,38,50,29,76,29,41,22,66,88,18,85,53};
        MinimumConsecutiveCardsPickUp2260 minimumCards=new MinimumConsecutiveCardsPickUp2260();
        int output= minimumCards.minimumCardPickup(cards);
        System.out.println("output"+output);
    }
}
