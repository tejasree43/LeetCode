package ubs;
//Five threads are accessing the a shared resource .The common variable being accessed by all of them is
// 'X' and the common code being executed by all of them is
//Assuming that the  original initial value of X was zero,after each of the threads have finished running this loops, the value of x is.
public class ThreadsSharedResource {

    int x =0;
    public  void incrementCounter() {
        x=x+1;
        System.out.println("Counter: " + x + " | Thread: " + Thread.currentThread().getName());
    }

    public static void main(String[] args){

        ThreadsSharedResource th = new ThreadsSharedResource();

        int y =0;
      Runnable r1 =(()->{
              for(int i =0;i<100000;i++) {
                 th.incrementCounter();
              }
        }
      );
      for(int i =0;i<5;i++){
          Thread t1 = new Thread(r1);
          t1.start();
      }
    }
}
