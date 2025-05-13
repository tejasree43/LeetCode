package Easy;
import java.util.*;

public class Permutations47 {

    Set<List<Integer>> result=new HashSet<>();
    public List<List<Integer>> findPermutations(int[] nums)
    {
        List<Integer> dataTree=new LinkedList();
        for(Integer number:nums)
        {
            dataTree.add(number);
        }
        dataFindPermutation(new LinkedList<>(),dataTree);
        List<List<Integer>> finalResult;

        finalResult = new ArrayList(result);

        return finalResult;
    }

    private void dataFindPermutation(LinkedList<Integer> permutation, List<Integer> dataTree) {

        if(dataTree.size()==0)
        {
            result.add(permutation);
            return;
        }
        for(Integer number:dataTree)
        {
            LinkedList<Integer> tempPermutation=new LinkedList<>(permutation);
            LinkedList<Integer> tempDataTree=new LinkedList<>(dataTree);
            tempPermutation.add(number);
            tempDataTree.remove(number);
            dataFindPermutation(tempPermutation,tempDataTree);
        }
    }
    public static void main(String[] args){
        Permutations47 pm=new Permutations47();
        int[] input={1,1,2};
        List<List<Integer>> output= pm.findPermutations(input);
        output.stream().forEach(s->System.out.println(s));
    }


}

