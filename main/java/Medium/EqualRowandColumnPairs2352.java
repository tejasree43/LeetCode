package Medium;
import java.util.HashMap;

public class EqualRowandColumnPairs2352 {

    public int equalPairs(int[][] grid) {

       // In summary, the time complexity of the program is O(m * n), and the space complexity is O(m * n).
       /* int m = grid.length;
        int n = grid[0].length;

        int [][] ans=new int[m][n];

        //transpose the matrix
        for(int j=0;j<m;j++) {

            for (int k = 0; k < n; k++) {
                ans[k][j] = grid[j][k];
            }
        }
            int counter =0;
        //compare with transpose matrix
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {

                int[] a = grid[i];
                int[] b = ans[j];

               if(Arrays.equals(a,b))  {
                 counter++;
               }
            }
        }
        return counter;*/

       //Using hashMaps

        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();

        for(int i=0;i<grid.length;i++) {
            StringBuilder sb = new StringBuilder();

            for (int j= 0; j < grid.length; j++) {
               sb.append( grid[i][j] );
               sb.append( ":" );
            }
            String s = sb.toString( );
            map1.put(s,map1.getOrDefault( s,0) + 1 );
        }

        for(int i=0;i<grid.length;i++) {
            StringBuilder sb1 = new StringBuilder( );

            for (int j= 0; j < grid.length; j++) {
                sb1.append(grid[j][i]);
                sb1.append(":");
            }
            String s = sb1.toString();
            map2.put(s,map2.getOrDefault( s,0 ) + 1);
        }

        System.out.println( map1 );
        System.out.println( map2 );

        int counter = 0;

        for(String value : map1.keySet()) {

            if(map2.containsKey(value)) {
                counter += map1.get(value) * map2.get(value);
            }
        }

        return counter;

       /* int n = grid.length;
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for(int i = 0; i < n; i++) {
            StringBuilder s = new StringBuilder();
            for(int j = 0; j < n; j++) {
                s.append(grid[i][j]);
                s.append(":");
            }
            String str = s.toString();
            map1.put(str, map1.getOrDefault(str, 0) + 1);
        }
        for(int i = 0; i < n; i++) {
            StringBuilder s = new StringBuilder();
            for(int j = 0; j < n; j++) {
                s.append(grid[j][i]);
                s.append(":");
            }
            String str = s.toString();
            map2.put(str, map2.getOrDefault(str, 0) + 1);
        }
        System.out.println(map1);
        System.out.println(map2);

        int ans = 0;
        for(String s : map1.keySet()) {
            if(map2.containsKey(s)) {
                ans += map1.get(s) * map2.get(s);
            }
        }
        return ans;*/
    }
 public static void main ( String[] args ) {

    //int[][]  grid = {{3,2,1},{1,7,6},{2,7,7}};
     int[][]  grid = {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};

     EqualRowandColumnPairs2352 equalRowandColumn = new EqualRowandColumnPairs2352();

     int output =  equalRowandColumn. equalPairs(grid);

     System.out.println("output = " + output);

 }

}
