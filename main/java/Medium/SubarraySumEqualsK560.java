package Medium;
import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK560 {
    public int subarraySum(int[] nums, int k) {

        //Brute Force approach
        //Time Complexity:O(n^2)
        //Space Complexity :O(1)
        /*int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++)
             {
              sum+=nums[j];
              if(sum==k){
                  count++;
              }
          }
        }
*/

       // Time complexity: O(nlogn) || n for the first loop || containsKey() -> O(1) || get()-> O(logn)
       // Space complexity: O(n)

       Map<Integer, Integer> map = new HashMap<>();
       map.put (0,1);
       int result=0;
       int sum=0;

        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            if (map.containsKey(sum-k)) {
                result+=  map.get(sum-k);
            }
            map.put(sum , map.getOrDefault(sum , 0) +1);

        }
       System.out.println(map);
        return result;
    }

    public static void main(String[] args)
    {
    /*  int[] nums={4,5,0,-2,-3,1};
      int k=5;*/
        int[] nums={1,2,3};
        int k=3;
      SubarraySumEqualsK560 subarraySumEquals=new SubarraySumEqualsK560();
      int output=  subarraySumEquals.subarraySum(nums,k);
      System.out.println("output"+output);
    }
}
