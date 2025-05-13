package Medium;

import java.util.LinkedList;
import java.util.List;

public class Permutations46 {

    List<List<Integer>> result=new LinkedList<>();
    public List<List<Integer>> findPermulations(int[] nums)
    {
        List<Integer> dataTree=new LinkedList();
        for(Integer number:nums)
        {
            dataTree.add(number);
        }
      //  dataTree.stream().forEach(s->System.out.println(s));
        dataFindPermutation(new LinkedList<>(),dataTree);

        return result;
    }

    private void dataFindPermutation(LinkedList<Integer> permutation, List<Integer> dataTree) {

       // System.out.println("method dataFindPermutation");
       // permutation.stream().forEach(i->System.out.println("permutation values="+i));
       // dataTree.stream().forEach(j->System.out.println("dataTree="+j));//value 3 left

        if(dataTree.size()==0)
        {

            System.out.println("permutation collected");
            result.add(permutation);
            return;
        }
        for(Integer number:dataTree)
        {
            System.out.println("for loop loop number"+number);
            LinkedList<Integer> tempPermutation=new LinkedList<>(permutation);
            LinkedList<Integer> tempDataTree=new LinkedList<>(dataTree);
           // tempPermutation.stream().forEach(i->System.out.println("tempPermutation values before add="+i));
           // tempDataTree.stream().forEach(j->System.out.println("tempDataTree before remove="+j));
            tempPermutation.add(number);
            tempDataTree.remove(number);
            // System.out.println("before recursive call");
            dataFindPermutation(tempPermutation,tempDataTree);
            //System.out.println("after recursive call");
        }
    }
    public static void main(String[] args){
        Permutations46 pm=new Permutations46();
        int[] input={1,2,3};
       // int[] input={1,1,1,2,2,2};
        List<List<Integer>> output= pm.findPermulations(input);
        output.stream().forEach(s->System.out.println(s));
    }


}
