package Hard;

public class SudokuSolver37 {
    private static final int GRID_SIZE = 9;

    public void solveSudoku(char[][] board) {
       if(board == null || board.length == 0)
            return;
         solveSudokuNow(board);

        }

        private void printBoard(char[][] board) {
            for (int column = 0; column < 9; column++) {
                for (int row = 0; row < 9; row++) {
                    System.out.print(board[column][row]);
                }
                System.out.println();

            }
        }

    private static boolean solveSudokuNow(char[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int column = 0; column < GRID_SIZE; column++) {
                if (board[row][column] == '.') {
                    for(char k='1';k<='9';k++) {
                        if(isValidPlacement(board,k,row,column))
                        {
                            board[row][column]= k;
                            if(solveSudokuNow(board)){
                                return true;
                            }
                            else {
                                board[row][column]= '.';
                                }
                        }
                    }
                   return false;
                }
            }
        }
        return true;
    }
    public static boolean isValid(char[][] board, int row, int col, char k) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[i][col] == k) return true;
            if (board[row][i] == k) return true;
            //Grid compare logic (if you use this line,uncomment the
            // IsNumberInGrid method)
            // if(b[3*(row/3)+i/3][3*(col/3)+i%3] == k)return false;
        }
        return false;
    }
    private static boolean isNumberInRow(char[][] board, char number, int row) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[row][i] == number) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberInColumn(char[][] board, char number, int column) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[i][column] == number) {
                return true;
            }
        }
        return false;
    }
    private static boolean isValidPlacement(char[][] board, char number, int row, int column) {
        return  !isValid(board,row,column,number) &&
                !IsNumberInGrid(board, number, row, column);
    }
   public static boolean IsNumberInGrid(char[][] board, char Number, int row, int column) {

        int rowSize = row - row % 3;
        int columnSize = column - column % 3;

       for (int i= rowSize; i < rowSize + 3; i++) {
           for (int j = columnSize; j < columnSize + 3; j++) {
                    if (Number == board[i][j]) {
                        return true;
                }

            }
        }
        return false;
    }

        public static void main (String[]args){

            SudokuSolver37 ss = new SudokuSolver37();
            char[][] board =
                     {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                    , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                    , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                    , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                    , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                    , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                    , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                    , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                    , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

            ss.solveSudoku(board);
            ss.printBoard(board);

        }
    }

