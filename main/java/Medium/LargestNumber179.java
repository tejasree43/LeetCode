package Medium;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class LargestNumber179 {

    public String largestNumber(int[] nums) {

        /*String[] strArray = new String[nums.length];

        int index = 0;
        for(int number:nums){
            strArray[index++] = number+ "";
        }
        Arrays.sort(strArray,(a,b)-> {
                    String s1 = a + "" + b;
                    String s2 = b + "" + a;
                    return s2.compareTo(s1);
                }
                );

        StringBuilder result = new StringBuilder();

        for(String value:strArray) {
            result.append(value);
        }

        if(result.charAt(0)=='0') {
            return "0";
        }

        return result.toString();*/
        //using Streams

        Stream<Integer> arr=Arrays.stream(nums).boxed();
        StringBuilder sb = new StringBuilder();
        arr.sorted((a,b)->(b+""+a).compareTo(a+""+b)).forEach(sb::append);


        return sb.charAt(0)=='0'?"0":sb.toString();

    }
    public static void main(String[] args) {

        LargestNumber179 number = new LargestNumber179();
        int[] input = {3,30,34,5,9,3};
        String output = number.largestNumber(input);
        System.out.println("output"+output);
    }

}
   /* Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.
        Example 1:

        Input: nums = [10,2]
        Output: "210"
        Example 2:

        Input: nums = [3,30,34,5,9]
        Output: "9534330"*/