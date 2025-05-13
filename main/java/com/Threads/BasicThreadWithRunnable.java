package com.Threads;

public class BasicThreadWithRunnable implements Runnable  {

    public static void main(String[]  args)
    {
      //Traditional Way
        // Step 1: Create a Runnable object
       /* Runnable task = new BasicThreadWithRunnable();
        Thread t = new Thread(task);
        t.start();*/
        //t.start();//if you running twice running method1
        //Exception in thread "main" java.lang.IllegalThreadStateException
        //Traditional Way 2

       /* Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("inside runnable");
            }
        });
       t.start();*/
       /* Thread t = new Thread(()->
                System.out.println("inside runnable")
        );
        t.start();*/
        //multiple Threads with java
        for (int i = 1; i <= 3; i++) {
            Thread t = new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + " is running");
            });
            t.start();
        }

    }

    @Override
    public void run() {
        System.out.println("running method1");

    }
}
