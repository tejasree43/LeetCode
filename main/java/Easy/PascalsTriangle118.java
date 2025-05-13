package Easy;

import java.util.*;
import java.util.stream.Collectors;

public class PascalsTriangle118 {

    public List<List<Integer>> generate(int numRows) {

        //with DP solution
        int[][] pascal = new int[numRows][];
        for (int i = 0; i < numRows; i++) {
            int[] row = new int[i + 1];
            row[0] = 1;
            row[i] = 1;
            for (int j = 1; j < i; j++) {
                row[j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
            pascal[i] = row;
        }
        //Convert the 2d array into a stream.
        //Map each 1d array (internalArray) in 2d array to a List.
        //Stream all the elements of each 1d array and put them into a list of Integer.
        //Put all the lists from the previous step into one big list.
        List<List<Integer>> integerLists =
                Arrays.stream(pascal).map(
                        internalArray -> Arrays.stream(internalArray).boxed().collect(Collectors.toList()
                        )
                ).collect(Collectors.toList());

        return integerLists;

        //Brute Force Approach
        /*List<List<Integer>> alList = new LinkedList<>();
        int[][] pas = new int[numRows][numRows];
        int i = 0, j = 0;
        while (i < numRows) {
            pas[i][0] = 1;
            while (j <= i) {
                pas[i][j] = 1;
                j++;
            }
            i++;
        }

        int start = 0;
        while (start < numRows) {
            int l = 1;
            while (start > 1) {
                pas[start][l] = pas[start - 1][l - 1] + pas[start - 1][l];
                if (pas[start - 1][l] == 1) {
                    break;
                }
                l++;
            }
            start++;
        }

        List<Integer> tempList;

        for (int x = 0; x < numRows; x++) {
            tempList = new LinkedList<>();
            for (int y = 0; y <= x; y++) {
                int number = pas[x][y];
                tempList.add(number);
            }
            alList.add(tempList);
        }
        return alList;*/
    }

    public static void main(String[] args) {
        int numRows = 5;
        PascalsTriangle118 pt = new PascalsTriangle118();
        List<List<Integer>> output = pt.generate(numRows);
        output.stream().forEach(s -> System.out.println(s));
    }


}
