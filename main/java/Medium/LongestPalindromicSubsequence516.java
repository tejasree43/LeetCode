package Medium;

public class LongestPalindromicSubsequence516 {
    public int longestPalindromeSubseq(String s1) {

        String s2 ="";
        for(int i =s1.length()-1;i>=0;i--){
            s2 +=s1.charAt(i);
        }

        System.out.println(s2);
        int column = s1.length()+1;
        int row  = s2.length()+1;

        int[][] dp = new int[row][column];

        for(int i =0;i<row;i++){

            dp[i][0] = 0;
        }
        for(int i =0;i<column;i++){

            dp[0][i] = 0;
        }
        for(int i =1;i< row;i++) {
            for (int j = 1; j < column; j++) {
                if(s2.charAt(i-1) == s1.charAt(j-1) ){
                    dp[i][j] = 1+dp[i-1] [j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1] [j],dp[i] [j-1]);
                }

            }
        }
        return dp[row-1][column-1];


    }

        public static void main(String[] args){
        LongestPalindromicSubsequence516 lcs=new LongestPalindromicSubsequence516();
       // String text1 = "abcde";
         String text1 = "JAVAAID",  text2 = "JAVAID";
        int output = lcs.longestPalindromeSubseq(text1);
        System.out.println("output="+output);
    }
}
