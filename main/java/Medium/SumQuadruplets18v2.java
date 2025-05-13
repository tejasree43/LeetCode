package Medium;

import java.util.*;

public class SumQuadruplets18v2 {
   // List<List<Integer>> result=new LinkedList<>();
    public List<List<Integer>> fourSum1(int[] nums, int target) {

        //Brute force approach
       // TC: O(n * logn) + O(n ^ 4) => O(n ^ 4)
        // SC: O(1) - Ignoring output array
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        if(nums[i]+nums[j]+nums[k]+nums[l]==target) {
                            result.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        }
                    }
                }

            }
        }
            System.out.println(result);

            return new ArrayList<>(result);


    }

    private List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

              int low=j+1;
              int high=n-1;
              int sum=target-nums[i]-nums[j];

              while(low<high){
                  List<Integer> tempList=new ArrayList<>();
                  if(nums[low]+nums[high]==sum) {
                      tempList.add(nums[i]);
                      tempList.add(nums[j]);
                      tempList.add(nums[low]);
                      tempList.add(nums[high]);
                      result.add(tempList);

                      while (low < high && nums[low] == nums[low + 1]) {
                          low++;
                      }
                      while (low < high && nums[high] == nums[high - 1]) {
                          high--;
                      }
                      low++;
                      high--;
                  }else if(nums[low]+nums[high]<sum){

                       low++;
                  }
                  else{
                      high--;
                  }
              }
              while(j+1<n&&nums[j]==nums[j+1]){
                  j++;
              }
                while(i+1<n&&nums[i]==nums[i+1]){
                    i++;
                }

            }
        }

        System.out.println(result);

        return result;
    }

    public static void main(String[] args) {
        SumQuadruplets18v2 quadrupletv2=new SumQuadruplets18v2();
        int[] nums={1,0,-1,0,-2,2};
        int target = 0;
        quadrupletv2.fourSum(nums,target);

    }


}
