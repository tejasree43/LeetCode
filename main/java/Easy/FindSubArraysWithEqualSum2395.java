package Easy;

import java.util.HashMap;

public class FindSubArraysWithEqualSum2395 {

    public boolean findSubarrays(int[] nums) {


   HashMap<Integer,Integer> hMap = new HashMap<>();

   int sum = 0;
   for(int i=0;i<nums.length-1;i++){

       sum=nums[i]+nums[i+1];
      if(hMap.containsValue(sum)){
          return true;
      }
     hMap.put(i,sum);

   }
   System.out.println("hMap"+hMap);
   return false;


   }

    public static void main(String[] args) {

        //int [] nums ={4,2,4};
        int [] nums = {1,2,3,4,5};
        FindSubArraysWithEqualSum2395 findSubArrays= new FindSubArraysWithEqualSum2395();
       boolean output = findSubArrays.findSubarrays(nums);
       System.out.println("output"+output);
    }
    }

