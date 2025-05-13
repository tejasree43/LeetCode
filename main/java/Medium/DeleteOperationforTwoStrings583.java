package Medium;

public class DeleteOperationforTwoStrings583 {

    public int minDistance(String word1, String word2) {

        int rowLength = word1.length()+1;
        int columnLength = word2.length()+1;
        int[][] dp = new int[rowLength][columnLength];

        for(int i =1;i<rowLength;i++)
        {
            dp[i][0]=i;
        }
        for(int i =1;i<columnLength;i++)
        {
            dp[0][i]=i;
        }
        for(int i =1;i<rowLength;i++)
        {
            for(int j =1;j<columnLength;j++)
            {
                if(word1.charAt(i-1)!=word2.charAt(j-1)){


                    int minimum= Math.min( dp[i-1][j],dp[i][j-1]);
                    dp[i][j]= 1+Math.min(minimum,dp[i-1][j-1]);

                }
                else{
                    dp[i][j] = dp[i-1][j-1];


                }

            }
        }

      return dp[rowLength-1][columnLength-1];
    }


    public static void main(String[] args) {

     String word1 = "horse";
     String word2 = "roze";

     DeleteOperationforTwoStrings583 del = new DeleteOperationforTwoStrings583();
     int output =del.minDistance(word1,word2);
     System.out.println("output"+output);
    }

    }
//Dp tabular form of below
/*               i   h  o  r  s  e
    j   0 = {}  [0,  0, 0, 0, 0, 0]
    r   1 = {}  [0,    ]
    o   2 = {}  [0,  ]
    s   3 = {}  [0, ] */