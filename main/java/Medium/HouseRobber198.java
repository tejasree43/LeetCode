package Medium;

import java.util.ArrayList;

public class HouseRobber198 {

    public int rob(int[] nums) {

ArrayList <Integer> li = new ArrayList<>();

        int n = nums.length;
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] =nums[0];

        for(int i=1;i<n;i++) {
            int number = dp[i-1]+nums[i];
                dp[i+1] = Math.max(dp[i],number);
            }

        System.out.println(li);
        return dp[n];
    }
    public static void main(String[] args)
    {
    final String a;
    /* HouseRobber198Q1   FA houseRobber = new HouseRobber198();
    // int[]  nums = {2,1,1,2};
     int[]  nums = {1,2,3,1};
     int output = houseRobber.rob(nums);*/
   //  System.out.println(output);

    }
}


      /*  Example 1:
        Input: nums = [1,2,3,1]
        Output: 4
        Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
        Total amount you can rob = 1 + 3 = 4.
              2    1    1     2
          0   1    2    3     4
          0   2    2    3     4


2,1,1,2

        Example 2:

        Input: nums = [2,7,9,3,1]
        Output: 12
        Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
zADER2WQ
}
       */

