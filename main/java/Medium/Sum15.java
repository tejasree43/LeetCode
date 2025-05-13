package Medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Sum15 {

    List<List<Integer>> output= new LinkedList<>();
    public List<List<Integer>> threeSum(int[] nums) {

        //backtracking solution using the time limit exceed problem.
        Arrays.sort(nums);
        int startIndex=0;int sum=0;
        Backtracking(nums,startIndex,sum, new LinkedList<>());
        System.out.println(output);
        return output;
    }

    private void Backtracking(int[] nums, int startIndex,int sum, List<Integer> list) {
        int triplet=3;
        if(list.size()==3&&sum==0)
        {
            System.out.println("Inside for loop");
            output.add(new LinkedList<>(list));
           return;
        }

        for(int i=startIndex;i<nums.length;i++)
        {
            if(startIndex!=i &&nums[i]==nums[i-1]){
                continue;
            }
            if(list.size()<=3) {
                list.add(nums[i]);
                Backtracking(nums, i + 1, sum + nums[i], list);
                list.remove(new Integer(nums[i]));
            }

        }
    }


    public static void main(String[] args) {

        Sum15 sum=new Sum15();
        int[] nums = {-1,0,1,2,-1,-4};
        sum.threeSum(nums);

    }
}
