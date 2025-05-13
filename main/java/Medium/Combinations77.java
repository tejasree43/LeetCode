package Medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Combinations77 {


    List<List<Integer>> result = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {

    /*  int[] nums =new int [n];
      int count =0;
      for(int i=0;i<nums.length;i++) {
          nums[i] =count+1;
          count++;
      }*/
        //short cut to add the n values in backtarcking

        //Taking start as 1 since n starts from 1 which we will take it direct;ing from i
      int start =1;
      backtracking(n,start,new LinkedList<>(),k);

      System.out.println("result"+result);
        return result;
    }

    private void backtracking(int comb,int start, List<Integer> list,int target) {

        if(list.size()==target){
            result.add(new LinkedList<>(list));
            return ;
        }
        else{
            for(int i = start ;i<=comb;i++){
                if(list.contains(i)){
                    return;
                }
                list.add(i);
                backtracking(comb,i+1,list,target);
                list.remove(list.size()-1);

            }
        }
    }

    public static void main(String[] args){
        Combinations77 combination = new Combinations77();
        int n=4; int k=2;
        combination.combine(n,k);

    }
}
