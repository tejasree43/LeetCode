package com.Threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairReentrantLock {

    private static final Lock fairLock = new ReentrantLock(true); // Fair lock

    public static void main(String[] args) throws InterruptedException {

        Thread[] threads = new Thread[6];

        for (int i = 0; i <= 5; i++) {
            threads[i] = new Thread(() ->
            {
                try {
                    fairLock.lock();
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + " acquired the lock");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    fairLock.unlock();

                }
            });
        }
        // Start threads with small delay to ensure proper queuing

        for(Thread t :threads)
        {
            t.start();
            Thread.sleep(50); // Ensures threads queue in order

        }
    }
}


//remeber

        /*The Problem: Thread Startup Race Condition
        Threads start almost simultaneously due to fast loop execution

        The lock becomes available before later threads begin waiting

        Fair ordering only applies to threads already in the wait queue*/


      /* Fair ordering only works when threads are properly queued
        Without synchronization, thread startup timing can obscure fairness
        For reliable demonstrations:
        Either space out thread starts, or
        Use synchronization barriers (like CountDownLatch)
        This fixed version will clearly show the FIFO ordering behavior of fair locks.*/