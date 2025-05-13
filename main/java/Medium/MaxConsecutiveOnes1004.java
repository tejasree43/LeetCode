package Medium;

public class MaxConsecutiveOnes1004 {

    public int longestOnes(int[] nums, int k) {

       int countZeros = 0;
       int i =0;
       int result = 0;
       int j =0;
       while(i<nums.length){

          if(nums[i]==0) {
              countZeros++;
          }

          while(countZeros>k){
              if(nums[j]==0) {
                  countZeros--;
              }
              j++;

          }

           result= Math.max(result,i-j+1);
           i++;

       }
        return result;
    }
    public static void main(String[] args) {

      int[]  nums = {1,1,1,0,0,0,0,0,0};
      int k = 2;
      MaxConsecutiveOnes1004 con = new MaxConsecutiveOnes1004();
     int result = con.longestOnes(nums,k);
     System.out.println("result"+result);

    }

    }
