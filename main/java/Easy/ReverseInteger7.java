package Easy;

public class ReverseInteger7 {

    public  static int reverse(int x) {

        long rev = 0;
        while (x != 0) {
            int lastDig = x%10;
            rev= lastDig+rev*10;
            x = x/10;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }
        if (x < 0) {
            return (int) (-1 * rev);
        }
        return (int)rev;
    }

         public static int reverse1(int x) {
            long finalNum = 0;
            while(x!=0){
                int lastDig = x%10;
                finalNum += lastDig;
                finalNum =finalNum*10;
                x= x/10;
            }
            finalNum = finalNum/10;

            System.out.println("finalNum"+finalNum);

            if(finalNum > Integer.MAX_VALUE || finalNum<Integer.MIN_VALUE){
                return 0;
            }
            if(x<0){
                return (int)(-1*finalNum);
            }

            return (int)finalNum;
        }


    public static void main(String[] args)
    {
      int output=  reverse(1534236469);
      int output1=  reverse1(1534236469);
        System.out.println("output="+output);
        System.out.println("output1="+output1);
    }
}
