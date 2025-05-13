package Easy;

import java.util.*;

public class KthLargestElement703 {

    int target;

    List<Integer> list = new ArrayList<>();
    public KthLargestElement703(int k, int[] nums) {

       for(int number:nums) {
           list.add(number);
       }
       this.target = k;

    }

    public int add(int val) {

        list.add(val);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
               if(a!=b){
                   return b-a;
               }
                    return a-b;

            }
        });

        int output = list.get(target-1);
        return output;
    }

    public static void main(String[] args )
    {
        int k=3;
        int[] nums={ 4, 5, 8, 2};

    KthLargestElement703 kth = new KthLargestElement703(k,nums);
        kth.add(3);
        kth.add(5);
        kth.add(10);
        kth.add(9);
        kth.add(4);
    }

}
