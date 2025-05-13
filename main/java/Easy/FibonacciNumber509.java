package Easy;

public class FibonacciNumber509 {

    public int fib(int n) {
        //Time Complexity O(2^n)
        //In recursive Way
        if(n<2)
        {
            return n;
        }
        fib(n-1);
        return fib(n-1)+fib(n-2);
    }
    public int fib2(int n) {
        //Top Down approach save the result in memoization
        // Space Complexity O(n)
        //Time Complexity O(n)
        int cache[]=new int[n+1];
        if(n<2)
        {
            return n;
        }
        if(cache[n]!=0)
        {
            return cache[n];
        }
        return cache[n]=fib(n-1)+fib(n-2);
    }

        //tweak the recursion from the solution
        //Then it became fully Dynamic programming.
        //bottom approach,Please remember the Complexity are same.
        // Space Complexity O(n)
        //Time Complexity O(n)
        public int fib3(int n) {
         int cache[]=new int[n+1];
           cache[0]=0;
           cache[1]=1;
          if(n<2)
            {
            return n;
            }
           for(int i=2;i<=n;i++)
           {
               cache[i]=cache[i-1]+cache[i-2];
           }
          return cache[n];
          }
        //Efficient Solution
        // Space Complexity O(1)
        //Time Complexity O(n)
        public int fib4(int n) {

        int first=0, second=1, sum=0;
        if(n<2)
            return n;

        for(int i=2;i<=n;i++)
        {
            sum=first+second;
            first=second;
            second=sum;
        }
       return sum;
       }

    public static void main(String[] args)
    {
      FibonacciNumber509 fb=new FibonacciNumber509();
        fb.method1( 4);
    }
    public void method1(int n){
        long startTime,endTime,executionTime=0;
        startTime=System.nanoTime();
         System.out.println("output is="+fib4(n));
        endTime=System.nanoTime();
        executionTime=endTime-startTime;
        System.out.println("execution Time is="+executionTime);
    }
}


//Input: n = 2
//Output: 1
//Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
//Input: n = 3
//Output: 2
//Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
//Input: n = 4
//Output: 3
//Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
