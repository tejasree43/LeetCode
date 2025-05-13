package Hard;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRooms2402 {

    public int mostBooked(int n, int[][] meetings) {

        Arrays.sort(meetings,(a,b)->a[0]-b[0]);
        PriorityQueue<long[]> queue = new PriorityQueue<>((a,b)->(a[0]==b[0])? (int)(a[1]-b[1]):(int)(a[0]-b[0]));

        int[] roomCount = new int[n];

        for(int i=0;i<n;i++){
            queue.add(new long[]{0,i});

        }
        int result = 0;
        for(int[] item :meetings){

        int time = item[0] ; //start time for every meeting

            while(queue.peek()[0]<time) {
                queue.add(new long[]{time, queue.poll()[1]});
            }
                long[] current = queue.poll();
                int cuurentRoom = (int) current[1];
                long meetingTime =  current[0]+(item[1]-item[0]);
                roomCount[cuurentRoom]++;

                if(roomCount[cuurentRoom]>roomCount[result]){
                  // result =
                }
        }
        System.out.println("executing");
        return n;
    }

    public static void main(String[] args){
       int n = 2;
        int[][] meetings = {{0,10},{1,5},{2,7},{3,4}};

        MeetingRooms2402 meetingRooms = new MeetingRooms2402();
        meetingRooms.mostBooked(n,meetings);

    }
}
