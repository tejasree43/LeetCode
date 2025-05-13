package Medium;

public class NumberofProvinces547 {

    int noOfprovinces = 0;

    public int findCircleNum(int[][] isConnected) {

        int numProvinces = isConnected.length; // Number of provinces
        boolean[] visited = new boolean[numProvinces]; // Array to track visited provinces
        int numCircles = 0; // Counter for the number of provinces in a circle

        for (int i = 0; i < numProvinces; i++) {
            if (!visited[i]) {
                numCircles++;
                dfs(isConnected, i, visited); // Perform DFS traversal to find provinces in the current circle
            }
        }

        return numCircles;
    }

    // Recursive function for DFS traversal to find provinces in a circle
    private void dfs(int[][] isConnected, int province, boolean[] visited) {

        visited[province] = true; // Mark the current province as visited

        // Iterate through the neighboring provinces of the current province
        for (int neighbor = 0; neighbor < isConnected[province].length; neighbor++) {
            // If the neighbor province is not visited and there is a connection, mark as visited and explore further
            if (!visited[neighbor] && isConnected[province][neighbor] == 1) {
                dfs(isConnected, neighbor, visited); // Recursive call for unvisited provinces in the current circle
            }
        }
    }

    public int findCircleNum1(int[][] isConnected) {

        int m = isConnected.length;
        int n = isConnected[0].length;

        boolean[][] visited = new boolean[m][n];

        for(int i =0;i<m;i++) {

            for (int j = 1; j < n; j++) {
                dfs1(i,j,isConnected,visited,i, j);

            }
        }

        System.out.println("noOfprovinces"+noOfprovinces);

        return noOfprovinces;
    }

    private  void dfs1(int i,int j,int[][] isConnected, boolean[][] visited,int ivalue,int jvalue ) {

        if(i<0||j<0||i>=isConnected.length||j>=isConnected[0].length||visited[ivalue][jvalue]==true){
            return ;
        }

        if(ivalue==j&&jvalue==i){
            if(isConnected[i][j]==isConnected[ivalue][jvalue]){
                System.out.println("i,j="+i+""+j);
                visited[ivalue][jvalue] =true;
                noOfprovinces++;
            }
        }
    dfs1(i+1,j-1,isConnected,visited, ivalue, jvalue);

    }

    public static void main(String[] args) {

        NumberofProvinces547 provinces = new NumberofProvinces547();
          int input[][] = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}; //2
        //int input[][] = {{1,0,0}, {0,1,0}, {0,0,1}};//3
       // int input[][] = {{1,0,0,1}, {0,1,1,0}, {0,1,1,1},{1,0,1,1}};//1
     //   int input[][] = {{1,0,0,0}, {0,1,0,0}, {0,1,1,1},{1,0,1,1}};//3

      //  [[1,0,0,1],[0,1,1,0],[0,1,1,1],[1,0,1,1]]

        // [[1,0,0],[0,1,0],[0,0,1]]
     int output =   provinces. findCircleNum(input);
     System.out.println("output"+output);

    }
}
