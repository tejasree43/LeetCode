package Medium;

import Easy.PermutationInString567;

import java.util.Arrays;

public class PermutationinStringV2 {
    public boolean checkInclusion(String s1, String s2) {

    if(s1.length()>s2.length()) {
        return false;
       }
       int j=s1.length()-1;
       int[] a1=get(s1);
       String subString= s2.substring(0,j);
       System.out.println("subString"+subString);
       int[] a2=get(subString);

       int i=0;

      while(j<s2.length())
      {
        a2[s2.charAt(j)-'a']++;
       if(Arrays.equals(a1,a2)){
           return true;
       }
        a2[s2.charAt(i)-'a']--;
         i++;
         j++;

      }
        return false;
    }

    private int[] get(String s1) {
        int[] output=new int[26];
       for(int i=0;i<s1.length();i++)   {
         output[s1.charAt(i)-'a']++;

       }
    return output;
    }

    public static void main(String[] args){
    PermutationinStringV2 permutationString=new PermutationinStringV2();
    String s1 = "ab", s2 = "eidbaooo";
    boolean output= permutationString.checkInclusion(s1,s2);
    System.out.println("output"+output);
  }
}
