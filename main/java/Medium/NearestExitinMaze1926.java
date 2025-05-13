package Medium;

import java.util.LinkedList;
import java.util.Queue;

public class NearestExitinMaze1926 {

    public int nearestExit(char[][] maze, int[] entrance) {

        Queue<int[]> queue1 = new LinkedList<>();

        int entryColumn = entrance[0];//1
        int entryRow = entrance[1];//2
        int entryCount = 0;
        queue1.add(new int[]{entryColumn,entryRow,entryCount});

          int min = Integer.MAX_VALUE;

        while(!queue1.isEmpty()){

                  int[] values = queue1.poll();
                  int column = values[0];//1
                  int row = values[1];//2
                  int count = values[2];//2

                  if(count>=min || min==1 || maze[column][row]=='+'){
                    continue;
                    }
                   maze[column][row]='+';

                 if (count>0&&(column == maze.length - 1 || row == 0||column  == 0||row  == maze[0].length - 1)) {
                     min =Math.min(count,min);

                 }

                 if (column - 1 >= 0 && maze[column - 1][row] == '.') {
                      queue1.add(new int[]{column - 1, row,count+1});
                 }

                if (column + 1 < maze.length && maze[column + 1][row] == '.') {
                      queue1.add(new int[]{column + 1, row,count+1});
                  }

                   if (row + 1 < maze[0].length && maze[column][row + 1] == '.') {
                      queue1.add(new int[]{column, row + 1,count+1});
                  }
                  if (row - 1 >= 0 && maze[column][row - 1] == '.') {
                      queue1.add(new int[]{column, row - 1,count+1});
                  }
                  }

        return min==Integer.MAX_VALUE?-1:min;
    }
    public static void main(String[] args) {

     char[][]  maze = {{'+','+','.','+'},{'.','.','.','+'},{'+','+','+','.'}};
      int [] entry ={1,2};

      /*  char[][]  maze = {{'.','+'}};
        int [] entry ={0,0};
*/

     /*   char[][]  maze =
                {{'+','.','.'},
                 {'+','.','+'},
                 {'.','.','+'}};

        int [] entry ={2,0};*/
       /* char[][] maze ={{'+','+','+'},{'.','.','.'},{'+','+','+'}};
        int [] entry ={1,0};*/
    // char[][] maze ={{'.','.','.'}};

    // char[][] maze = {{'.','+','+','+','+'},{'.','+','.','.','.'},{'.','+','.','+','.'},{'.','.','.','+','.'},{'+','+','+','+','.'}};

    //  int[] entry ={0,0};

    //  int[] entry ={1,0};

      /*  char[][] maze =   {{'+','.','+','+','+','+','+'},
                          {'+','.','+','.','.','.','+' }
                          ,{'+','.','+','.','+','.','+'},
                           {'+','.','.','.','+','.','+'},
                           {'+','+','+','+','+','.','+'}};
*/
        NearestExitinMaze1926 nearestExit = new  NearestExitinMaze1926();

      //  int [] entry = {0,1};

        int output = nearestExit.nearestExit(maze,entry);

       System.out.println("output"+output);

    }
 }
