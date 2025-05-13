package Medium;

import java.util.PriorityQueue;

public class TotalCosttoHireKWorkers2462 {


    public long totalCost(int[] costs, int k, int candidates) {

        long cost = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();

        int i =0;
        int j = costs.length-1;
        while(k-- >0){

            while (pq.size() < candidates && i <= j) {
                pq.offer(costs[i++]);
            }

            while (pq1.size() < candidates && i <= j) {
                pq1.offer(costs[j--]);
            }

           /* int startNumber =  Integer.MAX_VALUE;
            int endNumber =  Integer.MAX_VALUE;*/

           /* if(pq.size()>0){

                startNumber = pq.peek();
            }
            if(pq1.size()>0){
                endNumber = pq1.peek();
            }*/

            int startNumber = pq.size() > 0 ? pq.peek() : Integer.MAX_VALUE;
            int endNumber = pq1.size() > 0 ? pq1.peek() : Integer.MAX_VALUE;


            if( startNumber <= endNumber){
                cost +=  pq.poll();
            } else{
                cost +=  pq1.poll();
            }

        }

        return cost;
    }

    public static void main(String[] args)
    {
       int[] costs = {57,33,26,76,14,67,24,90,72,37,30};
       int k = 11 ;
       int candidates = 2;


       /* int[] costs = {31,25,72,79,74,65,84,91,18,59,27,9,81,33,17,58};
        int k = 11;
        int candidates =
                2;*/
       TotalCosttoHireKWorkers2462  hireWorkers = new TotalCosttoHireKWorkers2462();
       long output =hireWorkers.totalCost(costs,k,candidates);

       System.out.println("output"+output);


    }
}
