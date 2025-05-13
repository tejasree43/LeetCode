package Medium;

import java.util.ArrayList;
import java.util.List;

public class Triangle120 {

    public int minimumTotal(List<List<Integer>> triangle) {

        int n = triangle.get( triangle.size() - 1).size();

        System.out.println("n size ="+n);
        int dp[] = new int[n + 1];

        for(int i = triangle.size() - 1; i>=0; i--)
        {
            for(int j = 0; j<triangle.get(i).size(); j++)
                dp[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j+1]);
        }

        return dp[0];

    }


       /* for(List<Integer> list: triangle){

            int minimumNumber= list.get(0);

            for(int i=adjacent;i<list.size();i++){
                minimumNumber = Math.min(minimumNumber,list.get(i));
            }
            minimumSum+= minimumNumber;
           // minimumNumber = Integer.MAX_VALUE;
        }

        System.out.println("minimumSum"+minimumSum);*/

    public static void main(String[] args){

      //  [[-1],[2,3],[1,-1,-3]]
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
       // l1.add(2);
        l1.add(-1);
        triangle.add(l1);

        List<Integer> l2=new ArrayList<>();
        /*l2.add(3);
        l2.add(4);*/
         l2.add(2);
         l2.add(3);
        triangle.add(l2);

        List<Integer> l3=new ArrayList<>();
       /* l3.add(6);
        l3.add(5);
        l3.add(7);*/
        l3.add(1);
        l3.add(-1);
        l3.add(-3);
        triangle.add(l3);

        //List<Integer> l4=new ArrayList<>();
       /* l4.add(4);
        l4.add(1);
        l4.add(8);
        l4.add(3);*/
      //  triangle.add(l4);

        int triangle1[][] = { { 2 },
                { 3, 9 },
                { 1, 6, 7 }  };
       /* List<List<Integer>> triangle = new ArrayList<>();

        triangle.add(triangle1);*/


       // System.out.print(minSumPath(triangle));
        Triangle120 traingleRef = new Triangle120();
        traingleRef.minimumTotal(triangle);

    }
}
