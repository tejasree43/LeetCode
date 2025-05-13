package DataStructures;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    private int v;
    private ArrayList<Integer>[] adjList;
    Graph(int v){
        this.v=v;
        initAdjList();
    }

    private void initAdjList() {
        adjList = new ArrayList[v];
        for(int i=0;i<v;i++){
            adjList[i]=new ArrayList<>();
        }
    }
    private void addEdge(int u, int v) {

        adjList[u].add(v);
    }
    private  void printAllPaths(int source, int target) {

        boolean[] isVisited = new boolean[v];

        List<Integer> localPaths = new ArrayList();
        localPaths.add(source);

        BackTrackingThePaths(source,target,isVisited,localPaths);

    }

    private void BackTrackingThePaths(int source, int target, boolean[] isVisited, List<Integer> localPaths) {

        if(source == target){
            System.out.println(localPaths);
            return;
        }
       // isVisited[source] = true;
        for(Integer internalListNumber:adjList[source]){
       if(localPaths.contains(internalListNumber))
           {
               continue;
           }
            if(!isVisited[internalListNumber]){

                localPaths.add(internalListNumber);
                BackTrackingThePaths(internalListNumber,target,isVisited,localPaths);
                localPaths.remove(localPaths.size()-1);
            }
            else {
                isVisited[internalListNumber] = true;
            }

        }
        //isVisited[source] = false;


    }

    public static void main(String[] args){

        Graph graph =new Graph(4);

       graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(2,0);
        graph.addEdge(2,1);
        graph.addEdge(1,3);

        int source =2;
        int target =3;
        graph.printAllPaths(source,target);

    }




}
//  Time Complexity: O(2^V), The time complexity is exponential.
//  Given a source and destination, the source and destination nodes are going to be in every path.
//  Depending upon edges, taking the worst case where every node has a directed edge to every other node,
//  there can be at max 2^V different paths possible in the directed graph from a given source to destination.
//  Auxiliary space: O(2^V), To store the paths 2^V space is needed