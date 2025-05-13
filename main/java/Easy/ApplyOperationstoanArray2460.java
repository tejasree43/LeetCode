package Easy;

import java.util.Arrays;

public class ApplyOperationstoanArray2460 {

        public int[] applyOperations(int[] nums) {


            int n = nums.length;

            int i = 0;
            while(i<n)
            {
               if(i+1<n &&nums[i]==nums[i+1])
               {
                   nums[i]=nums[i]*2;
                   nums[i+1]=0;
               }
                i++;
            }

            int k = 0 ;
            while(k<n)
            {
                int j=k;
                if (j+1<n &&nums[j]==0) {

                    while (j+1<n&&nums[j] == 0) {
                        j++;
                    }
                    nums[k] = nums[j];
                    nums[j] = 0;
                }
                k++;
            }


            Arrays.stream(nums).forEach(s->System.out.print(" " +s));

         // Arrays.stream(nums).forEach(s->System.out.print(s));
            return nums;
        }
        public static void main(String[] args) {

           // int[] nums = {1, 2, 2, 1, 1, 0};
            int[] nums = { 1694,0,0,0,399,832,0,1758,0,412,0,206,272,0};
            ApplyOperationstoanArray2460 apply = new ApplyOperationstoanArray2460();
            apply.applyOperations(nums);

        }
    }
