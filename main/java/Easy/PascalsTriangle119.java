package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PascalsTriangle119 {
    public List<Integer> getRow(int rowIndex) {
      // List<Integer>  pascalList = new ArrayList<>();

        int[] numsArray = helperMethod(0, rowIndex,new int[1]);

      return  Arrays.stream(numsArray).boxed().collect(Collectors.toList()) ;
    }

    private int[] helperMethod(int rowIndex,int actualIndex,int[] numsArray) {
        if (rowIndex >actualIndex) {
            return numsArray;
        }
       int[]  numsTempArray = new int[rowIndex+1];
        numsTempArray[0]=1;
        numsTempArray[rowIndex]=1;

        for (int i = 0; i < rowIndex+1; i++) {
            if (i == 0 || i == rowIndex) {
                continue;
            } else {
                numsTempArray[i] = numsArray[i-1] + numsArray[i];
            }
        }
  return helperMethod(rowIndex + 1, actualIndex,numsTempArray);

    }
    public static void main(String[] args) {
        PascalsTriangle119 pascal = new PascalsTriangle119();
        int rowIndex = 3;
       List output= pascal.getRow(rowIndex);

       System.out.println(output);
    }

}
