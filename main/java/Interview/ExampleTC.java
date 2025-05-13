package Interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExampleTC {

    public void countNumber(String input){

        HashMap<Character,Integer> hMap = new HashMap<>();
        int count =1;
       for( char c :input.toCharArray()){

           if(hMap.containsKey(c)) {
               hMap.put(c, hMap.get(c)+1);
           }
           else{
               hMap.put(c, count);
           }

       }
System.out.println(hMap);




    }

    public static void main(String[] args){
        //char occurrences
        String str = "Greetings Hello World";
       String[] strInsta= str.split("/s");
        ExampleTC exam = new ExampleTC();
       //exam.countNumber(str);

        //List<String> words = Arrays.asList( "👋", "Welcome", "to", "the", "java", "world" );
        List<String> words = Arrays.asList( strInsta);

        Map < Character , Long > charFrequency =
                words.stream()  //Stream<String>
                        .flatMap( a -> a.chars().mapToObj( c ->(char) c ) )  // Stream<Character>
                        .collect(
                                Collectors.groupingBy( Function.identity(), Collectors.counting() )
                        );

        System.out.println( charFrequency ) ;
        //word occurrences

        List<String> listOfWords =Arrays.asList("sunil","amil","anils","sunil");

        Map<String,Long>  wordFrequency = listOfWords.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println( wordFrequency ) ;
        List<String> newWords1=  listOfWords.stream().distinct().collect(Collectors.toList());

        System.out.println( newWords1 ) ;

    }
}

