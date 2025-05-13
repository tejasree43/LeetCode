package Easy;

import java.util.Arrays;

public class RepeatedSubstringPattern459 {
    public boolean repeatedSubstringPattern(String s) {

        int n= s.length(),  previousLps = 0, i = 1;

        int[] lps = new int[n];

        int maxLps = 0;

        while(i<n){

            if(s.charAt(i)==s.charAt(previousLps)){
                lps[i++]=++previousLps;
            }
            else if(previousLps==0){
                lps[i++]=0;
            }
            else {
                previousLps = lps[previousLps - 1];
            }

            maxLps = Math.max(previousLps,maxLps);
        }

        System.out.println("maxLps"+maxLps);
        Arrays.stream(lps).forEach(System.out::println);
        return lps[n - 1] > 0 && n % (n - lps[n - 1]) == 0;
    }
    public static void main(String[] args){
     String s  = "abcabcdef";


//baba
        RepeatedSubstringPattern459 repeat = new RepeatedSubstringPattern459();
       boolean output = repeat.repeatedSubstringPattern(s);
       System.out.println("output"+output);
    }
}
