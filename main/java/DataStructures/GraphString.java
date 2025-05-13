package DataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphString {


    Map<String, Node > nodes = new HashMap<>();
    class Node{

        public String getName() {
            return name;
        }

        String name;
        List<Node> neighbours = new ArrayList<>();

        public void addNeighbour(Node neighbour)
        {
            neighbours.add(neighbour);

        }

        Node(String name)
        {
            this.name = name;
        }



    }

    public void addEdge(String nodeName1,String nodeName2){

       Node n1 =nodes.get(nodeName1);
       if(n1==null){
          n1 = new Node(nodeName1);
       }
        Node n2 =nodes.get(nodeName2);
        if(n2==null){
            n2 = new Node(nodeName2);
        }
        n1.addNeighbour(n2);
        n2.addNeighbour(n1);

        nodes.put(nodeName1,n2);
        nodes.put(nodeName2,n1);
    }

    public void shortestPath(String source,String destination){






    }



    public static void main(String[] args){

        GraphString graph = new GraphString();

        graph.addEdge("A", "B");
        graph.addEdge("A", "D");
        graph.addEdge("A", "H");
        graph.addEdge("B", "C");
        graph.addEdge("B", "D");
        graph.addEdge("C", "F");
        graph.addEdge("C", "D");
        graph.addEdge("D", "E");
        graph.addEdge("E", "F");
        graph.addEdge("E", "H");
        graph.addEdge("F", "G");
        graph.addEdge("G", "H");



    }
}
