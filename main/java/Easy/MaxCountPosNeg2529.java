package Easy;

public class MaxCountPosNeg2529 {

    public int maximumCount(int[] nums) {

        int start=0;
        int high=nums.length-1;
        int negativeCount=0;
        int positiveCount=0;

        while(start<=high){
            if(nums[start]<0) {
                negativeCount=negativeCount + 1;
            }
            else if(nums[start]!=0){
                positiveCount=positiveCount+1;
            }
            start++;
        }

        int output=Math.max(negativeCount,positiveCount);
        return output;
    }

    public static void main(String[] args)
    {
        MaxCountPosNeg2529 binarySearchIndex=new MaxCountPosNeg2529();
        int[] arr = {-3,-2,-1,0,0,1,2};
        int output =binarySearchIndex.maximumCount(arr);
        System.out.println("output"+output);
    }
}
