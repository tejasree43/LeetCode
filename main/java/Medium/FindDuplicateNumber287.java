package Medium;

import java.util.Arrays;

public class FindDuplicateNumber287 {

    public int findDuplicate(int[] nums) {

        int n=nums.length;
        Arrays.sort(nums);
        int i=0;
        while(i<n){
            if(nums[i]==nums[i+1])
                    {
                        return nums[i];
                    }
            i++;
        }

        //Two pointer approach
       /* int i=0;
        while(i<n){

            int j=0;
            while(j<n){
                if(i!=j){
                   if(nums[i]==nums[j])
                   {
                       return nums[i];
                   }
                }
                j++;
            }

           i++;
        }*/

        return 0;
    }

    public static void main(String[] args){

    FindDuplicateNumber287 duplicateNumber=new FindDuplicateNumber287();
       int[] nums = {3,4,4,1,2};
        int output=duplicateNumber.findDuplicate(nums);
        System.out.println("output="+output);

   }

    }
