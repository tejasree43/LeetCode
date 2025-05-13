package Medium;

import java.util.*;

public class EvaluateDivision399 {

    class Edge{

      double value;
      String v;

        Edge(String v,double value){
            this.v = v;
            this.value = value;
        }

    }
    private void addEdge(Map<String, List<Edge>> map, String u, String v, double value) {

        if(!map.containsKey(u)){
           map.put(u,new ArrayList<>());
        }
        map.get(u).add(new Edge(v,value));
    }

    private double dfs(Map<String, List<Edge>> map, HashSet<String> set, String u, String v) {

        if(!map.containsKey(u)||!map.containsKey(v)){
            return -1;
        }
        if(u.equals(v)){
            return 1;
        }
        for(Edge edge : map.get(u)){

            if(set.contains(edge.v)){
                continue;
            }

            if( edge.v.equals(v)){
                return edge.value;
            }
            set.add(u);
            double val = dfs(map, set,edge.v,v);

            if(val !=-1)
            {
                return val*edge.value;
            }


        }


        return -1;
    }
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {

        double[] answer = new double[queries.size()];

        Map<String,List<Edge>> map = new HashMap<>();

        for(int i =0;i<values.length;i++){

            List<String> listEquation = equations.get(i);
            addEdge(map,listEquation.get(0),listEquation.get(1),values[i]);
            addEdge(map,listEquation.get(1),listEquation.get(0),1/values[i]);

        }

        for(int i =0;i<queries.size();i++){
            List<String> listQueries = queries.get(i);

            answer[i]= dfs(map, new HashSet<>(),listQueries.get(0),listQueries.get(1));

        }



        return answer;
    }




    public static void main(String[] args) {


    EvaluateDivision399 evaluateDivision = new EvaluateDivision399();
    //  equations = [["a","b"],["b","c"]], values = [2.0,3.0], queries = [["a","c"],["b","a"],["a","e"],["a","a"],["x","x"]]


        List<List<String>> equations = new ArrayList<>();
        equations.add(new ArrayList<>(Arrays.asList("a","b")));
        equations.add(new ArrayList<>(Arrays.asList("b","c")));

        System.out.println(equations);

        List<List<String>> queries = new ArrayList<>();
        queries.add(new ArrayList<>(Arrays.asList("a","c")));
        queries.add(new ArrayList<>(Arrays.asList("b","a")));
        queries.add(new ArrayList<>(Arrays.asList("a","e")));
        queries.add(new ArrayList<>(Arrays.asList("a","a")));
        queries.add(new ArrayList<>(Arrays.asList("x","x")));

        double[] values= {2.0,3.0};

       double [] output= evaluateDivision.calcEquation(equations,values,queries);
        Arrays.stream(output).forEach(System.out::println);
    }

}

/*
This is a simple problem of Bi-directional weighted graph. The algorithm of this problem is described below.

Algorithm:
-------------------------------------------------------------------------------------------------------------------------
1. Construct a Bi-directional weighted graph where the ith element of the array `values` (values[i]) represents the
   weight of the edge `a` to `b` which eventually is `a/b`.
2. As the edge represents the above mathematical relation, the reverse direction represents the reciprocal of the same.
   That is, the weight of edge `a` to `b` is reciprocal to that of `b` to `a`.
3. Iterate through the queries array and perform `Depth-first search (DFS)` from each source to the destination and
   return the product of the weights of the path of the same.
4. Return -1 if no path is found.
-------------------------------------------------------------------------------------------------------------------------
*/

  /*  Create a map with all correlations and then perform dfs. During dfs all the relations will be multiplied and this will be the final answer.

        Example: a/b = 2; b/c = 3; k/c = 2; a/k = ?
        a/k = c/k * b/c * a/b = a/k;
        a/k = 0.5 * 3 * 2 = 3;*/

