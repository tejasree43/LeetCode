package com.Threads;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairOrderingWithoutsleep {

    private static final Lock fairLock = new ReentrantLock(true); // Fair lock

    public static void main(String[] args) throws InterruptedException {

        int numberofThreads = 6;
        CountDownLatch countDownStartLatch = new CountDownLatch(1);

        for (int i = 0; i < numberofThreads; i++) {
            final int threadId = i;
            new Thread(() ->
            {
                try {
                    countDownStartLatch.await();
                    fairLock.lock();
                    System.out.println(Thread.currentThread().getName() + " acquired the lock");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    fairLock.unlock();

                }
            },("pickThread"+threadId)).start();
        }

        countDownStartLatch.countDown();  // Release all threads simultaneously


    }
}


      /*
       Avoid Thread.sleep() for synchronization (use barriers like CountDownLatch).

        Fair locks guarantee FIFO ordering but hurt performance.

        Non-fair locks are default for good reason (better throughput).

        For most cases, non-fair locks with proper synchronization are preferable. Only use fair mode when you must enforce strict ordering.*/


    /*Key Takeaways
Phaser = CountDownLatch + CyclicBarrier + more flexibility

        Ideal for multi-phase parallel computations

        Supports dynamic thread participation

        More complex API but more powerful

        For most basic needs, CountDownLatch or CyclicBarrier may suffice, but Phaser excels in complex synchronization scenarios.*/