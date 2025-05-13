package Medium;

import java.util.Arrays;

public class FindFirstandLastPosition34 {

    public int[] searchRange(int[] nums, int target) {

        int n=nums.length;
        int low=0;
        int high=n-1;
        int startIndex  = searchPosition( low, high,nums,  target,true);
         int endIndex =   searchPosition( low, high,nums,  target,false);
        return new int[]{startIndex,endIndex};
    }
public int searchPosition(int low,int high, int[] nums, int target,boolean findFirst){


        int answer=-1;
        while(low<=high){

            int midIndex=low+(high-low)/2;
            int midValue=nums[midIndex];
            if(midValue>target){
                high=midIndex-1;
            }
            else if(midValue<target){
                low=midIndex+1;
            }
            else {
                answer=midIndex;
                if(findFirst==true){
                    high=midIndex-1;
                }
                else{
                    low=midIndex+1;
                }
            }
        }

  return answer;

    }

    public static void main(String[] args) {

        FindFirstandLastPosition34 findFirst=new FindFirstandLastPosition34();
       int[] nums ={5,7,7,8,8,10};
       int target = 8;

        /*int[] nums ={3,3,3};
        int target = 3;*/
      //  int[] nums={5,7,7,8,8,10};
     //       int target = 6;
        int[] outputArray=findFirst.searchRange(nums,target);
        Arrays.stream(outputArray).forEach(System.out::println);

    }
}
