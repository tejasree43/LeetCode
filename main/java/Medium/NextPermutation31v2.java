package Medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class NextPermutation31v2 {
    List<List<Integer>> result=new LinkedList<>();
    public  int[]  nextPermutation(int[] nums) {
        int firstDecreasingSequency=-1;

        for(int i=nums.length-1;i>0;i--) {

            if(nums[i-1]<nums[i])
            {
                firstDecreasingSequency=i-1;
                break;
            }
        }
        //next higher value from firstDecreasingSequenceIndex
        if(firstDecreasingSequency > -1) {
            for (int i = nums.length - 1; i > firstDecreasingSequency; i--) {

                if (nums[i] > nums[firstDecreasingSequency]) {
                    swap(nums, firstDecreasingSequency, i);
                    break;
                }
            }
        }

        int right=nums.length-1;
        int left=firstDecreasingSequency+1;
        if(firstDecreasingSequency==-1) {
            left = 0;
           }
            while (left < right) {
                swap(nums, left, right);
                left++;
                right--;

            }



        System.out.println("firstDecreasingSequency="+firstDecreasingSequency);

       return nums;
    }

    private void swap(int[] nums, int firstDecreasingSequency, int i) {

        int temp=nums[firstDecreasingSequency];
         nums[firstDecreasingSequency]=nums[i];
        nums[i]=temp;
    }

    public static void main(String[] args)
    {

        int [] nums = {1,3,2};
        NextPermutation31v2 nextPermutation=new NextPermutation31v2();
        int[] output=nextPermutation.nextPermutation(nums);
        Arrays.stream(output).forEach(s->System.out.println(s));
    }
}
