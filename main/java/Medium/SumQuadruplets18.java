package Medium;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SumQuadruplets18 {

    List<List<Integer>> result=new LinkedList<>();
    public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);
        backtracking(new LinkedList<>(),nums,target,0);

        System.out.println(result);

        return result;
    }


    public void backtracking(List<Integer> al,int[] nums,int target,int start){


        if(al.size()==4&&target==0){
            result.add(new LinkedList<>(al));
            return;
        }

        for(int i=start;i<nums.length;i++){

           if(start<i&&nums[i]==nums[i-1]){
            continue;
            }

            if(al.size()<=4) {
                al.add(nums[i]);
                backtracking(al, nums, target - nums[i], i+1);
                al.remove(al.size() - 1);
            }

            //}

        }


    }

    public static void main(String[] args) {
        SumQuadruplets18 quadruplet=new SumQuadruplets18();
        int[] nums={1,0,-1,0,-2,2};
        int target = 0;
        quadruplet.fourSum(nums,target);

    }

}
