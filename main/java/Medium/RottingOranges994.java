package Medium;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges994 {
    public int orangesRotting(int[][] grid) {
        int columnLength = grid.length;
        int rowsLength = grid[0].length;
        int freshOranges=0;

        Queue<int[]> queue=new LinkedList<>();
        for (int column = 0; column < columnLength; column++) {

            for (int row = 0; row < rowsLength; row++) {
                if (grid[column][row] == 2) {

                    queue.add(new int[]{column,row});
                }
                if(grid[column][row] == 1){
                    freshOranges++;
                }
            }
        }

        if(rowsLength==0){
            return 0;
        }
        int minutes=-1;

        if(freshOranges==0) return 0;
        System.out.println("queue size="+queue.size());
        System.out.println("freshOranges="+freshOranges);

       while(!queue.isEmpty()){

           int queueSize=queue.size();
           minutes++;
           for(int i=0;i<queueSize;i++) {
               int[] orange=queue.poll();
               int column = orange[0];
               int row = orange[1];
               if (column+1<grid.length&&grid[column+1][row] ==1) {
                   grid[column+1][row]=2;
                   queue.add(new int[]{column+1,row});
                   freshOranges--;
               }
               if (column-1>=0&&grid[column-1][row] ==1) {
                   grid[column-1][row]=2;
                   queue.add(new int[]{column-1,row});
                   freshOranges--;
               }
               if (row + 1<grid[0].length && grid[column][row + 1] ==1) {
                   grid[column][row + 1]=2;
                   queue.add(new int[]{column,row + 1});
                   freshOranges--;
               }
               if (row -1>=0&&grid[column][row - 1] ==1) {
                   grid[column][row - 1]=2;
                   queue.add(new int[]{column,row - 1});
                   freshOranges--;
               }

               }


       }
//System.out.println("minutes is"+minutes);

        return freshOranges==0?minutes:-1;
    }



                                  /*  if ((grid[column][row - 1] == 6) ||
                                            (grid[column][row + 1] == 6) ||
                                            (grid[column - 1][row] == 6) ||
                                            (grid[column + 1][row] == 6)) {
                                    }*/




    public static void main(String[] args){

       //int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        int[][] grid = {{1},{2}};
        //int[][] grid={{1,1,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        RottingOranges994 rottingOranges=new RottingOranges994();

        int minutes=rottingOranges.orangesRotting(grid);
        System.out.println("minutes"+minutes);
    }


}
