package Easy;

import java.util.Arrays;

public class MoveZeroes283 {

    public int[] moveZeroes(int[] nums) {

     int n=nums.length;
        int left=0;
        int right=1;

        while(right<n)
        {
            if(nums[left]!=0)
            {
                left++;
                right++;
            }
            else if(nums[right]==0)
            {
                right++;
            }
            else{
                int temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
            }
        }
       return nums;
       /* int i = 0;
        int n = nums.length;

        while(i<n) {

            if (nums[i] == 0) {
                int j = i + 1;
                while (j < n) {
                    if (nums[j] == 0) {
                        j++;
                    } else {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }

                }

                i++;
            }

        }
    return nums;*/
    }

    public static void main(String[] args)
    {
        MoveZeroes283 moveZero=new MoveZeroes283();
        int[] input={0,1,0,3,12};
       int[] nums  = moveZero.moveZeroes(input);
        Arrays.stream(nums).forEach(s->System.out.println(s));


    }
}

     /*  Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

        Note that you must do this in-place without making a copy of the array.
        Example 1:

        Input: nums = [0,1,0,3,12]
        Output: [1,3,12,0,0]
        Example 2:

        Input: nums = [0]
        Output: [0]*/