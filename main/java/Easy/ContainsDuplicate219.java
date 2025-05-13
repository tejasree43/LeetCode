package Easy;

import java.util.HashMap;

public class ContainsDuplicate219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {


        HashMap<Integer,Integer> map = new HashMap<>();

        int i=0;
        for(Integer number:nums){

            if(map.containsKey(number)){
                int j =map.get(number);
                if(Math.abs(i-j)<=k){
                    System.out.println("i value " + i);
                    System.out.println("j value" + j);
                    return true;
                }
                else{
                    map.put(number,i);
                }
            }
            map.put(number,i);
            i++;
        }


        //solution has TLE exceeded
       /* int i = 0;
        while (i < nums.length) {
            int j =i+1;
            while (j < nums.length) {
                if (nums[i] == nums[j]) {
                    if (j - i == k) {
                        System.out.println("i value " + i);
                        System.out.println("j value" + j);

                        return true;
                    }
                }
                j++;
            }
            i++;
        }*/
        return false;
    }

        /*    for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j <= i + k && j < nums.length; j++) {
                    if (nums[i] == nums[j])
                        return true;
                }
            }

            return false;*/



    public static void main(String[] args)
    {
        ContainsDuplicate219 slidingDuplicate=new ContainsDuplicate219();
        // int input[]={1,2,3,1};
    //    int k=3;
       // int input[]={1,2,3,1,2,3};
       // int k = 2;
       int[]  input=  {1,2,3,1,2,3};
        int k = 2;


      /* int[] input = {1,0,1,1};
         int k = 1;*/
      boolean output=  slidingDuplicate.containsNearbyDuplicate(input,k);
      System.out.println("output"+output);

    }
}


   /* Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
        Example 1:

        Input: nums = [1,2,3,1], k = 3
        Output: true*/