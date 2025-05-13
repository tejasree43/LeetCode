package Medium;

import java.util.Arrays;

public class PartitiontoKEqualSumSubsets {

    public boolean canPartitionKSubsets(int[] nums, int k) {

       // Arrays.sort(nums);
        int n = nums.length;
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
        }
        if (totalSum % k !=0) {
            return false;
        }

        final int requiredSum = totalSum/4;

        // [0 - requiredSum]
        boolean[][] dp = new boolean[n+1][requiredSum+1];

        for(int i=0; i<dp.length;i++)
        {
            for(int j=0; j<dp[0].length; j++)
            {
                if(i==0) {
                    dp[i][j] = false;
                }

                if(j==0) {
                    dp[i][j] = true;
                }
            }
        }

        for(int i=1; i<dp.length;i++)
        {
            for(int j=0; j<dp[0].length;j++)
            {
                int compareArrayNum=nums[i-1];


                System.out.println("i value="+i);
                System.out.println("j value="+j);
                if(compareArrayNum <= j) {
                    int dpNumber=  j - nums[i - 1];

                    dp[i][j] = dp[i - 1][dpNumber] || dp[i - 1][j];
                }
                else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][requiredSum];
    }


    public static void main(String[] args){

        int [] nums = {2,2,2,2,3,4,5};
        //int[] nums = {4,3,2,3,5,2,1};
        int  k =4;
        PartitiontoKEqualSumSubsets partitionEquals = new PartitiontoKEqualSumSubsets();
        boolean output = partitionEquals.canPartitionKSubsets(nums,k);

        System.out.println("output"+output);
    }
}
