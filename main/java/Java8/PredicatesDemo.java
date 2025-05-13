package Java8;

import java.util.function.Predicate;

public class PredicatesDemo {
    public static void main(String args[]) {

        Predicate<String> predicateBooleanTest = s -> s.length() >= 9;
        System.out.println("The Interview word length more than 5: " + predicateBooleanTest.test("Interview"));
        Predicate<String> evenTest = s -> s.length() % 2 == 0;
        System.out.println("The Interview word is even word: " + evenTest.test("Interview"));
        System.out.println("And Test: " + predicateBooleanTest.and(evenTest).test("Interview"));
        System.out.println("OR Test: " + predicateBooleanTest.or(evenTest).test("Interview"));
        System.out.println("negate Test: " + predicateBooleanTest.negate().test("Interview"));


    }

}
