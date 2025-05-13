package Basics;

import java.util.PriorityQueue;

public class ProrityQueueDemo {


    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue();
        pq.add(10);
        pq.add(8);
        pq.add(5);
        pq.add(3);
        pq.add(2);
        pq.add(7);
        pq.add(6);

        //pq.iterator().forEachRemaining(System.out::println);
        System.out.println(pq);
        while(pq.size()>0){

            System.out.println(pq.remove());
        }
    }
}
