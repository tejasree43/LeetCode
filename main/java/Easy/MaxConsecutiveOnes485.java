package Easy;

public class MaxConsecutiveOnes485 {

    public int findMaxConsecutiveOnes(int[] nums) {

        //
       /* int result =0;
        int i =0;
        int sum =0;
        while(i<nums.length){
          if(nums[i]==0){
              sum =0;
           }
          else{
              sum++;
          }
            result=Math.max(sum,result);
            i++;
        }*/
       // return result;

        //using sliding window
        int start = 0;
        int counter =0;
        for(int end = 0;end<nums.length;end++){
            if(nums[end]==0){
                start = end+1;
            }
            counter= Math.max(counter,end-start+1) ;
        }
        return counter;
    }
    public static void main(String[] args) {

        int[] nums = {1,1,0,1,1,1};

        MaxConsecutiveOnes485 max = new MaxConsecutiveOnes485();
       int output = max.findMaxConsecutiveOnes(nums);
       System.out.println("output"+output);
    }
    }
