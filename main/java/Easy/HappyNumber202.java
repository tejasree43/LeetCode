package Easy;

public class HappyNumber202 {

    public boolean isHappy(int n) {

        if(n<7&&n>1){
            return false;
        }
        if(n==1) {
            return true;
        }
        int total =0;
        while(n>0){
          int number = n%10;
          total+=number *number;
          n=n/10;
        }
        return isHappy(total);
    }
    public static void main(String[] args){

        int k= 1111111;
        HappyNumber202 happy = new HappyNumber202();
        boolean output = happy.isHappy(k);
        System.out.println(output);

    }
}
