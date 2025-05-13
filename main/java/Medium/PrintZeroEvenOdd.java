package Medium;

import java.util.function.IntConsumer;

class ZeroEvenOdd {
    private int n;

    public ZeroEvenOdd(int n) {
        this.n = n;
        System.out.println("ZeroEvenOdd called");
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {

        System.out.println("zero="+printNumber);

    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        System.out.println("even="+printNumber);

    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        System.out.println("odd="+printNumber);

    }
}

public class PrintZeroEvenOdd {

    public static void main(String[] args) {
        ZeroEvenOdd instance = new ZeroEvenOdd(7);

        new Thread(() -> {
            try {
                IntConsumer zero = null;
                zero.accept(0);
                instance.zero(zero);

            } catch (Exception e) {
            }
        }).start();

        new Thread(() -> {
            try {
                IntConsumer even = null;
                even.accept(0);
                instance.even(even);
            } catch (Exception e) {
            }
        }).start();

        new Thread(() -> {
            try {
                IntConsumer odd = null;
                odd.accept(1);
                instance.odd(odd);

            } catch (Exception e) {
            }
        }).start();


    }
    }
