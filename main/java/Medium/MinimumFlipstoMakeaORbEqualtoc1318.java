package Medium;

public class MinimumFlipstoMakeaORbEqualtoc1318 {

    public int minFlips(int a, int b, int c) {

        //int  a = 2, b = 6, c = 5;

        //2-0010
        //6-110
        //5 -0101

         int flips = 0;
       /*AND truth table
         0 0 -0
         0 1 -0
         1 0 -0
         1  1-1   */

        /*AND truth table
         0 0 -0
         0 1 -1
         1 0 -1
         1  1-1   */


        while(a>0||b>0||c>0){

            int bit_a = a&1;//least significant bit it will give  0010
            int bit_b = b&1;// least significant bit it will give 0110
            int bit_c = c&1;//least significant bit it will give  0101

            if(bit_c == 0){

                flips += (bit_a + bit_b);

            }
            else{
                if(bit_a==0&&bit_b==0){
                    flips += 1;
                }
            }

            a>>=1;
            b>>=1;
            c>>=1;


        }

        return flips;
    }


    public static void main(String[] args) {
      int  a = 2, b = 6, c = 5;
      MinimumFlipstoMakeaORbEqualtoc1318 minimumFlips = new MinimumFlipstoMakeaORbEqualtoc1318();
      minimumFlips.minFlips(a,b,c);
    }

    }
