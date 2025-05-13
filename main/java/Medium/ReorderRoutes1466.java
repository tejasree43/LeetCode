package Medium;

import java.util.ArrayList;
import java.util.List;

public class ReorderRoutes1466 {

    int count =0;
    public int minReorder(int n, int[][] connections) {

    List<List<int[]>>  graph = new ArrayList<>();

    for(int i =0;i<n;i++){
        graph.add(new ArrayList<>());
    }

        for(int i =0;i<connections.length;i++){

            int[] connection=  connections[i];
            graph.get(connection[0]).add(new int[]{connection[1],1});
            graph.get(connection[1]).add(new int[]{connection[0],0});

        }

        boolean[] visited = new boolean[n];
        visited[0] =true;
        dfs(graph, visited,0);

            return count;
    }

       private void dfs(List<List<int[]>> graph, boolean[] visited,int vertex) {

           List<int[]> list = graph.get(vertex);

           for (int[] pair : list) {
               if (visited[pair[0]] == false) {
                   visited[pair[0]] = true;

                   if (pair[1] == 1) {
                       count++;
                   }

                   dfs(graph, visited, pair[0]);
               }


           }
       }

    public static void main(String[] args) {

    int[][] input = {{0,1},{1,3},{2,3},{4,0},{4,5}};

    ReorderRoutes1466 reOrder = new ReorderRoutes1466();

    int n =6;

   int output =  reOrder.minReorder(n,input);

   System.out.println("output"+output);

    }

 }
