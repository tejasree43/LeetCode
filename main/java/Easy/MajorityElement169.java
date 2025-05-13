package Easy;

import java.util.Arrays;

public class MajorityElement169 {
    public int majorityElement(int[] nums) {

        //Approach 1:
        //Majority Element will have occurance >n/2 (n is length of array) . When sorted , majority     element  will lie in the middle .
        Arrays.sort(nums);
      Arrays.stream(nums).forEach(s->System.out.println(s));

        System.out.println(nums.length/2);
        return nums[nums.length/2];

    }

    public static void main(String[] args) {

        int[] nums = {2,2,1,1,1,1,1,2,2};
        MajorityElement169 me=new MajorityElement169();
        int output=me.majorityElement(nums);
        System.out.println("output"+output);


    }
}
