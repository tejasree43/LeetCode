package Medium;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;

public class PrintZeroEvenOdd1116ReentrantLock {
    private  int n;
    private int currentNumberTobePrinted;
    private int currentNumber;

   private Lock lock = new ReentrantLock();
    private Condition semZero =lock.newCondition();
    private Condition semEven =lock.newCondition();
    private Condition semOdd =lock.newCondition();

    public PrintZeroEvenOdd1116ReentrantLock(int n) {
        this.n = n;
        this.currentNumber=1;
        this.currentNumberTobePrinted=0;
    }
    public void zero(IntConsumer printNumber) throws InterruptedException {
        lock.lock();
        while(currentNumber<=n){
         while(currentNumberTobePrinted!=0)
         {
             semZero.await();
         }
       if(currentNumber<=n){
             printNumber.accept(0);
        }
         currentNumberTobePrinted = currentNumber;
         if(currentNumber%2==0){

             semEven.signal();
         }
         else{
             semOdd.signal();
         }
        }
        lock.unlock();

    }

    public void even(IntConsumer printNumber) throws InterruptedException {

        lock.lock();

        while(currentNumber<=n){

            while(currentNumberTobePrinted==0||currentNumber%2!=0){

                semEven.await();
            }

            if(currentNumberTobePrinted<=n){

                printNumber.accept(currentNumberTobePrinted);
            }

            this.currentNumber += 1;
            currentNumberTobePrinted=0;

            semZero.signal();
        }
        lock.unlock();



    }
    public void odd(IntConsumer printNumber) throws InterruptedException {
        lock.lock();

        while(currentNumber<=n){


            while(currentNumberTobePrinted==0||currentNumber%2==0){

                semOdd.await();
            }

            if(currentNumberTobePrinted<=n){

                printNumber.accept(currentNumberTobePrinted);
            }

            this.currentNumber += 1;
            currentNumberTobePrinted=0;
            semZero.signal();
        }
        lock.unlock();

    }

    public static void main(String [] args) throws InterruptedException {

        PrintZeroEvenOdd1116ReentrantLock ref = new PrintZeroEvenOdd1116ReentrantLock(2);

        IntConsumer input = a->System.out.println(a);

        Thread t1 = new Thread(()->{
            try {
                ref.zero(input);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(()->{
            try {
                ref.even(input);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t3 = new Thread(()->{
            try {
                ref.odd(input);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.setName("a thread ");
        t1.start();
        t2.setName("b thread ");
        t2.start();
        t3.setName("c thread ");
        t3.start();


    }
}
