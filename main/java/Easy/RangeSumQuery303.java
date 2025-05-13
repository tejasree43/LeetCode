package Easy;

class NumArray {

    int[] nums;

    public NumArray(int[] nums) {

        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            nums[i] =sum;

        }
        this.nums=nums;

    }

    public int sumRange(int left, int right) {

        if(left==0) {
            return nums[right];
        }
        else{
           return nums[right] - nums[left-1];

        }
    }
}
public class RangeSumQuery303 {
   /* ["NumArray", "sumRange", "sumRange", "sumRange"]
            [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]*/
public static void main(String[] args) {
    int[] nums = {-2, 0, 3, -5, 2, -1};

    NumArray numsObject = new NumArray(nums);
  int output=  numsObject.sumRange(0, 5);
    int output1=  numsObject.sumRange(2, 5);

  System.out.println("output="+output);
}
}
