package com.Threads;

public class MacqThreadDemo {
     public  synchronized void A() {
        System.out.println("method A runing");
        B();

    }
    public  synchronized  void B() {
        System.out.println("method B runing");

    }

    public static void main(String[] args)
    {

        MacqThreadDemo mt=new MacqThreadDemo();
        Runnable t2=()->{
            System.out.println("system runing");
            mt.A();
        };
        Thread t= new Thread(t2);
        t.start();


    }


}
