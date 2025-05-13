package Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayInsertion {
    public static void minimumAbsDifference(List<Integer> al) {


        int[] arr=new int[al.size()];
        for(int i=0;i<al.size();i++)
        {
            arr[i]=al.get(i);
        }

        Arrays.sort(arr);

        List<List<Integer>> res = new ArrayList();
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]<min) min = arr[i+1]-arr[i];
        }for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==min)

                System.out.println(arr[i]+" "+arr[i + 1]);
                res.add(Arrays.asList(arr[i], arr[i + 1]));
        }


      //  return res;


       System.out.println(res);

      /*  for(int x=0;x<list.size();x++){

          System.out.print (list.get(x));


        }*/

        //list.stream().forEach(s->System.out.println(s));

    }

    public static void main(String[] args){

        System.out.println("Array testing");

        int[] orange=new int[2];

        List<Integer> al=new ArrayList<>();
        al.add(4);
        al.add(2);
        al.add(1);
        al.add(3);
        minimumAbsDifference(al);


        int row=orange[0];
       /* Queue<int[]>
        for(int i=0;i<size;i++) {
            int[] orange = q.poll();
        }
            int row = orange[0];        System.out.println("Array testing"+row+"column="+column);*/


    }
}
