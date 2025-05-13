package Basics.binary;

public class IntArrayToLong {
    public static void main(String[] args) {
        int[] intArray = {123, 456, 789, 321, 654, 987};

        long result = 0;
        for (int i = 0; i < intArray.length; i++) {
            result <<= 32;
            result |= (intArray[i] & 0xFFFFFFFFL);
        }

        System.out.println("Converted long value: " + result);
    }
}
