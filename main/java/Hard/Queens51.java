package Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Queens51 {

    List<List<String>> output=new LinkedList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] chars = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                chars[i][j] ='.';
            }
        }
        backtracking(chars,0,n);
        System.out.println("output"+output);
        return output;
    }

    public void backtracking(char[][] ch,int row, int n) {

        if (row == n)
          {
            output.add(onboard(ch));
            return;
        }
        for (int column = 0; column<n; column++) {
             if(isQueenExistInDiagonal(ch,row,column,n)){
                    ch[row][column]='Q';
                    backtracking(ch, row+1 ,n);
                    ch[row][column]='.';
                }
        }
    }

    private List<String> onboard(char[][] ch) {
        List<String> list=new ArrayList<>();
        for(char[] row:ch){
            list.add(new String(row));

        }
       return list;
    }

    static boolean isQueenExistInDiagonal(char[][] ch,int row, int column,int n) {
        //row check
        for(int i=0;i<n;i++){
            if(ch[i][column]=='Q'){
               // System.out.println("Inside row check");
                return false;
            }
        }
        //column check
        for(int i=0;i<n;i++){
            if(ch[row][i]=='Q'){
                //System.out.println("Inside column check");
                return false;
            }
        }
        //check for 45 degree positions
        for (int i = row,j=column;i>=0&& j>=0; i--,j--) {
                if (ch[i][j] =='Q') {
                    return false;
                }
            }

        //check for 135 positions
        for (int i = row,j=column;i>=0 && j<n ; i--,j++) {
            if (ch[i][j] =='Q') {
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

    public static void main(String[] args)
    {
        int n=4;
        Queens51 queens=new Queens51();
        queens.solveNQueens(n);

    }


}
