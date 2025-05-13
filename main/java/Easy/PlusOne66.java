package Easy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PlusOne66 {

    public int[] plusOne(int[] digits) {


        /*StringBuffer sb=new StringBuffer();
         for(int i=0;i<digits.length;i++){
            sb.append(digits[i]);
         }

         String s=new String(new String(sb));

        BigDecimal sum=new BigDecimal(s);

        sum= sum.add(new BigDecimal(1));

         String s1=new String(String.valueOf(sum));

         int[] output=new int[s1.length()];

         for(int i=0;i<s1.length();i++){
             int c =(int) s1.charAt(i)-'0';
             output[i]=c ;
         }*/

        // Reverse iteration of the array
        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            else
                digits[i] = 0;
        }

        // The array has only '9'
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;

        System.out.println("newDigits"+newDigits);
        return newDigits;
       // return output;

    }

    public static void main(String[] args){
        PlusOne66 po=new PlusOne66();
        int[] digits = {9};
        po.plusOne(digits);
       // System.out.println(output);
    }
}
