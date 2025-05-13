package Basics;

public class RecursionBasicFlow {

    public void recursion(int n) {

        if (n==0)
        {
            return;
        }
        System.out.println(n);
        for(int i=0;i<=3;i++) {
            recursion(n - 1);
            System.out.println("print" + n);
        }


    }

    public static void main(String[] args) {

    RecursionBasicFlow rbf=new RecursionBasicFlow();
    int n=5;
    rbf.recursion(n);

    }
    }


