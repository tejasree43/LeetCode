package DataStructures;

import java.util.Arrays;

public class QuickSortDemo {

    public int[] quicksort(int[] nums) {
        int startIndex=0;
        int n=nums.length;
        int highIndex=n-1;

        quickSort(nums,startIndex,highIndex);
        return nums;
       }
       public void quickSort(int[] nums,int startIndex,int highIndex){

       int pivot=nums[highIndex];
       int leftPointer=startIndex;
       int rightPointer=highIndex;

      if(leftPointer>=rightPointer)
       {
           System.out.println("recursion ends");
           return ;
       }

       while(leftPointer<rightPointer)
       {
          while(nums[leftPointer]<=pivot&&leftPointer<rightPointer) {
              leftPointer++;
           }
           while(nums[rightPointer]>=pivot&&leftPointer<rightPointer) {
               rightPointer--;
           }
            if(nums[leftPointer]>pivot&&nums[rightPointer]<pivot)
           {
               swap(nums, leftPointer,rightPointer);
           }
       }
           swap(nums, rightPointer,highIndex);

        quickSort(nums, startIndex,leftPointer-1);
        quickSort(nums, rightPointer+1,highIndex);

       }

    public void swap(int[] nums,int lowIndex,int highIndex)
    {
        int temp= nums[lowIndex];
        nums[lowIndex]=nums[highIndex];
        nums[highIndex]=temp;
    }

    public static void main(String[] args)
    {
        int[] n={1,8,3,9,4,5,7};
        QuickSortDemo qs=new QuickSortDemo();
       int[] outputNums= qs.quicksort(n);
        Arrays.stream(outputNums).forEach(s->System.out.println(s));
    }
}
