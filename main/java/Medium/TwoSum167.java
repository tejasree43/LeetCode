package Medium;

import java.util.Arrays;

public class TwoSum167 {

    public int[] twoSum(int[] numbers, int target) {

        int n = numbers.length;
        int i =0;

        while(i<n){

          int j=i+1;
          while(j<n){
           if(numbers[i]+numbers[j]==target){
               return new int[]{i+1,j+1}  ;
           }
           j++;
          }
         i++;
        }

      return numbers;
    }
    public static void main(String[] args){

        int[] numbers = {2,7,11,15 };
        int target = 9;
        TwoSum167 twoSumInsta = new TwoSum167();
       int output[] = twoSumInsta.twoSum(numbers,target);
        Arrays.stream(output).forEach(System.out::println);
    }
}
