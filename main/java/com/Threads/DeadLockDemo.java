package com.Threads;

public class DeadLockDemo {

    final  private  Object resourec1 = new Object();
    final  private  Object resourec2 =  new Object();
    public static void main(String[] args) throws InterruptedException {

        DeadLockDemo demo = new DeadLockDemo();

         /* final   Object resourec1 = "This is resource one";
        final Object resourec2 = "This is resource two";*/

        Thread t1=new Thread(){
        public void run(){
            synchronized(demo.resourec1) {
                System.out.println("Thread 1 locked resource 1 block1");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (demo.resourec2) {
                    System.out.println("Thread 1 locked resource 2 block1");

                }
            }

        }
    };

    Thread t2=new Thread(()->{
            synchronized(demo.resourec2) {
                System.out.println("Thread 2 locked resource 2");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (demo.resourec1) {
                    System.out.println("Thread 2 locked resource 1");

                }
            }

        });

t1.start();
t2.start();

    }


}
/*
The synchronized keyword in Java is used to control access to shared resources in multithreaded environments.
        It prevents race conditions (where multiple threads modify data unpredictably) by allowing only one
        thread at a time to execute a synchronized block/method.
        1. Why Do We Need Synchronization?
        When multiple threads access shared data simultaneously:

        Problem: Threads may overwrite each other’s changes.

        Example: Two threads incrementing the same counter may produce incorrect results.*/

  /*  Proper Lock Ordering:
        Both threads now acquire locks in the same order (resource1 first, then resource2)
        This prevents circular wait conditions that cause deadlocks
*/