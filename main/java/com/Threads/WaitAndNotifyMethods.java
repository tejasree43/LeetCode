package com.Threads;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public class WaitAndNotifyMethods {

    private Queue<Integer> queue = new LinkedList<>();
    private final Object lock = new Object();
    int capacity = 4;




    private void produceItem(int item) {
        System.out.println("inside produce Item" +item);


        synchronized (lock) {

            while (queue.size() == capacity) {
                try {
                    System.out.println("lock is going to wait");
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            queue.add(item);
            lock.notifyAll();
        }

    }

    private int consumeItem() {

        int result = 0;
        synchronized (lock) {
            while (queue.isEmpty()) {
                try {
                    System.out.println("lock in block 2 is going to wait in block 2");
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            result = queue.poll();
            lock.notifyAll();
            System.out.println("result"+result);

        }
       // lock.notifyAll(); //Must be called from a synchronized block (otherwise, IllegalMonitorStateException).


        return result;

    }

    public static void main(String[] args) throws InterruptedException {

        WaitAndNotifyMethods classInstance = new WaitAndNotifyMethods();
        AtomicInteger producedCount = new AtomicInteger();
        AtomicInteger consumerCount = new AtomicInteger();

          Thread producer = new Thread(()->
             {
             for (int i = 1; i < 7; i++) {
                 classInstance.produceItem(i);
                 producedCount.incrementAndGet();
             }
            }
            );

        Thread consumer = new Thread(()->
        {

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int j = 1; j <= 2; j++) {
                classInstance.consumeItem();
                consumerCount.incrementAndGet();

            }
        }
        );
        producer.start();
        consumer.start();
        Thread.sleep(7000);
        //consumer.join();
        System.out.println("producer count"+producedCount);
        System.out.println("consumer count"+consumerCount);


    }
}

 /* wait() and notify() in Java Multithreading

    These methods are used for thread coordination and are part of Java's built-in inter-thread communication
    mechanism. They allow threads to pause execution and signal each other when conditions change.

    Core Rules:
    Must be called from a synchronized block (otherwise, IllegalMonitorStateException).
    wait() releases the lock temporarily (unlike sleep()).
    notify()/notifyAll() must hold the same lock.

    Spurious Wakeups: A thread can wake up without notify() (due to OS/VM quirks).
*/

       /*5. Common Pitfalls
        Forgetting to use synchronized → IllegalMonitorStateException
        Using if instead of while → Race conditions
        Holding locks too long → Performance bottlenecks
        Nested monitor lockout (deadlock when using multiple locks)*/
