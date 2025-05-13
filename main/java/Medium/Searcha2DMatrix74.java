package Medium;

public class Searcha2DMatrix74 {


        public boolean searchMatrix(int[][] matrix, int target) {

         /*   int rows = matrix.length;
            int columns = matrix[0].length;

            for (int i = 0; i < rows; i++) {
                int rowLastValue = matrix[i][columns - 1];
                if (target < rowLastValue) {
                    for (int j = 0; j < columns; j++) {
                        if (matrix[i][j] == target) {
                            return true;
                        }
                    }
                }

            }
            return false;*/

               int i = 0, j = matrix[0].length - 1;
                while(i < matrix.length && j >= 0) {
                   if(matrix[i][j] == target)
                   return true;
                    else if(matrix[i][j] > target)
                    j --;
                else if(matrix[i][j] < target)
                    i ++;
                }
                return false;
              }
        public static void main(String[] args){
       /* int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;*/
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 13;
        Searcha2DMatrix74 searchMatrix = new Searcha2DMatrix74();
        boolean output= searchMatrix.searchMatrix(matrix,target);
        System.out.println("output"+output);
        }

    }
