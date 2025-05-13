package Interview;

public class loopsDemo {
    static boolean checkPronic(int x)
    {

        for (int i = 0; i <= (int)(Math.sqrt(x));
             i++) {

            // Check for Pronic Number by
            // multiplying consecutive
            // numbers
            if ((x == i * (i + 1)) != false) {
                return true;
            }
        }
        return false;
    }

    public static int solution(int A, int B) {
        int count = 0;

        // Iterate from A to B
        for (int i = A; i <= B; i++) {

            // If i is pronic
            if (checkPronic(i) != false) {

                // Increment count
                count++;
            }
        }

        // Print count
        System.out.print(count);

        return count;
    }

    public static void main(String[] args) {
        loopsDemo .solution(6,20);
    }

}
