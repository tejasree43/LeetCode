package Easy;

public class ClimbingStairs70 {
    public int climbStairs(int n) {

   //loops solution
      /*  if(n==0){
            return n;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int first=1;
        int second=2;
        int third=0;

        for(int i=3;i<=n;i++){
            third=first+second;
            first=second;
            second=third;
        }
        return third;*/

        //DP solution:

        int[] dp=new int[n+1];

        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<=n;i++){

           dp[i] =dp[i-1]+dp[i-2];

        }


            return  dp[n];

    }

    public static void main(String[] args){
     int n=5;
     ClimbingStairs70  cs=new ClimbingStairs70();
        int output=cs.climbStairs(n);
        System.out.println("output"+output);
    }
}
