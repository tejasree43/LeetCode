package com.Threads;

public class DeadLockFixDemo {

    private final Object resourec1=new Object();
    private final Object resourec2=new Object();


    public static void main(String[] args) throws InterruptedException {
        DeadLockFixDemo demo = new DeadLockFixDemo();
        Thread t1=new Thread(){
            public void run(){
                synchronized(demo.resourec1) {
                    System.out.println("Thread 1 locked resource 1 block1");
                    try {
                        demo.resourec1.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (demo.resourec2) {
                        System.out.println("Thread 1 locked resource 2 block1");

                    }
                }

            }
        };
        Thread t2= new Thread(()->{
            synchronized(demo.resourec1) {
                System.out.println("Thread 2 locked resource 1 block 2");

                demo.resourec1.notify();

                synchronized (demo.resourec2) {
                    System.out.println("Thread 2 locked resource2 block2");

                    System.out.println("Thread 2 locked resource 1 block2");

                }
            }

        });

        t1.start();
        Thread.sleep(100);
        t2.start();


    }
}

   /* wait() and notify() in Java Multithreading

    These methods are used for thread coordination and are part of Java's built-in inter-thread communication
   mechanism. They allow threads to pause execution and signal each other when conditions change.
*/
/*  Proper Lock Ordering:
        Both threads now acquire locks in the same order (resource1 first, then resource2)
        This prevents circular wait conditions that cause deadlocks
*/