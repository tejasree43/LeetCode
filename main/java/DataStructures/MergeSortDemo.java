package DataStructures;

import java.util.Arrays;

public class MergeSortDemo {


    public void mergeSort(int[] input)
    {

       int n= input.length;
       if(n<2)
       {
           return;
       }
       int midIndex=input.length/2;

        int[]  leftHalf=new int[midIndex];
        int[]  rightHalf=new int[input.length-midIndex];


        for(int i=0;i<midIndex;i++)
       {
           leftHalf[i]=input[i];
       }

       for(int i=midIndex;i<n;i++)
        {
            rightHalf[i-midIndex]=input[i];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);
        mergeHelper(input,leftHalf,rightHalf);
        Arrays.stream(input).forEach(s->System.out.println(s));

    }
    public void mergeHelper(int[] inputArray, int[] leftHalf, int[] rightHalf)
    {
        System.out.println("mergeHelper");
        int leftSize=leftHalf.length;
        int rightSize=rightHalf.length;
        int i = 0,j=0,k=0;
         while(i<leftSize && j<rightSize) {
             if (leftHalf[i] <= rightHalf[j]) {
                 inputArray[k] = leftHalf[i];
                 i++;
             } else {
                 inputArray[k] = rightHalf[j];
                 j++;
             }
             k++;
         }
         while(i<leftSize)
         {
             inputArray[k]=leftHalf[i];
             i++;
             k++;
         }
        while(j<rightSize)
        {
            inputArray[k]=rightHalf[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args)
    {
        int[] number={38,27,43,3,9,82,10};
        MergeSortDemo ms=new MergeSortDemo();
        ms.mergeSort(number);
    }
}
