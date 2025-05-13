package Easy;

import java.text.ParseException;

public class ReverseBits190 {

    public int reverseBits(int num) {


        int result = 0, temp = num, bit;
        for (int i = 0; i <= 31; i++) {// 32 bits in an integer and starting from i=0
            // because in the first iteration we are checking the last bit withour shifting the bits of temp

            bit = (temp >> i) & 1;//shifting the bits of temp to right by i places and then AND with 1 to get the last bit
            result = result | (bit << (31 - i));//shifting the bit to left by 31-i places and then OR with result


        }
        return result;

    }

    public static void main(String[] args) {
        int num = 11;
        ReverseBits190 reverse = new ReverseBits190();

       int number= reverse.reverseBits(num);
       System.out.println(number);

    }
}
