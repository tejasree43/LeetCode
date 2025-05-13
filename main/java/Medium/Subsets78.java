package Medium;

import Basics.RecursionBasicFlow;

import java.util.LinkedList;
import java.util.List;

public class Subsets78 {

    List<List<Integer>> output=new LinkedList<>();

    public List<List<Integer>> subsets(int[] nums) {
       int startIndex=0;
       backTracking (nums,startIndex,new LinkedList<>());
       //System.out.println("output"+output);
       return output;
    }

    private void backTracking(int[] nums, int startIndex, List<Integer> list) {

        if(startIndex<=nums.length){
            System.out.println("Inside loop"+list);
             output.add(new LinkedList<>(list));
        }

        for(int i=startIndex;i<nums.length;i++){
            list.add(nums[i]);
            backTracking (nums,i+1,list);
            list.remove(new Integer(nums[i]));

        }


    }

    public static void main(String[] args) {
        Subsets78 rbf=new Subsets78();
        int[] nums={1,2,3};
        rbf.subsets(nums);

    }
}
