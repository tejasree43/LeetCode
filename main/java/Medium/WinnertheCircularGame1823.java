package Medium;


public class WinnertheCircularGame1823 {

    public int findTheWinner(int n, int k) {

        if(n == 1)
            return 1;
        int element = findTheWinner(n-1 , k);

        int ans = (element+k)%n;

        return ans == 0?n:ans;
    }

    public static void main(String[] args){
    WinnertheCircularGame1823 winner = new WinnertheCircularGame1823();
    int n =5;
    int k =2;
    int result =  winner.findTheWinner(n,k);
    System.out.println("result"+result);
    }

}
