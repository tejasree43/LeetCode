package Basics.binary;

public class simpleBinaryToDecimal {
    public int binaryToDecimal(int binaryNumber){


     String s1 = new String(String.valueOf(binaryNumber));

     int sum = 0;
     int i = s1.length()-1;
     for(char ch :s1.toCharArray()){

     int ch1 =ch-'0';
     int pow = (int) Math.pow(2,i)*ch1;
     sum +=pow;
     System.out.println("pow"+pow);
     i--;

     }

        System.out.println(Math.pow(2,4));

        System.out.println(s1.length());

        return sum;
    }

    public static void main(String[] args)
    {
    int binaryNumber = 10110;
    simpleBinaryToDecimal simpleBinary = new simpleBinaryToDecimal();
    int output = simpleBinary.binaryToDecimal(binaryNumber);
    System.out.println("output"+output);


    }
}
