package Medium;

public class NumberofIslands200 {

    public int numIslands(char[][] grid) {

        int column = grid.length;
        int row =   grid[0].length;

        int numberOfIslands = 0;

        for(int i =0;i<column;i++) {

            for (int j = 0; j < row; j++) {

                if(grid[i][j]=='1'){
                    checkIslands( i, j,grid);
                    numberOfIslands++;
                }

            }
        }

        return numberOfIslands;
    }

    private void checkIslands( int i, int j,char[][] grid) {


        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j] == '0'){
            return;
        }
        grid[i][j] = '0';

        checkIslands(i+1,j,grid);
        checkIslands(i-1,j,grid);
        checkIslands(i,j+1,grid);
        checkIslands(i,j-1,grid);

    }

    public static void main(String[] args) {

        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};

        NumberofIslands200 numberOfIslands = new NumberofIslands200();
        int output = numberOfIslands.numIslands(grid);
        System.out.println("output"+output);
    }
}

