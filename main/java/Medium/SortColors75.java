package Medium;

import java.util.Arrays;

public class SortColors75 {

    public void sortColors(int[] nums) {

        int n=nums.length;
        int i=0;
        while(i<n){
          int  j = 0;
            while(j<n) {
                if (nums[i]< nums[j]) {
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j] = temp;
                   }
                j++;
                }
              i++;
            }
        Arrays.stream(nums).forEach(System.out::println);
        }

    public static void main(String[] args){

       int[] nums = {2,0,2,1,1,0};

        SortColors75 SortColors=new SortColors75();
        SortColors.sortColors(nums);

    }
}
