package Medium;

import java.util.HashSet;
import java.util.PriorityQueue;

public class SmallestNumberinInfiniteSet2336 {

    //own solution
    /*PriorityQueue<Integer> pq =new PriorityQueue<>();
    HashSet<Integer> hs = new HashSet<>();
    int i =1;

    public SmallestNumberinInfiniteSet2336() {
        while(i<1001){
            hs.add(i);
            pq.add(i);
            i++;
        }
    }

    public int popSmallest() {

        int number = pq.peek();
        pq.poll();
        hs.remove(number);
        return number;
    }

    public void addBack(int num) {

        if(!hs.contains(num)){
            hs.add(num);
            pq.add(num);
        }*/

    //without adding the 1000 elements ,updated version
    PriorityQueue<Integer> pq = null;
    int minValue;
    public SmallestNumberinInfiniteSet2336() {
        pq =new PriorityQueue<>();
        minValue = 1;
     }

    public int popSmallest() {

        if(!pq.isEmpty()) {
           return pq.poll();
        }
        minValue++;

        return minValue-1;
    }
    public void addBack(int num) {

       if(minValue>num && !pq.contains(num)){
           pq.offer(num);
       }
    }
    public static void main(String[] args){

      SmallestNumberinInfiniteSet2336 smallestNumber = new SmallestNumberinInfiniteSet2336();
      smallestNumber.addBack(2);
      int popSmall= smallestNumber.popSmallest();
        int popSmall1= smallestNumber.popSmallest();
      System.out.println(popSmall);
        System.out.println(popSmall1);
        int popSmall2 = smallestNumber.popSmallest();
        System.out.println(popSmall2);
        smallestNumber.addBack(1);
        int popSmall3 = smallestNumber.popSmallest();
        System.out.println(popSmall3);


    }
}
