package Medium;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum39 {
    List<List<Integer>> result=new LinkedList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int start=0;
        backtracking(start,new LinkedList<>(),candidates,target);
        System.out.println("result"+result);
        return result;
    }

    private void backtracking(int start, List<Integer> al,int[] candidates,int target) {

       if(target<0){
           return;
       }
       else if (target == 0) {
            result.add(new LinkedList<>(al));
            return;
        } else {
            for (int i = start; i < candidates.length; i++) {
                al.add(candidates[i]);
                backtracking(i, al, candidates, target - candidates[i]);
                al.remove(al.size() - 1);
            }
        }
    }

    public static void main(String[] args){
      CombinationSum39 combinationSum=new CombinationSum39();
      int[]  candidates = {2,3,6,7};
      int target = 7;
      combinationSum.combinationSum(candidates,target);

    }
}
