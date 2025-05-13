package Medium;

import java.util.LinkedList;
import java.util.List;

public class Permutations47Basic {
    List<List<Integer>> output=new LinkedList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {

        backtracking(nums,new LinkedList<>(),new boolean[nums.length]);
        System.out.println(output);


        return output;
    }

    public void backtracking( int[] nums,List<Integer> a,boolean[] used) {

        if (a.size() == nums.length) {
            System.out.println("sum" + a);
            output.add(new LinkedList<>(a));
            return;
        } else {
            for (int i = 0; i < nums.length; i++) {
             // if (a.contains(nums[i])) continue; // element already exists, skip
                if (used[i]||(i>0&&nums[i]==nums[i-1]&&used[i-1])) continue;

                used[i]=true;
                a.add(nums[i]);
                backtracking(nums, a,used);
                used[i]=false;
                a.remove(a.size() - 1);
            }
        }
    }
    public static void main(String[] args) {

        Permutations47Basic permutations=new Permutations47Basic();
        int[] nums={1,1,2};

        permutations.permuteUnique(nums);

    }
}
