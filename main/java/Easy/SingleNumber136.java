package Easy;

import java.util.Arrays;
/*
Complexity
        Time complexity:
        The Arrays.sort method used at the beginning of the function has a time complexity of O(n log n),
         where n is the length of the input array. This is because it uses a variant of the quicksort algorithm,
         which has an average time complexity of O(nlogn).

        Space complexity:
        The space complexity of the function is O(1), as it uses only a constant amount
        of additional memory to store the loop variable and some temporary variables for the sorting operation.
         The sorting operation is performed in-place, so it does not require any additional memory allocation.
*/

public class SingleNumber136 {

    public int singleNumber(int[] nums) {

        //XOR operator
        int ans=0;

        for(int i=0;i<nums.length;i++){

        ans = ans^nums[i];

        }

        return ans;
        //With Arrays

     /*   Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 2) {

            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }

        }
        return nums[nums.length - 1];
*/
}

    public static void main(String[] args){
        SingleNumber136 sn=new SingleNumber136();
       // int[] nums = {2,2,1};
        int[] nums = {1};
        //int[] nums = {4,1,2,1,2};
        int output=sn.singleNumber(nums);
        System.out.println(output);
    }
}
