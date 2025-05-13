package HackerRank;

import java.util.LinkedList;
import java.util.List;

public class Boxtheitems {

    List<List<Integer>> result=new LinkedList<>();
    public List<List<Integer>> boxItems(int total, int k){
        int[] nums=new int[k];
        for(int i=0;i<k;i++){
            nums[i]=1+i;
        }
        int start=0;
        backtracking(nums,0,new LinkedList<>(),total);

        System.out.println(result);
       return result;
    }

    private void backtracking(int[] nums, int start,List<Integer> list,int total) {

        if (total == 0) {
            result.add(new LinkedList<>(list));
            return;
        }
        else if(total<0){ //must have condition total - nums[i] may beome -values
            return;
        }
        else {
            for (int i = start; i < nums.length; i++) {

                list.add(nums[i]);
                backtracking(nums, i, list, total - nums[i]);
                list.remove(list.size() - 1);
            }
        }
    }

    public static void main(String[] args){
        Boxtheitems items=new Boxtheitems();
      int total=7;
      int k=2;
        items.boxItems(total,k);

    }
}
