package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String args[]) {

        List<Integer> inputList=new ArrayList<>();
        inputList.add(5);
        inputList.add(15);
        inputList.add(25);
        inputList.add(26);
        //Filter on Streams
        List<Integer> newList=null;
        newList= inputList.stream().filter(s->s%5==0).collect(Collectors.toList());
        newList.stream().forEach(s->System.out.println("Stream="+s));

        //parallel Stream
        newList= inputList.parallelStream().filter(s->s%2==0).collect(Collectors.toList());
        newList.parallelStream().forEach(s->System.out.println("parallelStream="+s));

        //Map on Streams
       // inputList.stream().map(s->s*s).forEach(x->System.out.println("map for square="+x));
        newList=  inputList.stream().map(s->s*s).collect(Collectors.toList());
        newList.forEach(x->System.out.println("map for square="+x));

    }

}
