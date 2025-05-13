package Basics;

public class PerformanceTest {
    public static void main(String[] args) {

        //case 1 with A~A!!!!!A,,,SS c
        long startTimeBoxed = System.nanoTime();
        Long sumBoxed = 0L; // Uses wrapper class
        for (long i = 0; i < 1_000_000; i++) {
            sumBoxed += i; // Autoboxing occurs in every iteration
        }
        long endTimeBoxed = System.nanoTime();
        System.out.println("Autoboxing time: " + (endTimeBoxed - startTimeBoxed) + " ns");

        long startTimePrimitive = System.nanoTime();
        long sumPrimitive = 0L; // Uses primitive type
        for (long i = 0; i < 1_000_000; i++) {
            sumPrimitive += i; // No autoboxing, better performance
        }
        long endTimePrimitive = System.nanoTime();
        System.out.println("Primitive time: " + (endTimePrimitive - startTimePrimitive) + " ns");
    }
}
