package Medium;

import java.util.Arrays;

public class ArrowstoBurstBalloons452 {
    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int arrow = 1;
        int start = points[0][1];

        for(int i =1;i<points.length;i++){

            int end = points[i][0];
            if( start <end ) {
                arrow++;
                start = points[i][1];
                }
            }

        return arrow;
    }

    public static void main(String[] args)
    {
    // int[][] input = new int[][] {{10,16},{2,8},{1,6},{7,12}};

     int[][] input = new int[][]{{1,2},{3,4},{5,6},{7,8}};
    ArrowstoBurstBalloons452 arrows = new ArrowstoBurstBalloons452();
    int output  = arrows.findMinArrowShots(input);
    System.out.println("output" +output);

    }

}
