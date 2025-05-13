package Medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix54 {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> alList=new ArrayList<>();
        final int VISITED = 101;
        int y=0;
        int x=0;
        String direction="right";
        for(int i=0;i<matrix.length*matrix[0].length;i++) {
            alList.add(matrix[y][x]);
            matrix[y][x] = VISITED;
            switch (direction) {
                case "right":
                    if ( (x+1)<matrix[0].length && matrix[y][x + 1] != VISITED) {
                        x++;
                    }
                    else{
                        y++;
                        direction="down";
                    }
                    break;
                case "down":
                    if ((y+1)<matrix.length && matrix[y+1][x] != VISITED) {
                        y++;
                    }
                    else{
                        x--;
                        direction="left";
                    }
                    break;
                case "left":
                    if ((x-1)>=0 && matrix[y][x-1] != VISITED) {
                        x--;
                    }
                    else{
                        y--;
                        direction="up";
                    }
                    break;
                  case "up":
                    if ((y-1)>=0 && matrix[y-1][x] != VISITED) {
                        y--;
                    }
                    else{
                       x++;
                       direction="right";
                    }
                    break;
            }


        }
        System.out.println(alList);
        return alList;





        /* Brute force approach which can not cover all the situations:
        System.out.println("n="+n+"n1="+columns);

        for(int i=0;i<matrix.length;i++){

            for(int j=0;j<matrix[0].length;j++) {

                if (i == 0) {
                    alList.add(matrix[i][j]);
                } else if (i != n) {
                    alList.add(matrix[i][columns]);
                    i++;
                    j--;
                }
                else {
                    System.out.println("j value:" + j + "i=" + i);
                    int temp = columns - j;
                    alList.add(matrix[i][temp]);

                     if(j == columns) {
                        int k = 0;
                         int tempv=1;

                         while (j-1 > k) {
                            if(i-1==0){
                                break;
                            }else {
                                alList.add(matrix[i - tempv][k]);
                                tempv++;
                            }
                            k++;
                        }
                    }
                }
            }
        }

        System.out.println(alList);*/


    }

    public static void main(String[] args)
    {
        //int[][]  matrix1 = {{1,2,3},{5,6,7},{9,10,11}};

       // int[][]  matrix2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[][]  matrix =  {{1,2},{3,4}};

        int[][]  matrix4 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        SpiralMatrix54 sm=new SpiralMatrix54();
        sm.spiralOrder(matrix4);

    }
}
