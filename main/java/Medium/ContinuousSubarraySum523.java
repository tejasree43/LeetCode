package Medium;

import java.util.HashMap;
import java.util.Map;

public class ContinuousSubarraySum523 {

    public boolean checkSubarraySum(int[] nums, int k) {

        for(int i=0;i<nums.length;i++){
            int sum=nums[i];
            for(int j=i+1;j<nums.length;++j){
                sum+=nums[j];
                if(sum%k==0){
                    // System.out.println("sum"+sum);
                    return true;
                }
            }
        }
        return false;
       /* int sum=0;

        for (int i = 0; i < nums.length; i++) {
            for(int j=i;j<nums.length;j++){

                sum+=nums[i];
            if(sum%k==0){
                return true;
            }

        }*/
    }

    public static void main(String[] args)
    {
       /* int[] nums={23,2,6,4,7};
        int k=13;*/
      int[] nums={23,2,6,4,7};
      int k = 13;
        ContinuousSubarraySum523 continuousSubarray=new ContinuousSubarraySum523();
       boolean output= continuousSubarray.checkSubarraySum(nums,k);
       System.out.println("output"+output);
    }
}
