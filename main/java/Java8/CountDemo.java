package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountDemo {


    public static void main(String[] args){

        String s="i love my india";
       Stream<String>  stringWords=Arrays.stream(s.split("\\s+"));
        long count=stringWords.count();
        System.out.println("output"+count);

        char compare='i';
       long occurenceOutput= s.chars().filter(ch->ch==compare).count();
       System.out.println("occurenceOutput"+occurenceOutput);



    }
}
