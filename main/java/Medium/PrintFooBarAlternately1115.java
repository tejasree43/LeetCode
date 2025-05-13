package Medium;

import java.util.function.IntConsumer;

public class PrintFooBarAlternately1115 {
    private int n;

    int currentNumber;
    public PrintFooBarAlternately1115(int n) {
        this.n = n;
        this.currentNumber=0;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            synchronized (this) {
                while (currentNumber%2!=0) {
                    wait();
                }
            // printFoo.run() outputs "foo". Do not change or remove this line.
                currentNumber +=1;
                printFoo.run();
                notifyAll();

            }
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
                synchronized (this) {
                    while (currentNumber % 2 == 0||currentNumber==0) {
                        wait();
                    }
                    currentNumber +=1;
                    printBar.run();
                    notifyAll();
                }
            }
        }

    public static void main(String [] args) throws InterruptedException {

        PrintFooBarAlternately1115 ref = new PrintFooBarAlternately1115(3);


        Runnable fooRunnable= () -> System.out.println("foo");

        Runnable barfooRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("bar");
            }
        };

        Thread t1 = new Thread(()->{
        try {
            ref.foo(fooRunnable);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    });

    Thread t2 = new Thread(()->{
        try {
            ref.bar(barfooRunnable);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    });

        t1.setName("a thread ");
        t1.start();
        t2.setName("b thread ");
        t2.start();

    }
}