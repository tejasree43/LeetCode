package Medium;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures739 {

    public int[] dailyTemperatures(int[] temperatures) {

    int n  = temperatures.length;
    int[] output = new int[temperatures.length];

    Stack<Integer> stack = new Stack<>();

    for(int i=n-1;i>=0;i--){

    while(!stack.isEmpty()&&temperatures[i]>temperatures[stack.peek()]){
        stack.pop();
    }

    if(!stack.isEmpty()){
        output[i] = stack.peek()-i;

    }

     stack.push(i) ;
    }



    return output;
    }

    public static void main(String[] args)
    {
        int[] nums={73,74,75,71,69,72,76,73};
        DailyTemperatures739 dailyTemperatures=new DailyTemperatures739();
        int[] output=dailyTemperatures.dailyTemperatures(nums);
        Arrays.stream(output).forEach(System.out::println);
    }

}
   /* Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i]
    is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day
    for which this is possible, keep answer[i] == 0 instead.

        Example 1:

        Input: temperatures = [73,74,75,71,69,72,76,73]
        Output: [1,1,4,2,1,1,0,0]
        Example 2:

        Input: temperatures = [30,40,50,60]
        Output: [1,1,1,0]
        Example 3:

        Input: temperatures = [30,60,90]
        Output: [1,1,0]*/