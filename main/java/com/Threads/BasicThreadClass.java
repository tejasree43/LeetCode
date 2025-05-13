package com.Threads;

public class BasicThreadClass extends Thread{

    @Override
    public void run()
    {
        System.out.println("running");
    }

    public static void main(String[]  args)
    {

       /* BasicThreadClass thread = new BasicThreadClass();
        thread.start();
*/

        Thread t1= new Thread(new BasicThreadClass());
        t1.start();


    }
}
