package Interview;


import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

//10,12,3,1,7,6,4,2,7
public class StreamComparatorExample {

    public static void main(String[] args) {


     int[] input = {10,12,3,1,7,6,4,2,7};
        input=  Arrays.stream(input).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();

        System.out.println("Sorted Array (Descending Order): " + Arrays.toString(input ));
    }

    }
