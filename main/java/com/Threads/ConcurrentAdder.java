package com.Threads;

public class ConcurrentAdder {

    int start;
    int end;
    int sum;
    public ConcurrentAdder(int start, int end) {
        this.start = start;
        this.end = end;
        this.sum = 0;
    }

    public void add() {
        for (int i = this.start; i <= this.end; i++) {
            this.sum += i;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ConcurrentAdder ca = new ConcurrentAdder(1, 5000);
        ConcurrentAdder ca1 = new ConcurrentAdder(5001, 10000);

        Thread t1 = new Thread(() -> {
            ca.add();
        });
        Thread t2 = new Thread(() -> {
            ca1.add();
        });
        System.out.println("Before thread starts");

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("After thread completes");

        System.out.println(ca.sum+ca1.sum);
    }
}
