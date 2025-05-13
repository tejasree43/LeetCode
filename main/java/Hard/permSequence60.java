package Hard;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class permSequence60 {
    List<String> listOfPermutations = new ArrayList();
    public String getPermutation(int n, int k) {

            int[] nums = new int[n];
            int i =0;

            while(i<nums.length){
                nums[i]=i+1;
                i++;
            }

            System.out.println(nums);
            getBacktracking(nums,new ArrayList<>(),k);
            System.out.println(listOfPermutations);
            return listOfPermutations.get(k-1).toString();
    }

        public void getBacktracking(int[] nums, List<Integer> actualList,int k) {

            if(actualList.size()==3) {
                actualList.toString();
                String bd =String.join("",actualList.toString());
                listOfPermutations.add(bd);
                return;
            }


            for(int i = 0 ;i < nums.length;i++)
            {
                if(actualList.contains(nums[i])){
                    continue;
                 }
                actualList.add(nums[i]);
                getBacktracking(nums,actualList,k);
                actualList.remove(actualList.size()-1);

            }

        }
        public static void main(String[] args) {
            permSequence60 ps=new permSequence60();
            int n=3;
            int k=3;
            String output=ps.getPermutation(n,k);
            System.out.println("output"+output);

        }
}
