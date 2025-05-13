package Medium;

import Algorithms.SlidingWindow;


public class MinimumSizeSubarraySum {

    public int minSubArrayLen(int target, int[] nums) {

 //* Time Complexity: O(N). Each element of array is visited maximum twice.
 //* Space Complexity: O(1)
 //* N = Length of input array.
        int start =0;
        int end =0;

        int minLength = Integer.MAX_VALUE;

        int sum =0;

        while( end<nums.length){


            sum+=nums[end];
            end++;

            while(sum>=target){

                minLength =Math.min(minLength,end-start);
                sum-=nums[start];
                start++;
            }
        }

        System.out.println("minLength"+minLength);


        return minLength==Integer.MAX_VALUE?0:minLength;
    }
    public static void main(String[] args)
    {
        MinimumSizeSubarraySum minimum = new MinimumSizeSubarraySum();
        int[] nums = { 2,3,1,2,4,3};
        int target = 7;
        minimum.minSubArrayLen(target,nums);


    }
}
