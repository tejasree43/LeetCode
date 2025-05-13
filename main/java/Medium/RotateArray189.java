package Medium;

import java.util.Arrays;

public class RotateArray189 {

    public void rotate(int[] nums,int k) {

        k=k%nums.length;
        System.out.println("k value"+k);


        reverse(0,nums.length-1,nums);
        reverse(0,k-1,nums);
        reverse(k,nums.length-1,nums);


    }


        public void reverse(int start,int end,int[] nums){

            while (start<end) {
                   int temp = nums[start];
                    nums[start] = nums[end];
                    nums[end] = temp;
                    start++;
                    end--;
                }
            Arrays.stream(nums).forEach(s -> System.out.println(s));

        }


    public static void main(String[] args)
    {
        RotateArray189 rotateArray=new RotateArray189();
        int[] nums = {1,2,3,4,5,6,7};
        int k=3;
        rotateArray.rotate(nums,k);

    }
}

       /* Input: nums = [1,2,3,4,5,6,7], k = 3
        Output: [5,6,7,1,2,3,4]
        Explanation:
        rotate 1 steps to the right: [7,1,2,3,4,5,6]
        rotate 2 steps to the right: [6,7,1,2,3,4,5]
        rotate 3 steps to the right: [5,6,7,1,2,3,4]*/