package Medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SubsetsII90 {

    List<List<Integer>> output=new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {

       Arrays.sort(nums);
      //  int start=0;
        backtracking(0,nums,new LinkedList<>());
        System.out.println(output);


        return output;
    }

    public void backtracking( int start,int[] nums,List<Integer> a) {


            output.add(new LinkedList<>(a));
            for (int i = start; i < nums.length; i++) {
               if (i>start&&nums[i]==nums[i-1]) continue;
               // skip duplicates
                a.add(nums[i]);
                backtracking(i+1,nums, a);
                a.remove(a.size() - 1);
            }
    }
    public static void main(String[] args) {

        SubsetsII90 subsets=new SubsetsII90();
        int[] nums={4,4,4,1,4};

        subsets.permute(nums);

    }
}
