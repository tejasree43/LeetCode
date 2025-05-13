package Easy;

public class IsSubsequence392 {
    public boolean isSubsequence(String s, String t) {

        int i =0;
        int j =0;

        while(i<s.length()&&j<t.length()){

           char ch = s.charAt(i);
           if(ch == t.charAt(j)) {
               i++;
               j++;
           }
           else{
               j++;
           }

        }

        return i==s.length();
    }

    public static void main(String[] args) {

       // String s = "abc", t = "ahbgdc";
       // String s = "aaaaaa", t = "bbaaaa";

         String s = "axc", t = "ahbgdc";
        IsSubsequence392 subsequence = new IsSubsequence392();
        boolean output = subsequence.isSubsequence(s, t);

        System.out.println("output" + output);
    }
 }

   /* Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
    A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).


        Example 1:
        Input: s = "abc", t = "ahbgdc"
        Output: true

        Example 2:
        Input: s = "axc", t = "ahbgdc"
        Output: false
*/