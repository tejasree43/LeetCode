package Medium;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray80 {

    public int removeDuplicates1(int[] nums) {

       // {1,1,1,2,2,3}
       // {0,0,1,1,1,1,2,3,3};
        if (nums.length <= 2) {
            return nums.length;
        }

        int k = 2; // Start from the 3rd element (0-based index 2)
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) { // Allow at most 2 duplicates
                nums[k] = nums[i];
                k++;
            }
        }

        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 0, k)));
        return k;
      //  return j;

       // System.out.println("nums);

       // return j;
       }




    public static void main(String[] args){

        RemoveDuplicatesfromSortedArray80 product = new RemoveDuplicatesfromSortedArray80();
       //int[] nums = {1,1,1,2,2,3};

       int[] nums = {0,0,1,1,1,1,2,3,3};
        int output = product.removeDuplicates1(nums);
        System.out.println("output"+output);
    }
}
