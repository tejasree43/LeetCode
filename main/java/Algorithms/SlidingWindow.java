package Algorithms;

import java.util.Arrays;

public class SlidingWindow {


 public static  int  maxContiguousArray(int[] input,int k)
    {

        int maxSum=0;
        int i=0;

        //while loop approach
      /*  while(i<=input.length-k)
        {
          int windowSum=0;

            for(int j=i;j<i+k;j++) //additional care i+k;
            {
                windowSum+=(input[j]);
            }
           *//* if(windowSum>maxSum)
            {
                maxSum=windowSum;
            }*//*
            maxSum=Math.max(windowSum,maxSum);
           // k++;
            System.out.println("maxSum"+maxSum);
            System.out.println("windowSum"+windowSum);
            i++;

        }*/


        //Brute Force Solution
        //Time Complexity  O(n*k)
       /* for(int i=0;i<input.length-k;i++)
        {

            for(int j=i;j<k;j++)
            {
              windowSum=windowSum+(input[j]);
            }
            if(windowSum>maxSum)
            {
                maxSum=windowSum;
            }
            k++;
            System.out.println("maxSum"+maxSum);
            System.out.println("windowSum"+windowSum);
            windowSum=0;
        }*/

        //Sliding window technique

       // TimeComplexity-O(n)
        int windowSum=0;

        for(int x=0;x<k;x++) {
            windowSum+=input[x];
          }
      //  windowSum= windowSum/k;

        for(int end=k;end<input.length;end++) {
            windowSum+=input[end]-input[end-k];
           // windowSum= windowSum/k;
            maxSum=Math.max(windowSum,maxSum);

            System.out.println("maxSum"+maxSum);
            System.out.println("windowSum"+windowSum);
        }

      return maxSum;
    }

    public static void main(String[] args)
    {

        int[] n = { 1,9,-1,-2,7,3,-1,2};
        int k=4;
        SlidingWindow sw=new SlidingWindow();
      int output=  sw.maxContiguousArray(n,k);
      System.out.println("output"+output);


    }
}
