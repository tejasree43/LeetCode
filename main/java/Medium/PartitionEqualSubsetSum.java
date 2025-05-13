package Medium;

import java.util.Arrays;

public class PartitionEqualSubsetSum {

    public boolean canPartition(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
        }
        if (totalSum % 2 !=0) {
            return false;
        }

        final int requiredSum = totalSum/2;

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

       // int[] nums = {1,5,11,5};
     int[] nums = {1,2,5};
       //int[] nums = {3,3,3,4,5};
     //  int[] nums = {1,3,4,4};
     //int [] nums ={1,1,1,1,1};

     PartitionEqualSubsetSum partitionEquals = new PartitionEqualSubsetSum();
    boolean output = partitionEquals.canPartition(nums);

    System.out.println("output"+output);
    }
}
