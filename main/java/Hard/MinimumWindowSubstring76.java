package Hard;

import java.util.ArrayList;

public class MinimumWindowSubstring76 {

    public String minWindow(String s, String t) {

       int[] map=new int[128];

        for(char ch:t.toCharArray()){
            map[ch]++;
        }

        int end=0; int counter=t.length();
        int start=0;
        int minimumLength=Integer.MAX_VALUE;
        int minimumStart=0;

        while(end<s.length()){

          final char c1= s.charAt(end);
           if(map[c1]>0) {
               counter--;
           }
            map[c1]--;
            end++;

           while(counter==0) {
               if (minimumLength > end - start) {
                   minimumLength = end - start;
                   minimumStart = start;
                   final char c2 = s.charAt(start);
                   map[c2]++;
                   if (map[c2] > 0) {
                       counter++;
                   }
                   start++;
               }
           }


        }

        return minimumLength == Integer.MAX_VALUE ? "" : s.substring(minimumStart, minimumStart + minimumLength);

       /* int start = 0, end = 0, minStart = 0, minLen = Integer.MAX_VALUE, counter = t.length();
        int [] map = new int[128];
        for (char c : t.toCharArray()) {
            map[c]++;
        }
        while (end < s.length()) {
            final char c1 = s.charAt(end);
            if (map[c1] > 0) counter--;
            map[c1]--;
            end++;
            while (counter == 0) {
                if (minLen > end - start) {
                    minLen = end - start;
                    minStart = start;
                }
                final char c2 = s.charAt(start);
                map[c2]++;
                if (map[c2] > 0) counter++;
                start++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);*/
    }

       /* public String minWindow1(String s, String t) {
        //brute force

        int subStringLength=t.length();
        int [] map = new int[128];
        for (char c : t.toCharArray()) {
            map[c]++;
        }

        if(t.length()>s.length()){
            return "";
        }
        if(t.length()==s.length()&&s.equals(t)){
            return s;
        }

        int j=0;
        while(subStringLength<=s.length()){
            j=0;
            while(j<=s.length()-subStringLength){
                String subString= s.substring(j,subStringLength+j);
                boolean output=  subStringCheck(subString,map,t.length());
                if(output){
                    return subString;
                }
                j++;
            }
            for (char c : t.toCharArray()) {
                map[c]++;
            }

            subStringLength++;
        }

        return "";
    }*/
    public boolean subStringCheck(String s, int[] map,int subStringLength){
        int n=subStringLength;
        for(int i=0;i<s.length();i++) {
          char ch= s.charAt(i);
          if(map[ch]>0){
              map[ch]--;
              n--;
          }
          if(n==0){
              return true;
          }
        }

     return false;
    }

    public static void main(String[] args){

    //String  s = "ADOBECODEBANC",  t = "ABC";
      //  String  s = "a",  t = "a";
        //String  s = "ab",  t = "b";
   //String  s = "abc",  t = "ac";
  String  s = "bbaa",  t = "aba";

   //String  s = "ab",  t = "A";

     MinimumWindowSubstring76 minimumWindow=new MinimumWindowSubstring76();
    String output= minimumWindow.minWindow(s,t);
    System.out.println("output1="+output);

    }
}
