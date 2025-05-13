package Easy;

public class MatrixDiagonalSum1572 {
    public int diagonalSum(int[][] matrix) {

      //  Brute Force approach
 /*       int rows = matrix.length;
        int columns = matrix[0].length;
        Boolean[][] dp = new Boolean[rows][columns];

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
             dp[i][j]=false;
            }
        }
        System.out.println("rows"+rows);
        //first diagonal

        int sum = 0;
        for (int i = 0, j = 0; i < rows && j < columns; i++, j++) {

            dp[i][j] = true;
            sum += matrix[i][j];
            System.out.println("sum"+sum);
        }
        //second digonal
        for (int i =0, j=columns-1;  i>=0 && j>=0; i++, j--) {

           if(!dp[i][j]) {
               sum += matrix[i][j];
            }
            System.out.println("sum"+sum);
        }

        return sum;*/

        int columns = matrix[0].length;
        int sum =0;
        for(int i=0,j=columns-1;i>=0&&j>=0;i++,j--){
            sum+= matrix[i][i];//first diagonal
            sum+= matrix[i][j];//second diagonal
           // if first and second meets
             if(i==j){
             sum-= matrix[i][j];
             }
            System.out.println("sum"+sum);
        }

        return sum;
    }

    public static void main(String[] args) {

       int[][] matrix = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
      /*  int[][] matrix= {{1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}};*/
        MatrixDiagonalSum1572 diagonal = new MatrixDiagonalSum1572();
        diagonal.diagonalSum(matrix);
    }
}
