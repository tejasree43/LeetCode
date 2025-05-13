package Medium;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;

public class PrintZeroEvenOdd1116 {
    private int n;
    private AtomicInteger counter = new AtomicInteger(1);

    Semaphore zeroLock = new Semaphore(1);
    Semaphore evenLock = new Semaphore(0);
    Semaphore oddLock = new Semaphore(0);



    public PrintZeroEvenOdd1116(int n) {
        //System.out.println("counter"+counter);
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {

        for(int i=0;i<n;i++) {
            zeroLock.acquire();
            System.out.println("After release");
            printNumber.accept(0);

            System.out.println("counter in zero method"+(counter.get()));
            if(counter.get() % 2 == 0){
                evenLock.release();
            }
            else{
                oddLock.release();
            }
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {


        for (int i = 2; i <= n; i+=2) {
            System.out.println("count in even="+(counter.get()));
            evenLock.acquire();
            System.out.println("after evenLock lock acquired");

            printNumber.accept(counter.get());
            incrementAndPermitZero();
            System.out.println("even method got end");

        }

    }
    public void odd(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i+=2) {
            System.out.println("count in odd="+(counter.get()));
            oddLock.acquire();
            System.out.println("after ood lock acquired");
            printNumber.accept(counter.get());
            incrementAndPermitZero();
            System.out.println("odd method got end");

        }
    }
private void incrementAndPermitZero(){
    synchronized (this) {
        counter.getAndIncrement();
        zeroLock.release();
    }
}



    public static void main(String [] args) throws InterruptedException {

    PrintZeroEvenOdd1116 ref = new PrintZeroEvenOdd1116(2);

        IntConsumer input =a->System.out.println(a);

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
