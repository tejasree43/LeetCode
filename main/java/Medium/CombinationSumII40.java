package Medium;

import java.util.*;

public class CombinationSumII40 {

    List<List<Integer>> output=new LinkedList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);
        int index=0;
        backtracking(candidates,target,new LinkedList<>(), index);
        System.out.println(output);


       return output;
    }

    public void backtracking( int[] candidates, int target,List<Integer> a,int index){

        if(target==0){
            System.out.println("sum"+target);
            output.add(new LinkedList<>(a));
            return;
        }

        for(int i=index; i<candidates.length;i++)
        {
          if(index!=i&&candidates[i]==candidates[i-1])
                continue;

             if(candidates[i] <= target ) {
                a.add(candidates[i]);
                backtracking(candidates,  target -candidates[i], a,index+1);
                a.remove(new Integer(candidates[i]));
            }
        }
    }


    public static void main(String[] args) {

        CombinationSumII40 comsum=new CombinationSumII40();
        int[] nums={10,1,2,7,6,1,5};
        int target=8;

        /*int[]  nums = {2,3,6,7};
        int target = 7;*/
        comsum.combinationSum2(nums,target);

    }
}
