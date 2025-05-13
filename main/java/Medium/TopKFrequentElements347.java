package Medium;


import java.util.*;

public class TopKFrequentElements347 {

      class Pair
      {
       int key;
       int value;
       Pair(int a, int b)
       {
       key=a;
       value=b;
      }
    }

    public int[] topKFrequent(int[] nums, int k) {

        if (nums.length == k) {
            return nums;
        }
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        int count = 0;
        for (int number : nums) {
            if (ht.containsKey(number)) {
                ht.put(number, ht.get(number) + 1);
            } else {
                ht.put(number, count);
            }
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a,b)->(b[1]-a[1]) );


            for(int htKey:ht.keySet())
            {
                pq.add(new int[]{htKey,ht.get(htKey)});

            }
        int[] output=new int[k];
        for(int i=0;i<k;i++)
        {
            output[i]=pq.poll()[0];

        }


     return output;
    }



    public static void main(String[] args)
    {
        TopKFrequentElements347 topKFrequent=new TopKFrequentElements347();
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
      int[] output  =topKFrequent.topKFrequent(nums,k);

      Arrays.stream(output).forEach(y->System.out.println(y));

    }

}
