package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class CombinationSumIII216 {

    List<List<Integer>> answer = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int target) {

        //java 8 and above
        int[] numbers = IntStream.range(1, 10).toArray();

        backtracking(numbers,k,target,new ArrayList<>(),0);

        System.out.println("answer"+answer);

        return answer;
    }

    private void backtracking(int[] array, int k, int target, ArrayList<Integer> list,int start) {


     if(list.size()==k)  {
         if(target ==0) {
             answer.add(new ArrayList<>(list));
         }
         return;

     }
     for(int i =0;i<array.length;i++) {
         System.out.println("printing ");
             list.add(array[i]);
             backtracking(array, k, target - array[i], list, i + 1);
             list.remove(list.size() - 1);

         }

     }

    public static void main(String[] args) {

     int  k = 3, target = 7 ;

     CombinationSumIII216 sum = new CombinationSumIII216();
     sum.combinationSum3(k,target);

    }

}
