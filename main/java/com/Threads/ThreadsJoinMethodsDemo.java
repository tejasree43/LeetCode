package com.Threads;

public class ThreadsJoinMethodsDemo implements Runnable {
    int processingCount = 0;
    ThreadsJoinMethodsDemo(int processingCount) {
        this.processingCount = processingCount;
        System.out.println("Thread Created"+Thread.currentThread().getName());
    }

    @Override
    public synchronized void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " started");
        while (processingCount <100) {
            try {

                System.out.println("processingCount"+processingCount);
              //  Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Thread " +Thread.currentThread().getName()  + " interrupted");
            }
            processingCount++;
        }
        System.out.println("Thread " +Thread.currentThread().getName()  + " exiting");
    }
    public static void main(String[] args) throws InterruptedException {

        ThreadsJoinMethodsDemo tj=new ThreadsJoinMethodsDemo(0);
        Thread t2 = new Thread(tj);
        ThreadsJoinMethodsDemo tj1=new ThreadsJoinMethodsDemo(1);
        Thread t1 = new Thread(tj1);

        t2.start();
        System.out.println("Invoking join");
       // t2.join();
        System.out.println("Returned from join");
        System.out.println("t2.isAlive()"+t2.isAlive());
        t1.start();
       // t1.join();  //returns immediately*/
    }

}
