package Interview;

public class ThreadDemo {

     static int x =0;


    public  void methodA(Runnable method){

        for(int i=0;i<10000000;i++){

            x=x+1;
        }
        method.run();
      System.out.println("x is"+x);
    }
    public static void main(String[] args){
        ThreadDemo demo= new ThreadDemo();


        Runnable r1 = () -> System.out.println("X is "+x);




        Thread t1 = new Thread(()->{

            demo.methodA(r1);
        });
        Thread t2 = new Thread(()->{

            demo.methodA(r1);
        });   Thread t3 = new Thread(()->{

            demo.methodA(r1);
        });   Thread t4 = new Thread(()->{

            demo.methodA(r1);
        });   Thread t5= new Thread(()->{

            demo.methodA(r1);
        });


        t1.start();
         t2.start();
         t3.start();
        t4.start();
        t5.start();

      //  System.out.println("x is="+demo.x);

    }
}
