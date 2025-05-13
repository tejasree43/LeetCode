package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals56 {

    public int[][] merge(int[][] intervals) {

        List<int[]> answer = new ArrayList<>();

        if (intervals.length != 0 && intervals != null) {
            Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
            Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        }
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int[] interval : intervals) {
            if (interval[0] <= end) {
                end = Math.max(interval[1],end);
            }
            else{
                answer.add(new int[]{start,end});
                start =interval[0];
                end = interval[1];
            }
        }
        answer.add(new int[]{start,end});

        return answer.toArray(new int[0][]);
    }




    public static void main(String[] args){

    MergeIntervals56 mergeIntervals56=new MergeIntervals56();
    int[][] nums={{1,3},{2,6},{8,10},{15,18}};
        int[][] output=mergeIntervals56.merge(nums);

      /* for(int[] n:output){
           for(int number:n) {
               System.out.println(number);
           }
       }*/

        Arrays.stream(output).forEach(x->Arrays.stream(x).forEach(System.out::println));
    }
}
