package Medium;

import java.util.Arrays;

public class LongestConsecutiveSequence128 {
   // it should be done under O(n) TC, but you have sorted the array by Arrays.sort() so it O(nlogn)
    public int longestConsecutive(int[] nums) {

        //Brute force approach
       /* Arrays.sort(nums);
        HashMap<Integer,Integer> hMap=new HashMap<>();
        int lastMapSize = 0;
        if(nums.length==0){
            return 0;
        }
        int prevValue=nums[0];
        for(int i=0;i<nums.length;i++){
            int absDiff = Math.abs(prevValue - nums[i]);
            prevValue=nums[i];
            if(absDiff==0||absDiff==1){
                hMap.put(nums[i],i);
            }
            else{
                lastMapSize =Math.max(hMap.size(),lastMapSize);
                hMap =new HashMap<>();
                hMap.put(nums[i],i);
            }

        }
        return Math.max(hMap.size(),lastMapSize);
    }*/

        Arrays.sort(nums);
        if(nums.length==0){
            return 0;
        }
        int count =0;
        int maxCount = 0;
        for(int i=0;i<nums.length -1 ;i++){

            if(nums[i]==nums[i+1]){
                continue;
            }
            else if (nums[i]+1 !=nums[i+1]){
                count =0;
            }
            else{
             count++;
                maxCount=Math.max(count,maxCount);
            }

        }
        //since count started from 0
      return maxCount+1 ;
    }

    public static void main(String[] args)
    {

    // int[] nums = {0,3,7,2,5,8,4,6,0,1};
        int[] nums ={9,1,4,7,3,-1,0,5,8,-1,6};
      //  int[] nums = {100,4,200,1,3,2};

        LongestConsecutiveSequence128 longest=new LongestConsecutiveSequence128();
     int hmapSize = longest.longestConsecutive(nums);
     System.out.println("hmapSize"+hmapSize);
    }
}
