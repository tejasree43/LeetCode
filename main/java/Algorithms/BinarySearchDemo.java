package Algorithms;

import java.util.Arrays;

public class BinarySearchDemo {

    public static int BinarySearch(int[] numbers,int targetValueIndex)
    {

        int low=0;
        int high=numbers.length-1;

        while (high>=low)
        {
         System.out.println("high:"+high);
         System.out.println("low:"+low);
         int midPosition= (low+high)/2;
         int midValue = numbers[midPosition];
         System.out.println("inside while loop");
         System.out.println("midPosition:"+midPosition);
         System.out.println("midValue:"+midValue);


          if(midValue==targetValueIndex)
         {
            System.out.println("inside if loop1");
            return midPosition;
         }
        if( midValue < targetValueIndex)
        {
            System.out.println("inside if loop2");
            low = midPosition +1;
            System.out.println("low="+low);
            System.out.println("high"+high);


        }
        else //high than midvalue
        {
            System.out.println("inside else loop");
            high = midPosition -1;


        }

        }
        return -1;
    }

    public static void main(String[] args)
    {

      int n[] = { 1,2,4,5,7,9,11};
      int target = 8;
      int output = BinarySearchDemo.BinarySearch(n,target);
      System.out.println("output" +output);
      int binaryOutput=  Arrays.binarySearch( n,output);
      System.out.println("binaryOutput" +binaryOutput);

    }
}
