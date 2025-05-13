package Medium;

import Easy.IsSubsequence392;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class PerfectSquares279 {

    public int numSquares(int n) {

     /*int dp[] =new int [n+1];
     Arrays.fill(dp,n);
     dp[0]=0;
     for(int i=0;i<dp.length;i++) {

         for (int j = 1; j < i+1 ; j++) {

             int square = j * j;

             if (i - square < 0) {
                 break;
             } else {
                 dp[i] = Math.min(dp[i], 1 + dp[i - square]);
             }

         }
     }
     return dp[n];*/
     //dp solution

        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);

        HashSet<Integer> visit = new HashSet<>();
        int count =0;

        while(!queue.isEmpty()){

        int i = queue.size();

        while(i>0){
         int value = queue.poll();

         int div =(int)Math.sqrt(value);

         for(int j=1;j<=div;j++){

             int square =j*j;
             if(value -square==0 ){
                 return count+1;
             }
             else if(visit.add(value -square)){
                 queue.add(value -square);
             }


         }
            i--;
        }
            count++;

        }


        return count;
    }

    public static void main(String[] args) {
         int  n = 13;
        PerfectSquares279 perfectSquares = new PerfectSquares279();
        int output = perfectSquares.numSquares(n);

        System.out.println("output" + output);
    }

}
