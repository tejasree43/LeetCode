package Medium;


import java.math.BigInteger;
import java.math.BigInteger;


public class MultiplyStrings43 {
    public String multiply(String num1, String num2) {

       // BigInteger number1= new BigInteger(num1);
       // BigInteger number2= new BigInteger(num1);

        BigInteger number1= new BigInteger(num1);
        BigInteger number2=  new BigInteger(num2);
        BigInteger sum=number1.multiply(number2);
        String s= String.valueOf(sum);
        return s;
    }

    public static void main(String[] args){
        MultiplyStrings43 ms=new MultiplyStrings43();
        String num1 = "498828660196", num2 = "840477629533";
       String output= ms.multiply(num1,num2);

       System.out.println(output);
    }

}
