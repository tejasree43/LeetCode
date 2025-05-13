package com.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardExample {

    //WildCard List

    public void printList(List<?> inputList)
    {

        for(Object element :inputList)
        {
            System.out.println(element + "=");
        }

    }

    public void wildUpperBoundt(List<? super Number> inputList)
    {

        for(Object element :inputList)
        {
            System.out.println(element + "=");
        }

    }

    public static void main(String[] args) {

        WildCardExample wild = new WildCardExample();

        List<String> listString = new ArrayList<>();
        listString.add("teju");
        listString.add("Ishaan");
        listString.add("Srii");

       /* List<BigDecimal> listInteger = new ArrayList<>();
        listInteger.add(new BigDecimal(38));
        listInteger.add(new BigDecimal(48));
        listInteger.add(new BigDecimal(21));
*/
        List<Number> listFloat = new ArrayList<>();
        listFloat.add(0.91F);


        WildCardExample wildCardExample = new WildCardExample();
        wildCardExample.wildUpperBoundt(listFloat);

    }
}
