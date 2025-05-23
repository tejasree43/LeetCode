package Medium;

public class EditDistance72 {

    public int minDistance(String word1, String word2) {

        int m = word2.length()+1;
        int n = word1.length()+1;

        int dp [][] = new int[word2.length()+1][word1.length()+1] ;
        dp[0][0] = 0;

        for(int i =1;i<dp[0].length;i++){
          dp[0][i] = i;
        }
        for(int i =1;i<dp.length;i++){
            dp[i][0] = i;
        }

        for(int i = 1;i<dp.length;i++){

           for(int j =1;j<dp[0].length;j++) {
               if(word2.charAt(i-1)!=word1.charAt(j-1)){
                   int minValue= Math.min( dp[i-1][j],dp[i][j-1]);
                  dp[i][j] = Math.min(minValue,dp[i-1][j-1])+1;

               }
               else{
                   dp[i][j] = dp[i-1][j-1];

               }
           }
       }
            return dp[m-1][n-1];
    }

    public static void main(String[] args) {


     EditDistance72 editDistance = new EditDistance72();
     String   word1 = "horse";
     String   word2 = "ros";
     editDistance.minDistance(word1,word2);
    }
    }
