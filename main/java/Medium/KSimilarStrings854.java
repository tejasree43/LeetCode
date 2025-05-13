package Medium;

import java.util.ArrayDeque;
import java.util.Queue;

public class KSimilarStrings854 {

    public int kSimilarity(String s1, String target) {

       // System.out.println("kSimilarity");
        Queue<String> queue = new ArrayDeque<>();
        queue.add(s1);

        int level = 0;
        while(!queue.isEmpty()){
        int size = queue.size();

         while(size-->0) {
             String s = queue.remove();

             if(s.equals(target)){
                 return level;
             }

             int i =0;
             while(s.charAt(i)==target.charAt(i)){
               i++;
             }
             int j = i;

             while(j<s.length()){

             if(s.charAt(i)==target.charAt(j)&&s.charAt(j)!=target.charAt(j)){

                 //StringSwap with Builder
                 StringBuilder sb =new StringBuilder(s1);
                  sb.setCharAt(i, s.charAt(j));
                 sb.setCharAt(j, s.charAt(i));

                 //optimization here
                 if(sb.toString().equals(target)){
                     return level+1;
                 }
                  queue.add(sb.toString());
               }

             j++;

             }
         }
         level++;
        }

        return level;
    }


    public static void main(String[] args){

       String s1 = "abc", s2 = "bca";
       KSimilarStrings854 ksimilar = new KSimilarStrings854();
       int output = ksimilar.kSimilarity( s1, s2);
       System.out.println("output"+output);
    }
}
