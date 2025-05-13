package Medium;

import java.util.Arrays;

public class LongestIncreasingSubsequence300 {
    public int lengthOfLIS(int[] nums) {

       // Time complexity: O(n * 2).
       // Space complexity: O(n)

        int n=nums.length;
        int [] dp= new int[n];
       Arrays.fill(dp,1);
        int maxLengthValue =1;
        for(int i=1; i<nums.length;i++){

            for(int j=0; j <= i-1; j++) {

                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
            maxLengthValue =Math.max(dp[i],maxLengthValue);
        }

       // not returning dp[n-1] because sequence may start again.

        System.out.println("maxLengthValue"+maxLengthValue);
        return maxLengthValue;
    }
    public static void main(String[] args)
    {

       // int[] nums ={10,9,2,5,3,7,101,18};
        //int[] nums = {7,7,7,7,7,7,7};
       // 4,10,4,3,8,9
        int[] nums ={1,3,6,7,9,4,10,5,6};
        //int[] nums ={ 0,1,0,3,2,3};

       // int[] nums = {4,10,4,3,8,9};
        LongestIncreasingSubsequence300 longest=new LongestIncreasingSubsequence300();
        int lis = longest.lengthOfLIS(nums);
        System.out.println("lis="+lis);
    }
}
