package Easy;


import java.util.ArrayList;
import java.util.List;

public class PermutationInString567 {

     boolean valuePresent=false;
     List<String> arl=new ArrayList<>();
     public boolean checkInclusion(String s1, String s2) {

        int startIndex = 0;
        char[] ch = s1.toCharArray();
        permute(ch,startIndex);

        System.out.println("arl"+arl);
        CheckSubString(arl,s1,s2);
        return valuePresent;
    }

    public boolean CheckSubString(List<String> arl, String s1, String s2)
    {
        int n=s2.length();
        int endIndex=s1.length();
        for (int i = 0; i<=n-1; i++) {
             if(endIndex<=n) {
                 String a1 = s2.substring(i, endIndex);
                 if (arl.contains(a1)) {
                     return valuePresent = true;
                 }
             }
          endIndex++;
        }
        return false;
    }

    private void permute(char[] ch, int startIndex) {

        StringBuffer sb=new StringBuffer();
        if(startIndex==ch.length){
           sb.append(ch);
           //System.out.println("sb="+sb);
            arl.add(sb.toString());
         return;
        }
        for (int i = startIndex; i <= ch.length-1; i++) {

           // System.out.println("Inside for loop");
            swapString(ch,startIndex,i);
            permute(ch,startIndex+1);
            swapString(ch,i,startIndex);

        }
    }

    /*prosperity
    properties*/
    private void swapString(char[] s1,int startIndex, int endIndex) {
        char temp= s1[startIndex];
        s1[startIndex]= s1[endIndex];
        s1[endIndex]=temp;

    }
    public static void main(String[] args){
        PermutationInString567 permutationInString=new PermutationInString567();
        String s1 = "abc", s2 = "bbbca";
        boolean output= permutationInString.checkInclusion(s1,s2);
        System.out.println("output"+output);
    }
}
/*
Input: s1 = "ab", s2 = "eidbaooo"
        Output: true
        Explanation: s2 contains one permutation of s1 ("ba").*/
