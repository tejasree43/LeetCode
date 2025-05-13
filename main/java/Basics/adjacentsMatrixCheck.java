package Basics;

public class adjacentsMatrixCheck {

    private static void printChessBoard(int[][] nums, int n) {
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                System.out.print(nums[row][column]);
            }
            System.out.println();
        }


    }


    public static void main(String[] args) {

        int[][] nums = {{1, 1, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int n = 4;
        //printChessBoard(nums,n);
        adjacentsMatrixCheck dc = new adjacentsMatrixCheck();
        dc.adjacent(nums, n);

    }

    private void adjacent(int[][] grid, int n) {

        int columnLength = grid.length;
        int rowLength = grid.length;

        int row = 0;
        int column = 0;
        System.out.println("grid" + grid[0][0]);

        if (adjacentchecks(grid, row, column, columnLength)) {
            System.out.println("yes adjacent ");
        } else {
            System.out.println("NO adjacent ");

        }


    }

    private boolean adjacentchecks(int[][] grid, int row, int column, int n) {

        for (int i = row,j=column; i <=0&&j<n; i--,j--) {
            if (grid[column][row - 1] == 1 || grid[column][row + 1] == 1 ||
                    grid[column - 1][row] == 1 || grid[column + 1][row] == 1) {
                return true;
            }
        }
        return false;
    }
}