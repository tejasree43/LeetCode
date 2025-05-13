package Easy;

import java.util.LinkedList;
import java.util.List;

public class NextPermutation31 {
        List<List<Integer>> result=new LinkedList<>();
        public List<List<Integer>> findPermulations(int[] nums)
        {
            List<Integer> dataTree=new LinkedList();
            for(Integer number:nums)
            {
                dataTree.add(number);
            }
            List<List<Integer>>op=dataFindPermutation(new LinkedList<>(),dataTree,dataTree);
            op.stream().forEach(s->System.out.println(s));

            return result;

        }

        private List<List<Integer>> dataFindPermutation(LinkedList<Integer> permutation, List<Integer> dataTree,List<Integer> originalDataTree) {

            System.out.println("method dataFindPermutation");
            permutation.stream().forEach(i->System.out.println("permutation values="+i));
            dataTree.stream().forEach(j->System.out.println("dataTree="+j));//value 3 left

            if((dataTree.size()==0))
            {
                System.out.println("if loop");
                  result.add(permutation);
                return result;
            }
            if(result.size()<1) {
                //     for (Integer number : dataTree) {

                for (int i = 0; i<dataTree.size()-1; i++){
                System.out.println("for loop loop number" + dataTree.get(i));
                LinkedList<Integer> tempPermutation = new LinkedList<>(permutation);
                LinkedList<Integer> tempDataTree = new LinkedList<>(dataTree);
                tempPermutation.add(dataTree.get(i));
                tempDataTree.remove(dataTree.get(i));
                System.out.println("before recursive call");
                dataFindPermutation(tempPermutation, tempDataTree, originalDataTree);
                System.out.println("after recursive call");
            }
            }
            return result;
        }
        public static void main(String[] args){
            NextPermutation31 pm=new NextPermutation31();
            int[] input={1,2,3};
            List<List<Integer>>  output= pm.findPermulations(input);
            output.stream().forEach(s->System.out.println(s));

        }


    }


//
/*Example 1:
Input: nums = [1,2,3]
Output: [1,3,2]*/
