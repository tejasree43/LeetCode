package Medium;

import java.util.Arrays;

public class JumpGame2 {
    public int jump(int[] nums) {

       /* int n = nums.length ;
        int numberOfJumps = 0;

        int[] dp=new int[n];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        System.out.println("Integer.MAX_VALUE"+Integer.MAX_VALUE);
       for(int i=1;i<n;i++) {
           for(int j=0;j<i;j++) {
           if(j+nums[j] >= i){
              dp[i] = Math.min(dp[j]+1,dp[i]);
              }

           }

        }
       return dp[n-1];*/

        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE); //Initially we do not know, what is min steps, hence initialize all with Integer.MAX_Value.
        dp[0] = 0;
        for (int i = 1; i < n; i++) { //Start from 1 to n
            for (int j = 0; j < i; j++) { //At each index, get min steps to reach dp[i] by looping from begining (i.e. start from 0 till i)
                if (j + nums[j] >= i) { //if j+nums[j] >=i, then from 'j' index we can have j+nums[j] jump, which can reach (or go over) nums[i]. This means we can jump from index 'j'.
                    dp[i] = Math.min(dp[i], dp[j] + 1); //Check if the this is min.
                }
            }
        }
        return dp[n - 1];



        }
public static void main(String[] args){
    int[] nums = {2,3,4,5,6};
    //int[] nums =  { };
    JumpGame2 jumpGame= new JumpGame2 ();
   int output= jumpGame.jump(nums);
   System.out.println("output"+output);
    }
}