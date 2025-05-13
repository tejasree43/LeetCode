package Easy;

import java.util.LinkedList;
import java.util.Queue;

public class TimeNeededtoBuyTickets2073 {

    public int timeRequiredToBuy(int[] tickets, int k) {

        int i=0;int j=0;
        int second=0;
        while(tickets[k]>0){

            j=0;
            while(j<tickets.length) {

                if(tickets[j]>0&&tickets[k]!=0) {
                    tickets[j] = tickets[j] - 1;
                    second++;
                }
                j++;
            }
        }

        System.out.println(second);

        return second;
    }


    public static void main(String[] args) {

   /*   int[] tickets = {2,3,2};
    int k = 2;*/
      // int[] tickets ={5,1,1,1};
         //       int k= 0;
        int[] tickets ={2,6,3,4,5};
        int k=2;

        TimeNeededtoBuyTickets2073 timeNeed=new TimeNeededtoBuyTickets2073();
        timeNeed. timeRequiredToBuy(tickets,k);
    }
}
