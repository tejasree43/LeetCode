package Medium;

import java.util.Arrays;

public class IncreasingTripletSubsequence334 {

    public boolean increasingTriplet(int[] nums) {

        //Brute Force approach with TLE
      /*  int length = nums.length;
        for(int i =0;i<length;i++){
           for(int j =i+1;j<length;j++)
             for(int k =j+1;k<length;k++){
                 if(nums[i]<nums[j]&&nums[j]<nums[k]){
                     return true;
                 }
             }
        }
        return false;
        Analysis
//Time Complexity: O(n)O(n)O(n)
//Space Complexity: O(n)*/


        //Useing two pointers
       /* int length = nums.length;
        int[] leftMin = new int[length];
        leftMin[0] = nums[0];
        for(int i =1;i<length;i++){

         leftMin[i] = Math.min(nums[i-1],nums[i]) ;

        }
        int[] rightMax = new int[length];
        rightMax[length-1] = nums[length-1];

        for(int i =length-2;i>=0;i--){

            rightMax[i] = Math.max(rightMax[i+1],nums[i]) ;
        }

        for(int i =0;i<length;i++){
            if(nums[i]>leftMin[i]&&nums[i]< rightMax[i]){
                return true;
            }

        }

        Analysis
        Time Complexity: O(n)O(n)O(n)
        Space Complexity: O(n)O(n)O(n)
        return false;*/

        //Greedy Approach:
        int first = nums[0];
        int second = Integer.MAX_VALUE;

        for(int Number:nums){

            if(Number>second){
                return true;
            }
            else if(Number>first){

              second = Number;
            }
            else{
                first = Number;
            }


        }
        /*Analysis
        Time Complexity: O(n)
        Space Complexity: O(1)*/
        return false;
    }


    public static void main(String[] args) {

     // int[] nums = {1,2,3,4,5};
     // int[] nums = {20,100,10,12,5,13};
      //int[] nums = {1,2,1,3}  ;
   //  int[] nums = {1,6,2,5,1};

      //int[] nums ={6,7,1,2};
      // int[] nums = {2,1,5,0,3};
        int[] nums = {1,5,0,4,1,3};
      IncreasingTripletSubsequence334  its = new IncreasingTripletSubsequence334();
      boolean output= its.increasingTriplet(nums);
      System.out.println("output"+output);

    }

}
