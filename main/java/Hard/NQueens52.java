package Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class NQueens52 {


    List<List<String>> result = new ArrayList<>();
    public int totalNQueens(int n) {

     char[][] ch =  new char[n][n];

        for(int i =0;i<ch.length;i++) {
            for (int j = 0; j < ch[0].length; j++) {
              ch[i][j]='.';
            }
        }

        int start = 0;
        backtracking(start,ch,n);
        printBoard(ch,n);
        System.out.println(result);

        return result.size();
    }

    public void backtracking(int start, char[][] ch,int n) {

        if (start == n) {
            result.add(rowStringBoard(ch));
            return;
        }

        for (int i = start; i < ch.length; i++) {
            for (int j = 0; j < ch[0].length; j++) {
                if (placeIsSafeForQueen(i, j, ch)) {
                    ch[i][j] = 'Q';
                    backtracking(start + 1, ch, n);
                    ch[i][j] = '.';
                }
            }

        }
    }
    public List<String> rowStringBoard(char[][] board){

        List<String>  list = new ArrayList<>();
        for(char[] row :board){
            list.add(new String(row)) ;
        }
       return list;
    }

    private boolean placeIsSafeForQueen(int row, int column, char[][] ch) {
       //row check
       for(int j=0;j<ch.length;j++){
         if(ch[row][j]=='Q')  {
             return false;
         }
       }
       //column check
        for(int i=0;i<ch.length;i++){
            if(ch[i][column]=='Q')  {
                return false;
            }
        }

        for(int i=row,j=column;i>=0&&j>=0;i--,j--) {
           // System.out.println(i + " " + j);
            if (ch[i][j] == 'Q') {
                return false;
            }
        }
        for(int i=row,j=column;i>=0&&j<ch.length;i--,j++) {
           // System.out.println(i + " " + j);
            if (ch[i][j] == 'Q') {
                return false;
            }
        }


        return true;
    }

    static void printBoard(char[][] chessboard,int n) {
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                System.out.print(chessboard[x][y]+" ");
            }
            System.out.println();

        }
    }

    public static void main(String [] args){

       int  n = 4;
       NQueens52 queens = new NQueens52();
       int size =  queens.totalNQueens(n);

       System.out.println("size"+size);
    }
}
