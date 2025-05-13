package Easy;


import java.util.LinkedList;
import java.util.Queue;

class RecentCounter933 {

        int timeFrame = 3000;

        Queue<Integer> queue;

        public RecentCounter933() {

            queue = new LinkedList<>();

        }

        public int ping(int t) {
            queue.add(t);

            System.out.println("peak"+queue.peek());
            System.out.println(t-3000);

            while(queue.peek()<t-3000){
                queue.poll();
            }
          System.out.println(queue.size());
            return queue.size();
        }

        public static void main(String[] args) {

            RecentCounter933 recentCounter933 = new RecentCounter933();
         /*   recentCounter933.ping(1);
            recentCounter933.ping(100);
            recentCounter933.ping(3001);
            recentCounter933.ping(3002);*/


            recentCounter933.ping(642);
            recentCounter933.ping(1849);
            recentCounter933.ping(4921) ;
            recentCounter933.ping(5936) ;
            recentCounter933.ping(5957);
//[[],[642],[1849],[4921],[5936],[5957]]

        }

}
