package Medium;


public class LongestPalindromicSubstring5 {
    public String longestPalindrome(String s) {


        if(s==null||s.length()<1) {
            return "";
        }
        int start = 0;int end =0;
        for(int i =0;i<s.length();i++)
        {
         int evenLength =   evenLengthFromCenter(s,i,i);
         int oddLength =   evenLengthFromCenter(s,i,i+1);
         int len = Math.max(evenLength,oddLength);


         if(len>(end-start))
         {
            start = i-(len-1)/2;
            end = i+(len)/2;
         }
        }

        return s.substring(start ,end+1);
    }

    private int evenLengthFromCenter(String s, int left, int right) {

        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right))
        {
            left --;
            right++;
        }

        return right-left-1;


    }

    public static void main(String[] args) {
        String s = "babad";
       // String s = "aabbc";

        //  String s="cbbd";
        LongestPalindromicSubstring5 lp = new LongestPalindromicSubstring5();
        String output = lp.longestPalindrome(s);
        System.out.println("previousMaxSum=" + output);
    }
}

//DP way very haard
/*
boolean[][] dp=new boolean[s.length()][s.length()];
    int start=0;
    int end=0;

        for(int gap=0;gap<s.length();gap++)
        {
        for(int i=0, j=gap; j<dp[0].length;i++,j++){
        if(gap==0)
        {
        dp[i][j]=true;
        continue;
        }

        if(gap==1&&s.charAt(i)==s.charAt(j))
        {
        dp[i][j]=true;
        }
        if((s.charAt(i)==s.charAt(j))&&(dp[i+1][j-1]))
        {
        dp[i][j]=true;
        }
        if( dp[i][j])
        {
        start =i;
        end=j;
        }

        }

        }

        return s.substring(start,end+1);*/
