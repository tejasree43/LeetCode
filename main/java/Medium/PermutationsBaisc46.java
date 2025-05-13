package Medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PermutationsBaisc46 {
    List<List<Integer>> output=new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {

        backtracking(nums,new LinkedList<>());
        System.out.println(output);


        return output;
    }

    public void backtracking( int[] nums,List<Integer> a) {

        if (a.size() == nums.length) {
            System.out.println("sum" + a);
            output.add(new LinkedList<>(a));
            return;
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (a.contains(nums[i])) continue; // element already exists, skip

                a.add(nums[i]);
                backtracking(nums, a);
                a.remove(a.size() - 1);
            }
        }
    }
    public static void main(String[] args) {

        PermutationsBaisc46 permutations=new PermutationsBaisc46();
        int[] nums={1,2,3};

        permutations.permute(nums);

    }
}
