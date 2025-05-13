package Medium;


public class RotateImage48 {

    public void rotate(int[][] matrix) {
        int n=matrix.length-1;
        for(int c=0;c<matrix.length;c++){
            for(int row=c;row<matrix.length;row++){
              swap(matrix,row,c);
            }
        }
        printMatrix(matrix);

        System.out.println();
        int i=0;int j=0;

      while(i<matrix.length){
            j=0;
            while(j<=n-j){
                int temp = matrix[i][j];
                matrix[i][j] =matrix[i][n-j];
                matrix[i][n-j] = temp;
               // swap(matrix,matrix[i][j],matrix[i][n-j]);

                j++;
          }
            i++;
        }

       printMatrix(matrix);
    }

    private void swap(int[][] matrix, int row, int c) {

        int temp=matrix[row][c];
        matrix[row][c]=matrix[c][row];
        matrix[c][row]=temp;
    }
    private static void printMatrix(int[][] matrix) {
        for (int row=0;row<matrix.length;row++)
        {
            for(int column=0;column<matrix.length;column++)
            {
                System.out.print(matrix[row][column]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        RotateImage48 rotateImage=new RotateImage48();
       int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        //int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotateImage.rotate(matrix);
    }
}
