package Java8;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String args[]) {

        Function<Integer,Integer> doubleIt= i->2*i;
        Function<Integer,Integer> CubeIt= i->i*i*i;

        //Function Chaining
        System.out.println("squareFunction: "+doubleIt.apply(5));
        System.out.println("AndThen output: "+doubleIt.andThen(CubeIt).apply(5));
        System.out.println("compose output: "+doubleIt.compose(CubeIt).apply(5));



    }
    }

