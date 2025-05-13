package Hard;

public class sudokuSolverV37 {
    public void solveSudoku(char[][] board) {
        if(board == null || board.length == 0)
            return;
        f(board);
    }
    public boolean f(char[][] b){
        for(int i=0;i<9;i++){

            for(int j=0;j<9;j++){
                if(b[i][j]=='.'){
                    for(char k='1';k<='9';k++){
                        if(isValid(b,i,j,k)){
                            b[i][j]=k;
                            if(f(b))return true;
                            else b[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isValid(char[][] b,int row,int col,char k){
        for(int i=0;i<9;i++){
            if(b[i][col]==k)return false;
            if(b[row][i]==k)return false;
            if(b[3*(row/3)+i/3][3*(col/3)+i%3] == k)return false;
        }
        return true;
    }
    private void printBoard(char[][] board,int GRID_SIZE) {
        for (int column = 0; column < GRID_SIZE; column++) {
            for (int row = 0; row < GRID_SIZE; row++) {
                System.out.print(board[column][row]);
            }
            System.out.println();

        }
    }
    public static void main (String[]args){

        sudokuSolverV37 ss = new sudokuSolverV37();
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
        int GRID_SIZE=9;
        ss. printBoard(board,GRID_SIZE);

    }

}
