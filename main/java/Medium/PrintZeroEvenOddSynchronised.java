package Medium;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;

public class PrintZeroEvenOddSynchronised {

    private  int n;
    private int currentNumberTobePrinted;
    private int currentNumber;

    public PrintZeroEvenOddSynchronised(int n) {
        this.n = n;
        this.currentNumber=1;
        this.currentNumberTobePrinted=0;
    }
    public void zero(IntConsumer printNumber) throws InterruptedException {

        while(currentNumber<=n){
        synchronized(this) {

            while (currentNumberTobePrinted != 0) {
                wait();
            }
            if(currentNumber<=n){
                printNumber.accept(0);
            }
            currentNumberTobePrinted =currentNumber;
            notifyAll();
        }
        }

    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        while(currentNumber<=n){

            synchronized(this) {

                while (currentNumberTobePrinted ==0||currentNumber%2!=0) {
                    wait();
                }
                if(currentNumber<=n){
                    printNumber.accept(currentNumber);
                }
                currentNumber +=1;
                currentNumberTobePrinted=0;
                notifyAll();
            }
        }



    }
    public void odd(IntConsumer printNumber) throws InterruptedException {
        while(currentNumber<=n){

            synchronized(this) {

                while (currentNumberTobePrinted ==0||currentNumber%2==0) {
                    wait();
                }
                if(currentNumber<=n){
                    printNumber.accept(currentNumber);
                }
                currentNumber +=1;
                currentNumberTobePrinted=0;
                notifyAll();
            }
        }

    }

    public static void main(String [] args) throws InterruptedException {

        PrintZeroEvenOdd1116ReentrantLock ref = new PrintZeroEvenOdd1116ReentrantLock(3);

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
