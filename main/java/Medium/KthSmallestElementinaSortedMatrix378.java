package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KthSmallestElementinaSortedMatrix378 {

    public int kthSmallest(int[][] matrix, int k) {

        int rows= matrix.length;
        int columns= matrix[0].length;
/*
        int[] result = new int[rows*columns];
        int temp =0;
        for(int i=0;i<rows;i++){
             for(int j=0;j<columns;j++) {
                 result[temp]=matrix[i][j];
                 temp++;
             }
        }
        Arrays.sort(result);
      return result[k-1];*/
        List<Integer> fl = new ArrayList<>();

        for(int[] row : matrix){
            for(int e : row){
                fl.add(e);
            }
        }
        Collections.sort(fl);
        return fl.get(k-1);
    }
    public static void main(String[] args){

      int matrix[][] = {{1,5,9},{10,11,13},{12,13,15}};
      int k = 8;
      KthSmallestElementinaSortedMatrix378 kthSmallest= new KthSmallestElementinaSortedMatrix378();
      int output = kthSmallest.kthSmallest(matrix,k);
      System.out.println(output);
    }
}
