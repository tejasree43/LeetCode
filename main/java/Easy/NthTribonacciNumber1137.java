package Easy;

public class NthTribonacciNumber1137 {

    public int tribonacci(int n) {

        if(n==0||n==1){
            return n;
        }

        int  T0 = 0,  T1 = 1, T2 = 1 ;

        int dp[] = new int[n+1];

        dp[0] = T0;
        dp[1] = T1;
        dp[2] = T2;

        for(int i=2;i<n;i++){

        dp[i+1] = dp[i]+dp[i-1]+dp[i-2];

         }
         return dp[dp.length-1];
    }


    public static void main(String[] args){
     NthTribonacciNumber1137 trobonacci =  new NthTribonacciNumber1137();
     int n =0;
     int output = trobonacci.tribonacci(n);
     System.out.println("output"+output);

    }
}
