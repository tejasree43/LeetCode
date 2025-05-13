package Medium;

public class FindPivotIndex724 {
    public int pivotIndex(int[] nums) {

        int prefixSum =0;
        int rightSum = 0;

        for(int element:nums){
            prefixSum +=element;
        }
        int i=0;
        while(i<nums.length){
            prefixSum -=nums[i];

           if(rightSum==prefixSum){
               return i;
           }
            rightSum +=nums[i];
           i++;
        }

        return -1;
    }

    public static void main(String[] args)
    {

      // int[]  nums = {1,7,3,6,5,6};
       int[] nums = {2,1,-1};
      //int[] nums ={-1,-1,-1,-1,-1,-1};
       // int[] nums ={-1,-1,-1,-1,-1,0};
      FindPivotIndex724 pivot = new FindPivotIndex724();
      int output = pivot.pivotIndex(nums);
      System.out.println("output"+output);

    }
}
