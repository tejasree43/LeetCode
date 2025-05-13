package Medium;

import java.util.PriorityQueue;

public class KthLargestElementinanArray215 {

    public int findKthLargest(int[] nums, int k) {

      PriorityQueue<Integer>  pq=new PriorityQueue<>(nums.length,(a,b)->b-a);

      for(int number:nums){

          pq.add(number);
      }
      int kthLargestElement=0;

      int i=1;
      while(pq.size()>0){
          kthLargestElement=pq.remove();
          if(i==k) {
              break;
          }
          i++;
      }

      System.out.println(kthLargestElement);
        return kthLargestElement;
    }

    public static void main(String[] args){
      int[]  nums = {3,2,1,5,6,4};
      int k = 2;
      KthLargestElementinanArray215 kthLargestElement=new KthLargestElementinanArray215();
      kthLargestElement.findKthLargest(nums,k);
    }
}
