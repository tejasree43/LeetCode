package Java8;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateBiFunctionDemo {
    public static void main(String args[]) {

        BiPredicate<Integer,Integer> checkSumOfTwo=(a,b)->a+b >=10;
        System.out.println("BiPredicate sum of 2 and 3 is greater than 5 :"+checkSumOfTwo.test(3,2));
        System.out.println("BiPredicate sum of 5 and 5 is greater than 5 :"+checkSumOfTwo.test(5,5));

        BiFunction<Integer,Integer,Integer> checkSquare=(x,y)->x*y;
        System.out.println("BiFunction Multiplication of 2 and 3  :"+checkSquare.apply(3,2));
        System.out.println("BiFunction Multiplication of 5 and 5  :"+checkSquare.apply(5,5));




    }
}
