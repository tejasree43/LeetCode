package Medium;

public class MaximumProductSubarray152 {
    public int maxProduct(int[] nums) {
       int maxSubArray=nums[0];
       int maxSubValue = nums[0];
       int minSubValue = nums[0];


        for(int i=1;i<nums.length;i++) {

          if(nums[i]<0) {

              int temp=maxSubValue;
              maxSubValue=minSubValue;
              minSubValue=temp;
          }

            maxSubValue=Math.max(maxSubValue*nums[i],nums[i]);
            minSubValue= Math.min(minSubValue*nums[i],nums[i]);
            maxSubArray=Math.max(maxSubArray,maxSubValue);
        }

        return maxSubArray;
    }
    public static void main(String[] args){
         int[] nums = {2,3,-2,4};
       // int[] nums ={0,2};
        MaximumProductSubarray152 maxProduct= new MaximumProductSubarray152();
        int output=  maxProduct.maxProduct(nums);
        System.out.println(output);
    }
}
