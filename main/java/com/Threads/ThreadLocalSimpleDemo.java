package com.Threads;

public class ThreadLocalSimpleDemo {


    private static ThreadLocal<Integer> ThreadLocalCounter1 = ThreadLocal.withInitial(()->0);

    public static void main(String[] args) throws InterruptedException {


        Runnable task =(()->{
            for(int i =0;i<4;i++) {
                int counter = ThreadLocalCounter1.get();
                ThreadLocalCounter1.set(counter + 1);
                System.out.println("Current Thread =" + Thread.currentThread().getName() + "count the value = " + ThreadLocalCounter1.get());
            } });

     new Thread (task).start();
     new Thread (task).start();


    }
}
