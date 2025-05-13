package Java8;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String args[]) {

        Consumer<Integer> squareMe= s->System.out.println(" squareMe consumer consume and return nothing hence print output ="+s*s);
        Consumer<Integer> doubleMe= s->System.out.println(" doubleMe consumer consume and return nothing hence print output ="+3*s);

        squareMe.accept(2);
        doubleMe.accept(2);
        doubleMe.andThen(squareMe).accept(2);


    }
    }


