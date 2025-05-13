package Medium;

public class MinimumPathSum64 {

   // Time complexity:
    //O(n^2) Since we visit all element of the matrix.
    public int minPathSum(int[][] grid) {

        int row=grid.length;
        int columns=grid[0].length;

        if(row==0||columns==0){
            return grid[row][columns];
        }

        for(int i=1;i<row;i++){
            grid[i][0]+=grid[i-1][0];
        }
        for(int j=1;j<columns;j++){
            grid[0][j]+=grid[0][j-1];
        }

    for(int i=1;i<row;i++){

        for(int j=1;j<columns;j++){

            grid[i][j]+=Math.min(grid[i][j-1],grid[i-1][j]);
        }
    }


        return grid[row-1][columns-1];
    }

    public static void main(String args[]){

       //int[][]  grid = {{1,3,1},{1,5,1},{4,2,1}};
      //  int[][]  grid ={{1,2,3},{4,5,6}};
       int[][]  grid ={{1}};
     //   int[][]  grid ={{1,2}};
        //int[][]  grid ={{9,1,4,8}};
        MinimumPathSum64 mps=new MinimumPathSum64();
      int output=  mps.minPathSum(grid);
      System.out.println(output);
    }
}
