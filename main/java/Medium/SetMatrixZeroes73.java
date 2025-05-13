package Medium;

import java.util.HashMap;
import java.util.Hashtable;

public class SetMatrixZeroes73 {
    public void setZeroes(int[][] matrix) {

        int rows=matrix.length;
        int columns=matrix[0].length;
        HashMap<String,Integer> hashTable=new HashMap<>();

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
            int matrixValue=matrix[i][j];
            if(matrixValue==0) {
                hashTable.put(i + ":" + j, i);
            }
            }
        }

        for(String keyValues:hashTable.keySet()){
          String[] result=keyValues.split(":");

          int rowIn0s  =Integer.parseInt(result[0]);
          int columnIn0s  =Integer.parseInt(result[1]);

            for(int i=0;i<rows;i++) {
                matrix[rowIn0s][i]=0;
            }
            for(int j=0;j<columns;j++) {
                matrix[j][columnIn0s]=0;
            }

        }


        System.out.println(hashTable);

    }

    public static void main(String[] args){
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        SetMatrixZeroes73 matrixZones=new SetMatrixZeroes73();
        matrixZones.setZeroes(matrix);
    }
}
