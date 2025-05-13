package Basics;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args){

       LinkedHashSet<Integer> linkSet=new LinkedHashSet<>();

        linkSet.add(4);
        linkSet.add(1);
        linkSet.add(2);
        linkSet.add(3);
        linkSet.add(4);

        System.out.println(linkSet);



    }
}
