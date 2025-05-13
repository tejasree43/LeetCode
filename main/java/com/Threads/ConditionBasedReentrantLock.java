package com.Threads;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionBasedReentrantLock {

    private Queue<Integer> queue = new LinkedList<>();
         //private final  Lock reLock = new ReentrantLock();//without fair lock
         private final  Lock reLock = new ReentrantLock(true);//fair lock
         Condition queueNotFull =  reLock.newCondition();
         Condition queueNotEmpty =  reLock.newCondition();
          int capacity = 5;




    private void produceItem(int item)  {
        System.out.println("inside produce Item" +item);

           reLock.lock();
           try {

               while (queue.size() == capacity) {
                   System.out.println("lock is going to wait");
                   try {
                       queueNotFull.await();
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }
               queue.add(item);
               queueNotEmpty.signal();
           }
           finally {
               reLock.lock();
           }
        }



    private int consumeItem() {


        int result = 0;
        try {
            reLock.lock();
            while (queue.isEmpty()) {
                System.out.println("lock in block 2 is going to wait in block 2");
                try {
                    queueNotEmpty.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            result = queue.poll();
            queueNotFull.signal();
            System.out.println("result" + result);
        } finally {
            reLock.unlock();

        }
        return result ;
    }

    public static void main(String[] args) throws InterruptedException {
        ConditionBasedReentrantLock classInstance = new ConditionBasedReentrantLock();
        AtomicInteger producedCount = new AtomicInteger();
        AtomicInteger consumerCount = new AtomicInteger();

        Thread producer = new Thread(()->
        {
            for (int i = 1; i < 9; i++) {
                System.out.println(Thread.currentThread().getName() + " acquired the lock");
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
            for (int j = 1; j <= 3; j++) {
                System.out.println(Thread.currentThread().getName() + " acquired the lock");
                classInstance.consumeItem();
                consumerCount.incrementAndGet();

            }
        }
        );
        producer.start();
        consumer.start();
        Thread.sleep(3000);
        consumer.join();
        System.out.println("producer count"+producedCount);
        System.out.println("consumer count"+consumerCount);



    }
}

/*

        await()=	Releases lock and waits (similar to wait())
        signal()=	Wakes one waiting thread (similar to notify())
        signalAll()=	Wakes all waiting threads (similar to notifyAll())
        awaitNanos(long)=	Waits with timeout in nanoseconds
        awaitUninterruptibly()=	Waits ignoring interrupts*/

/*
3.      Key Advantages Over synchronized
        Feature	synchronized + wait()/notify()	ReentrantLock + Condition
        Multiple wait sets	Single wait set	Multiple conditions (e.g., notFull, notEmpty)
        Fairness	No guaranteed order	Configurable fair locking
        Interruptible	Basic support	lockInterruptibly() available
        Timeout	Not supported	awaitNanos(), await(time, unit)
        Non-blocking try	No	tryLock() available

        5. When to Use This Approach
        Need multiple condition queues (e.g., separate "not full" and "not empty" conditions)
        Require advanced features like:
        Fair ordering
        Try-lock
        Interruptible lock acquisition
        Timed waits
        Higher performance in high-contention scenarios


        Lock lock = new ReentrantLock(); // Default: non-fair
        Behavior:
        When the lock becomes available, any waiting thread might acquire it
        No guarantee about which thread gets the lock next

        Advantage:
        Higher throughput (better performance)

        Disadvantage:
        Possible thread starvation (some threads may wait indefinitely)

        2. Fair Mode
java
Lock lock = new ReentrantLock(true); // Fair lock
Behavior:

When the lock becomes available, it's given to the thread that has been waiting the longest (FIFO order)

Advantage:

Prevents thread starvation

Predictable ordering

Disadvantage:

Lower performance (extra overhead to maintain queue order)

        3. Key Differences
         Feature	       Fair Lock	                       Non-Fair Lock
         Ordering	       FIFO (oldest waiter gets lock)	   Unspecified (any thread can grab lock)
         Performance	   Slower (due to queue management)	   Faster (no queue tracking)
         Starvation Risk   No (guaranteed eventual access)	   Yes (some threads may wait indefinitely)
         Use Case	       When fairness is critical	       When maximum throughput is needed

*/
