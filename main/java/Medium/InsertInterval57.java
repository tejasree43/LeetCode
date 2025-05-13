package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {

      int n =  intervals.length;

      List<int[]> answer = new ArrayList<>();
      System.out.println("first"+n);

      int i =0;

      while(i<intervals.length){

          if(intervals[i][1] <newInterval[0]){
              answer.add(intervals[i]);
          }
          else if (intervals[i][0]>newInterval[1]){
              break;
          }
          else {
              newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
              newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
          }

       i++;
      }
        answer.add(newInterval);

      if(i<n){
          answer.add(intervals[i++]);
      }

        return answer.toArray(new int[0][]);
    }
    public static void main(String[] args) {

        InsertInterval57 insertIntervals=new InsertInterval57();
       // int[][] nums={{1,3},{6,9}};
        //int[] newInterval={2,5};

        int[][] nums = {{1,2},{3,5},{6,7},{8,10},{12,16}};
         int[] newInterval={4,8};
         int[][] result =  insertIntervals.insert(nums,newInterval);

        Arrays.stream(result).forEach(x->Arrays.stream(x).forEach(System.out::println));
    }
    }

    //time complexity of the program is O(N), as the dominant factor is the single pass over the intervals array.
    //the overall space complexity of the program is O(N), as it depends on the size of the answer list.