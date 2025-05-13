package Interview;

public class ProductOfConsecutiveIntegers {

    public static int solution(int A, int B) {

      int count = 0;
      int X =1;

      while(true){

       long  product =  X *(X+1);

          if(product>B){
            break;
          }
         if (product>=A&&product<=B){
              count++;
          }
          X++;

      }
        return count;
    }


    public static void main(String[] args){

        int A = 6, B = 30;
        int output = solution(A,B);
        System.out.println("output here"+output);
    }
}



    /*Write a function solution that, given two integers A and B, returns the number of integers from the range [A..B] (ends are included) which can be expressed as the product of two consecutive integers, that is X^ * (X + 1) for some integer X. test-inp Examples:
     1. Given A = 6 and B = 20 the function should return 3. These Integers are: 6=2*3, 12-34 and 20 =
        Write a function solution that, given two integers A and B, returns the number of integers from the range [A..B] (ends are included) which can be expressed as the product of two consecutive integers, that is X^ * (X + 1) for some integer X.

        test-inp

        Examples:

        1. Given A = 6 and B = 20 the function should return 3. These Integers are: 6=2*3, 12=3*4 and 20 = 4*5.

        2. Given A = 21 and B = 29 , the function should return 0. There are no integers of the form X^ * (X + 1) in this interval

        Write an efficient algorithm for the following assumptions:

        A and B are integers within the range [1 1,000,000,000), As B*/