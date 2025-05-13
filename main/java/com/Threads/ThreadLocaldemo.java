package com.Threads;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocaldemo {
    private static ExecutorService threadPool= Executors.newFixedThreadPool(10);

    public static ThreadLocal<SimpleDateFormat> dateFormatter=ThreadLocal.withInitial(()->new SimpleDateFormat("yyyy-MM-dd"));

   /* public static ThreadLocal<SimpleDateFormat> dateFormatter1=new ThreadLocal<SimpleDateFormat>(){


      @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd");
        }

        @Override
        public SimpleDateFormat get() {
            return super.get();
        }
    };*/
    public static void main(String[] args) throws InterruptedException {

       /* long l =1681221287974L
      while()
        new Thread(()->{

            String birthhDatnew =new ThreadLocaldemo().birthDate(1681221287974L);
            System.out.println("birthhDatnew"+birthhDatnew);
        }).start();
       new Thread(()->{

            String birthhDatnew1 =new ThreadLocaldemo().birthDate(1680421287975L);
            System.out.println("birthhDatnew1"+birthhDatnew1);

        }).start();*//*

        Thread.sleep(1000);



        }*/

        System.out.println("started");
       long startTime=System.currentTimeMillis();
        for(int i=0;i<100;i++){
            int finalI = i;
            threadPool.submit(()->{
               // String birthhDatnew1 =new ThreadLocaldemo().birthDate(1680421287975L+ finalI);
                String date = dateFormatter.get().format(new Date());

                System.out.println("birthhDateFromThreadPool"+date);
            });
        }
        long endTime=System.currentTimeMillis();
        System.out.println("ended");

    }
}
