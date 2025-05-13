package Easy;

import java.util.Arrays;

public class removeDuplicates26 {

    public static int[] removeDuplicates(int[] nums) {

       // List<Integer> al=new ArrayList<>();

        if(nums.length == 0)
            return new int[]{0};

        int addIndex = 1; //index that unique characters will be inserted at

        for(int i = 0; i < nums.length - 1; i++) {

            if(nums[i] < nums[i + 1]){ //if true, num[i + 1] is a new unique number
                nums[addIndex] = nums[i + 1];
                addIndex++;
            }
        }
        return nums;

    }
    public static void main(String args[]) {
       int[] nums = {1,1,2};
     int[] output   =removeDuplicates26.removeDuplicates(nums);

       Arrays.stream(output).forEach(s->System.out.println(s));

    }
    }

