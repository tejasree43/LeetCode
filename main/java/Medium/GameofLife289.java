package Medium;

public class GameofLife289 {

    public void gameOfLife(int[][] board) {

       int rows= board.length;
       int columns= board[0].length;

       System.out.println("rows="+rows +"columns"+columns);

       for(int i =0;i<rows;i++){

         for(int j =0;j<columns;j++){

             int count = isLive(board,i,j);

             if(board[i][j]==0){
                 if(count ==3){
                     board[i][j]=2;
                 }

             }else if(board[i][j]==1){

                 if(count<2||count>3){
                     board[i][j]=3;
                 }
             }

         }

       }
        for(int i =0;i<rows;i++) {

            for (int j = 0; j < columns; j++) {
                if (board[i][j]==2)
                {
                    board[i][j]=1;
                }
               else if (board[i][j]==3)
                {
                    board[i][j]=0;
                }
            }
        }

        for(int[] array:board){
            for(int number : array) {
                System.out.print(number + "");
            }
            System.out.println();

        }

    }

    private int isLive(int[][] board, int i, int j) {

      int liveCount =0;
      int r = board.length;
      int c = board[0].length;

      //Horizontal check
        if(j-1>=0){ //for left side

         if(board[i][j-1]==1||board[i][j-1]==3){
             liveCount++;
         }
        }
        if(j+1<c){ //for right side

            if(board[i][j+1]==1||board[i][j+1]==3){
                liveCount++;
            }
        }
      //vertical
        if(i-1>=0){ //for upside

            if(board[i-1][j]==1||board[i-1][j]==3){
                liveCount++;
            }
        }
        if(i+1<r){ //for downside

            if(board[i+1][j]==1||board[i+1][j]==3){
                liveCount++;
            }
        }
       //For diagonal check

        if(i-1>=0&&j-1>=0){ //for upper leftside

            if(board[i-1][j-1]==1||board[i-1][j-1]==3){
                liveCount++;
            }
        }
        if(i-1>=0 && j+1<c){ //for upper right side

            if(board[i-1][j+1]==1||board[i-1][j+1]==3){
                liveCount++;
            }
        }
        if(i+1<r && j-1>=0){ //for down left side

            if(board[i+1][j-1]==1||board[i+1][j-1]==3){
                liveCount++;
            }
        }
        if( i+1<r && j+1<c){ //for down left side

            if(board[i+1][j+1]==1||board[i+1][j+1]==3){
                liveCount++;
            }
        }
        return liveCount;
    }

    public static void main(String[] args){

       /* 0 1 0
        0 0 1
        1 1 1
        0 0 0*/
     int[][]  board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
     GameofLife289 game = new GameofLife289();
     game.gameOfLife(board);
    }
}
