package Hard;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class StackingCuboids1691 {

    public int maxHeight(int[][] cuboids) {

    //First sort all the dimensions to have the max height as height is the last index.
    for(int[] array: cuboids)  {
        Arrays.sort(array);
        }
    //Then sort according to heights,if same length ,then width
        Arrays.sort(cuboids,new Comparator<int[]>(){
        @Override
        public int compare(int[] a ,int[] b){
            if (a[2]!=b[2]){
                return a[2]-b[2];
            }
            if(a[1]!=b[1]){
                return a[1]-b[1];
            }
            return a[0]-b[0];
        }

    });

    //Then do LIS
        int n = cuboids.length;
        int result = -1;
        int[] dp = new int[n];

        for(int i=0;i<n;i++){

           dp[i] = cuboids[i][2];

           for(int j=0;j<i;j++){

               if(cuboids[i][0]>=cuboids[j][0]&&cuboids[i][1]>=cuboids[j][1])
               {
                   dp[j]=Math.max(dp[i],dp[i]+cuboids[i][2]);
               }
               result= Math.max(dp[j], result);
           }

        }

        System.out.println("result="+result);
        return result;
    }

    public static void main(String[] args){
     //width //length//height
     int[][]  matrix = {{50,45,20},{95,37,53},{45,23,12}};
     StackingCuboids1691 stackCuboids = new StackingCuboids1691();
     stackCuboids.maxHeight(matrix);
    }
}
