package Medium;

public class ValidSudoku36 {

        public boolean isValidSudoku(char[][] board) {
            int GRID_SIZE = 9;
            System.out.println("board.length=" + board.length);

            for (int row = 0; row < GRID_SIZE; row++) {
                for (int column = 0; column < GRID_SIZE; column++) {
                    char Number = board[row][column];
                     System.out.println("Number="+Number);
                     if(Number!='.') {
                      boolean isNumberInRow  = isNumberInRow(board, Number, GRID_SIZE, row,column);
                      boolean isNumberInColumn =isNumberInColumn(board, Number, GRID_SIZE, column,row);
                      boolean isNumberInGridBox =isNumberInGridBox(board, Number, row,column);
                      if(isNumberInRow||isNumberInColumn||isNumberInGridBox){
                          return false;
                      }
                     }
                     }
                }
            return true;
        }

            private static boolean isNumberInRow(char[][] board,char Number,int GRID_SIZE,int row,int column)
            {
                    for(int j=0;j<GRID_SIZE;j++) {
                        char boardNumber=board[row][j];
                        if (Number == boardNumber&&column!=j) {
                            return true;
                        }
                    }
                return false;
            }
    private static boolean isNumberInColumn(char[][] board,char Number,int GRID_SIZE,int column,int row)
    {
        for(int j=0;j<GRID_SIZE;j++) {
            if (Number == board[j][column]&&row!=j) {
                return true;
            }
        }
        return false;
    }
    private static boolean isNumberInGridBox(char[][] board,char Number,int row,int column) {
        int rowSize = row - row % 3;
        int columnSize = column - column % 3;

        for (int i = rowSize; i < rowSize+3; i++) {
            for (int j = columnSize; j < columnSize+3; j++) {
                char currentBoardValue= board[i][j];
                if (Number == currentBoardValue && row != i && column != j) {
                    return true;
                }
            }
        }
        return false;
    }

        public static void main(String[] args)
        {

        ValidSudoku36 vs = new ValidSudoku36();
        char[][] board =
                          {{'8', '3','.', '.', '7', '.', '.', '.', '.'}
                        , {'6', '.','.', '1', '9', '5', '.', '.', '.'}
                        , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                        , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                        , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                        , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                        , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                        , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                        , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

         boolean output=vs.isValidSudoku(board);
         System.out.println("output"+output);
    }
}