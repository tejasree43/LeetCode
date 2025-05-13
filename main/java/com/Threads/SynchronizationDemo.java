package com.Threads;

public class SynchronizationDemo {
    int counter = 0;

   private final  Object lock = new Object();

    //using synchronized keyword can control the race conditions
   /* public synchronized void  increment()
    {
        counter++;
    }
*/
    public  void  increment()
    {
        synchronized (lock) {
            counter++;
        }
    }


    //Or using
    public int getCounter() {
        return counter;
    }
    public static void main(String[] args) throws InterruptedException {

        SynchronizationDemo demoCounter = new SynchronizationDemo();

           Thread t1 = new Thread(()->
             {
            for (int i = 0;i<10000;i++)
            {
                demoCounter.increment();
            }
          });
         Thread t2 = new Thread(()->
        {
            for (int i = 0;i<10000;i++)
            {
                demoCounter.increment();
            }
           });
           t1.start();
           t2.start();
           t1.join();//// Main thread waits here until t1 finishes
           t2.join();//// Main thread waits here until t1 finishes


        System.out.println(demoCounter.getCounter());

    }

}
