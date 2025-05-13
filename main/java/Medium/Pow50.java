package Medium;

import java.math.BigDecimal;

public class Pow50 {


    Double output;
    public Double myPow(double x, int n) {
        double sum=x;
        recursion(x,n,sum);
        return output;
    }

    private void recursion(double x, int n,double total) {
        if(n==1)
        {
            System.out.println(total);
            BigDecimal bd = new BigDecimal(total
            );

            output= (1/total);
            return ;
        }
        if(n>0) {
            total = total * x;
            recursion(x, n - 1, total);
        }
        else{
            total = total * x;
            recursion(x, n + 1, 1/total);
        }
    }

    public static void main(String[] args){
        Pow50 pm=new Pow50();
        double x =34.00515;
        int n = -3;
        pm.myPow(x,n);
    }
}
