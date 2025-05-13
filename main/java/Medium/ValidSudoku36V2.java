package Medium;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku36V2 {
    public boolean isValidSudokuSet(char[][] board) {
        Set<String> set = new HashSet<>();
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                char number = board[row][column];
                if (number != '.') {
                    if (!set.add(number + " in row " + row) ||
                            !set.add(number + " in column " + column) ||
                            !set.add(number + " in block " + (row/3) + "," + (column/3)))
                        return false;
                }
                System.out.println(set);
            }
        }
        return true;
    }

    public static void main(String[] args)
    {

        ValidSudoku36V2 vs2 = new ValidSudoku36V2();
        char[][] board =
                         {{'5', '3','.', '.', '7', '.', '.', '.', '.'}
                        , {'6', '.','.', '1', '9', '5', '.', '.', '.'}
                        , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                        , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                        , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                        , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                        , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                        , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                        , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        boolean output=vs2.isValidSudokuSet(board);
        System.out.println("output"+output);
    }
}
