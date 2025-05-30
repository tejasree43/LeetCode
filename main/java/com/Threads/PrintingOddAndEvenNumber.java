package com.Threads;



class Printer implements Runnable{

   static int counter=1;
   static Object lock=new Object();
   int reminder;

    Printer(int reminder){
      this.reminder=reminder;
    }
    public void printer(){

        System.out.println(Thread.currentThread().getName()+" ="+counter++);
    }
    @Override
    public void run() {
    for(int i=1;i<=10;i++) {
            synchronized (lock) {
                while (counter % 2 != reminder) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                    printer();
                    lock.notifyAll();
            }
        }
    }
}
public class PrintingOddAndEvenNumber {


    public static void main(String[] args){

        Printer evenObject=new Printer(0);
        Printer oddObject=new Printer(1);

        Thread even=new Thread(evenObject,"Even Thread");
        Thread odd=new Thread(oddObject,"Odd Thread");

        even.start();
        odd.start();

    }
}
