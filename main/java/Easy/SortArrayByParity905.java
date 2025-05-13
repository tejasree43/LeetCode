package Easy;

import java.util.Arrays;

public class SortArrayByParity905 {

    public int[] sortArrayByParity(int[] nums) {

        int i=0;
        int j=nums.length-1;
        while(i<=j){

          if(nums[i]%2==1&&nums[j]%2==0) {
           int temp=nums[i];
           nums[i]=nums[j];
           nums[j]=temp;
           i++;
           j--;
          }
          else if(nums[i]%2==0) {
              i++;
          }
          else if(nums[j]%2==1) {
              j--;
          }
          else {
              i++;
              j--;
          }

        }

        return nums;
    }
    public static void main (String[] args){

    int[]  nums = {3,1,2,4};
      //  int[] nums={0};
     SortArrayByParity905 sortArray=new SortArrayByParity905();
     int[] output=sortArray.sortArrayByParity(nums);

        Arrays.stream(output).forEach(System.out::println);
    }
}
