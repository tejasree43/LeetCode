package Interview;

public class SharedResourceExample {
  //  private static int sharedResource = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new AccessResource());
            thread.start();
        }
    }

    static class AccessResource implements Runnable {
        int x =0;
        @Override
        public void run() {
            synchronized (SharedResourceExample.class) {
                for (int i = 0; i < 10000000; i++) {
                    x = x + 1;
                }
                System.out.println("Thread " + Thread.currentThread().getId() + " updated the shared resource to: " + x);

            }
        }

    }
}