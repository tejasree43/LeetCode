package Medium;

public class DominoandTrominoTiling790 {

    public int numTilings(int n) {

        int[] dp = new int[n+3];

        dp[0] = 0;
        dp[1] = 2;
        dp[2] = 5;
    for(int i=3;i<n;i++){

        dp[i] = 2*dp[i-1] +dp[i-3];
    }
   return dp[n-1];
    }

    public static void main(String[] args) {

    int n =3;
    DominoandTrominoTiling790 domino = new DominoandTrominoTiling790();
    int output = domino.numTilings(n);

    System.out.println("output"+output);
    }

    }
