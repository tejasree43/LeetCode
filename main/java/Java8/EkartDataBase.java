package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {

    public static List<Customer> getAll(){
        return Stream.of(new Customer(101,"john","john@gmail.com", Arrays.asList("39396781","3939678912")),
                new Customer(102,"smith","smith@gmail.com", Arrays.asList("3939613","393967814")),
                new Customer(103,"peter","peter@gmail.com", Arrays.asList("393967815","393967816")),
                new Customer(104,"kely","kely@gmail.com", Arrays.asList("393967817","393967818"))).collect(Collectors.toList());
    }
}
