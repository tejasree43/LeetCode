package com.Threads;

public class BulDemo{



    public static void main(String[] args) throws InterruptedException {

        Addition a=new Addition();
        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("Thread t1 running");
                a.addMethod(1,1);
            }
        });
        Thread t2= new Thread(new Runnable() {
            @Override
            public void run() {
                a.addMethod(2,3);
                System.out.println("Thread t2 running");
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

    }

}

class Addition {
    int sum;
    public synchronized void addMethod(int a, int b) {
     sum=sum+a+b;
     System.out.println("Sum="+sum);
    }
}

