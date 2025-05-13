package Basics;

public class diagonalCheck {

    public boolean arrayDiagonal(int[][] nums,int n){

        int row=2;int column=2;
        boolean IsNumberSafe  =IsNumberSafe(nums, row, column,n);
       // System.out.println("IsNumberSafe"+IsNumberSafe);

      /*  for(int row=0;row<n;row++){

            for(int column=0;column<n;column++){

                boolean IsNumberSafe  =IsNumberSafe(nums, row, column,n);
              System.out.println("IsNumberSafe"+IsNumberSafe);
            }

        }
*/
        return true;
    }
    public boolean IsNumberSafe(int[][] nums,int row,int column,int n) {
        //row check
       /* for (int i = row; i < n; i++) {

            if(nums[column][i]==0){
                return false;
            }

        }*/
       /* for (int i = column; i < n; i++) {

            if(nums[i][row]==0){
                return false;
            }

        }*/

     /* for(int i=row,j=column;i>=0&&j>=0;i--,j--){

          System.out.println(i + ""+j);
              if(nums[i][j]==0) {
                  return false;
              }

           }*/
        for (int i = row,j=column;i>=0 && j<n ; i--,j++) {
            if (nums[i][j] =='Q') {
                return false;
            }
        }
       /* for(int i=row,j=column;j<n&&i>=0;i--,j++){

            if(nums[i][j]==0) {
                return false;
            }

        }
*/
        return true;
    }
    public static void main(String[] args){

        int[][] nums={{1,2,3,4 },
                      {5,6,7,8  },
                      {9,10,11,12 },
                      {13,14,15,16}};
         int n=4;
        printChessBoard(nums,n);
        diagonalCheck dc=new diagonalCheck();
        dc.arrayDiagonal(nums, n);

    }

    private static void printChessBoard(int[][] nums,int n) {
        for (int row=0;row<n;row++)
        {
            for(int column=0;column<n;column++)
            {
                System.out.print(nums[row][column]);
            }
            System.out.println();
        }
    }
}
