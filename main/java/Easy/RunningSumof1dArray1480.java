package Easy;

import Basics.PossibleSumsRecursion;

import java.util.Arrays;

public class RunningSumof1dArray1480 {
    public int[] runningSum(int[] nums) {
        int[] output=new int[nums.length];

            int sum = 0;
            for(int row=0;row<nums.length;row++){
             sum= sum+nums[row];
             output[row]=sum;
           }

        return output;
    }


    public static void main(String[] args) {
        int[] number = {1,1,1,1,1};
        RunningSumof1dArray1480 rsa = new RunningSumof1dArray1480();
        int[] output = rsa.runningSum(number);
        Arrays.stream(output).forEach(s->System.out.println(s));
    }
}
