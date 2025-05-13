package Easy;

import java.util.Arrays;

public class CountingBits338 {

    public int[] countBits(int n) {
            int[] ans = new int[n + 1];
            for (int i = 0; i <= n; i++) {
                ans[i] = countSetBits(i);
            }

            return ans;
        }
        public int countSetBits(int n) {
            int count = 0;

            while (n > 0) {
                count += n & 1;
                n >>= 1;
            }

            return count;
        }
    public int countSetBitsString(int n) {
        int counter = 0;

        while (n !=0) {
         //   count += n & 1;
            if (n < 0){ // as stated: in Java if the leading bit is 1 the number is negative
                counter++; // count the number of times n becomes negative
            }
            n <<= 1;
        }

        return counter;
    }

    public static void main(String[] args) {
    CountingBits338 counting = new CountingBits338();
    int n =5;
   /* int[] output = counting.countBits(n);
    Arrays.stream(output).forEach(System.out::println);
*/
    //String b="11111111111111111111111111111101";
    //int string1= Integer.toBinaryString(n);
     //int a= -3;//31
        int a =11;//3
    int outputBinary =    counting.countSetBitsString(a);
    System.out.println("outputBinary"+outputBinary);
    }
    }


     /*    0 --> 0
                1 --> 1
                2 --> 10
                3 --> 11
                4 --> 100
                5 --> 101*/