package Medium;

public class MaximumSubarray53 {

    public int maxSubArray(int[] nums) {
        int i=0,j=0;
        int end=nums.length;
        int sumComparison = nums[0];
        int sum=0;
        int previousMaxSum=0;

        if(end<2)
        {
            return nums[end-1];
        }
        while(i<end) {
            while (i < end) {
                previousMaxSum = previousMaxSum + nums[i];
                sum = Math.max(previousMaxSum, nums[i]);
                sumComparison=Math.max(sumComparison,sum);

                if (sum <0&&sumComparison>=sum) {
                    previousMaxSum = 0;
                    break;
                }
                i++;
            }
            if(i==end)
            {
                break;
            }
            i++;
        }

     return sumComparison;
    }

    public static void main(String[] args)
    {
       // int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
     // int[] nums={5,4,-1,7,8};
     // int nums[]={-2,-1};
        int[] nums={-1,1,2,1};
        MaximumSubarray53 ms=new MaximumSubarray53();
       int output= ms.maxSubArray(nums);
       System.out.println("previousMaxSum"+output);

    }
}
