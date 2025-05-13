package Medium;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingIntervals435 {

    public int eraseOverlapIntervals(int[][] intervals) {


        // Arrays.sort(intervals, (a,b)->Integer.compare(a[1],b[1]));
          Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        //  Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int previous = 0; int count =1;

        for(int i =0;i<intervals.length;i++){

           if(intervals[i][0]>=intervals[previous][1]){

               previous = i;
               count++;
           }


        }

        return intervals.length-count;
    }

public static void main(String[] args){

NonOverlappingIntervals435  overlap = new  NonOverlappingIntervals435();
   // int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};

    int[][] intervals = {{1,100},{11,22},{1,11},{2,12}};


    int output = overlap.eraseOverlapIntervals(intervals);

    System.out.println("output"+output);

}
}
