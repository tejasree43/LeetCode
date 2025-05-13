package Medium;

public class EliminationGame390 {

    public int lastRemaining(int n) {
        // Base case: when n is 1, the last remaining element is 1
        if (n == 1) {
            return 1;
        }

        int half = n/2;
        final int nextLayer = lastRemaining(half);
        return (half - nextLayer + 1) * 2;
    }

    public static void main(String[] args){

    EliminationGame390 elemination = new EliminationGame390();

    int n =12;
      int result =  elemination.lastRemaining(n);
      System.out.println("result"+result);
    }
}
