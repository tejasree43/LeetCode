package Easy;

public class factorial {

    public int factorialMethod(int n){

        System.out.println("n value"+n);
        if(n==0){
            return 1;
        }

            return n + factorialMethod(n-1);

    }

    public static void main(String[] args) {

        factorial fg=new factorial();
        int output = fg.factorialMethod(5);
        System.out.println("output"+output);
    }
}
