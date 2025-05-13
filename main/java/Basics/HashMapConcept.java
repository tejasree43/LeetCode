package Basics;

import Medium.CoinChange322;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {
    public static void main(String[] args){

     Map<String,Integer> marks=new HashMap<String,Integer>();
        marks.put("Naveen",100);
        marks.put("Tom",200);
        marks.put("Lisa",300);
        marks.put("Peter",400);
        marks.put("Robby",600);
        marks.put(null,700);

System.out.println(marks);

    }
}
