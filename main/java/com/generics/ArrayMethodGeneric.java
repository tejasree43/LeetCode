package com.generics;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ArrayMethodGeneric {

    public <T> void printArray(T[] inputArray)
    {
        for(T element :inputArray)
        {
           System.out.print(element + " :");
        }

    }
    public static <T extends Number> T getNumber(T number) {
        Integer i =10;
        return number;
    }
    public <T> T[] printArray1(T[] inputArray)
    {

        StringBuilder stringBuilder = new StringBuilder();
        for(T element :inputArray)
        {
            stringBuilder.append(element);
        }
        System.out.print(stringBuilder);

         return inputArray;
    }

    public static void main(String[] args)
    {

       // Integer[] intArray ={1,2,3,4,5};
        String[] stringArray = {"teju","Ishaan","Srii"};

        ArrayMethodGeneric methodGeneric = new ArrayMethodGeneric();
        methodGeneric.printArray1(stringArray);

     // BigInteger output = methodGeneric.getNumber(bigInteger);
      System.out.println(methodGeneric.getNumber(new BigDecimal("0.038")));


    }
}
