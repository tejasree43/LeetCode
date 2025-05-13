package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextPermutation31 {

    List<List<Integer>> output=new ArrayList<>();
    public  List<List<Integer>>  nextPermutation(int[] nums) {

        int n = nums.length;
        int i = 1;
        int j = 0;

        while (i < n-1) {
                swap(nums, i, i+1);
               // j++;
           // }
            i++;
        }
        Arrays.stream(nums).forEach(s->System.out.println(s));
      //  System.out.println(nums);
        return output;
    }
    private void swap(int[] nums, int i,int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }


    public static void main(String[] args){
        int[] nums = {3,2,1};
        NextPermutation31 np=new NextPermutation31();
        np.nextPermutation(nums);

    }
}
