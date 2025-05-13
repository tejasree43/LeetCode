package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class mapDemo {


    public static void main(String[] args){

        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.stream().map(i->i*5).forEach(System.out::println);
        List<String> list2=new ArrayList<>();
        list2.add("teju");
        list2.add("sri");
        list2.add("abc");
        list2.add("teju");
        list2.add("efg");
        Map<String,Long> collect = list2.stream()
                .collect( Collectors.groupingBy( Function.identity(), Collectors.counting() ));

        System.out.println(collect);

    }
}
