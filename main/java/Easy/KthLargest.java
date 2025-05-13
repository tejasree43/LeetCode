package Easy;

import java.util.*;

public class KthLargest {

    int target;

    PriorityQueue<Integer> pq = new PriorityQueue<>();
    public KthLargest(int k, int[] nums) {

        for(int number:nums) {
            pq.add(number);
        }
        this.target = k;

    }

    public int add(int val) {

        pq.add(val);

        while(pq.size()>target){
            pq.poll();
        }
        int output =  pq.peek() ;
        System.out.println(output);

        return output;
    }

    public static void main(String[] args )
    {
        int k=3;
        int[] nums={ 4, 5, 8, 2};

        KthLargest kth = new KthLargest(k,nums);
        kth.add(3);
        kth.add(5);
        kth.add(10);
        kth.add(9);
        kth.add(4);
    }

}
