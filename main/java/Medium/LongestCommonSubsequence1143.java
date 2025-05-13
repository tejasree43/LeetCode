package Medium;

public class LongestCommonSubsequence1143 {
    public int longestCommonSubsequence(String s1, String s2) {

     int m = s1.length()+1;
     int n  = s2.length()+1;

     int[][] dp = new int[m][n];


     for(int i =1;i< m;i++) {
         for (int j = 1; j < n; j++) {
         if(s1.charAt(i-1) == s2.charAt(j-1) ){
             dp[i][j] = 1+dp[i-1] [j-1];
         }
         else{
             dp[i][j] = Math.max(dp[i-1] [j],dp[i] [j-1]);

         }

         }
     }
     //Two pointer approach to print the string letter
        //String text1 = "abcde";
        //String text2 = "ace";
        int i = s1.length();
        int j = s2.length();

        StringBuilder str = new StringBuilder();

        while(i>0 && j>0){

         if(s1.charAt(i-1)==s2.charAt(j-1)){
           str.append(s1.charAt(i-1)) ;
           i--;
           j--;
         }
         //11  20
         else if (dp[i-1][j] >= dp[i][j-1]){
          i--;
          }
         else {
             j--;
         }
        }

        System.out.println("The string is "+str.reverse().toString());
        return dp[m-1][n-1];
    }

    public static void main(String[] args){
        LongestCommonSubsequence1143 lcs=new LongestCommonSubsequence1143();
       String text1 = "abcde",  text2 = "ace";
      // String text1 = "JAVAAID",  text2 = "JAVAID";
        int output = lcs.longestCommonSubsequence(text1,text2);
        System.out.println("output="+output);
    }
}

//
//Dp tabular form of below
/*               i  a  b  c  d  e
    j    0 = {} [0,  0, 0, 0, 0, 0]
    a   1 = {}  [0,  1, 1, 1, 1, 1]
    c  2 = {}   [0,  1, 1, 2, 2, 2]
    e  3 = {}   [0,  1, 1, 2, 2, 3]
       Time Complexity:
The nested for loop iterates over all cells in the dp array once, resulting in a time complexity of O(row * column). Since row and column are determined by the lengths of s1 and s2, respectively, the time complexity can be denoted as O(s1.length() * s2.length()).

Space Complexity:
The space complexity is determined by the dp array, which has dimensions [row][column]. Therefore, the space complexity is O(row * column), which can be simplified to O(s1.length() * s2.length()).
        */
