package Hard;

import java.util.*;

public class PermutationSequence60 {

    List<String> l1=new ArrayList();

    public String getPermutation(int n, int k) {

     String sb=new String();

     for(int i=1;i<=n;i++){
         sb+=i;
      }
        System.out.println(sb);
       char[] ch= sb.toCharArray();
       int startIndex=0;

       System.out.println("ch length="+ch.length);
       getBacktracking(ch,startIndex);
        System.out.println("sb value"+l1);

        ArrayList al=new ArrayList<>(l1);
        Collections.sort(l1);

        return (String) al.get(k-1);
    }

    public void getBacktracking(char[] ch,int startIndex) {
        StringBuffer sb=new StringBuffer();

        if(startIndex==ch.length){
            l1.add(new String(ch));
            return;
        }
        for(int i= startIndex;i <= ch.length-1;i++)
        {
            System.out.println("Inside for loop");
            swap(ch,startIndex,i);
            getBacktracking(ch,startIndex+1);
            System.out.println("startIndex="+startIndex);
            System.out.println("i value"+i);
            swap(ch,i,startIndex);

        }

    }

    private void swap(char[] ch, int startIndex, int i) {
        System.out.println("coming to swap method");

        char temp=ch[startIndex];
        ch[startIndex]=ch[i];
        ch[i]=temp;

    }

    public static void main(String[] args) {
     PermutationSequence60 ps=new PermutationSequence60();
     int n=3;
     int k=3;
     String output=ps.getPermutation(n,k);
     System.out.println("output"+output);

    }



}
