package Easy;

public class PrintinOrder1114 {
    public PrintinOrder1114() {

    }




    public synchronized void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
    }

    public  void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();

    }

    public synchronized void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }

    public static void main(String[] args) throws InterruptedException {

        PrintinOrder1114 p=new PrintinOrder1114();


        Runnable printFirst=(()->
            System.out.println("first")

        );

        Runnable printSecond=(()->
                System.out.println("second")

        );
        Runnable printThird=new Thread(()->
                System.out.println("third")

        );

        p.first(printFirst);
        p.second(printSecond);
        p.third(printThird);



    }
}
