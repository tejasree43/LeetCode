package Medium;

import java.util.Arrays;

 class SuccessfulPairsofSpellsandPotions2300 {

    public int[] successfulPairs(int[] spells, int[] potions, long success) {

        int i =0;
        int n = potions.length;
        int[] pairs =new int[spells.length];
        Arrays.sort(potions);

        while(i<spells.length){
            int left = 0;
            int right = potions.length-1;

            while(left<=right)
            {
                int mid = left +(right-left)/2;

                int number =potions[mid]*spells[i];

                 if(number>=success){
                     right = mid-1;

                  }
                else{
                     left = mid+1;
                }
            }
            pairs[i] =n-left;
        i++;
        }

        return pairs;
    }

    public static void main(String[] args){
    int[] spells = {3,1,2}, potions = {8,5,8};
    int success = 16;
    SuccessfulPairsofSpellsandPotions2300 pairsOfSpells = new  SuccessfulPairsofSpellsandPotions2300();
    int[] pairs =pairsOfSpells.successfulPairs(spells,potions,success);

    Arrays.stream(pairs).forEach(System.out::println);
    }
}
