package Easy;

import java.util.Arrays;

public class SortanArray912 {
    public int[] sortArray(int[] nums) {

       divideArray(nums);
        return nums;

    }

    public void mergeHelper(int[] nums,int[] leftArray,int[] rightArray){

        int  leftSize = leftArray.length;
        int  rightSize = rightArray.length;
        int i=0,j=0,k=0;

        while(i<leftSize && j<rightSize)
        {
            if(leftArray[i]<=rightArray[j])
            {
                nums[k]=leftArray[i];
                i++;
            }
            else{
                nums[k]=rightArray[j];
                j++;
            }
            k++;

        }
        while(i<leftSize)
        {
            System.out.println("inside i");
            nums[k]=leftArray[i];
            i++;
            k++;
        }

        while(j<rightSize)
        {
            System.out.println("inside j");
            nums[k]=rightArray[j];
            j++;
            k++;
        }
    }

    public void divideArray(int[] nums){
        int n=nums.length;
        int midIndex=nums.length/2;

        int leftArray[]=new int[midIndex];
        int rightArray[]=new int[n-midIndex];

        if(n<2)
        {
            return;
        }

        for(int i=0;i<midIndex;i++)
        {
            leftArray[i]=nums[i];
        }

        for(int i=midIndex;i<n;i++)
        {
            rightArray[i-midIndex]=nums[i];
        }

      //  Arrays.stream(rightArray).forEach(x->System.out.println(x));
      //  Arrays.stream(leftArray).forEach(x->System.out.println(x));


        divideArray(leftArray);
        divideArray(rightArray);
        mergeHelper(nums,leftArray,rightArray);

    }

    public static void main(String[] args)
    {

        SortanArray912 sA=new SortanArray912();
        int[] n={5,2,3,1};
         int[]  output=sA.sortArray(n);

      Arrays.stream(output).forEach(x->System.out.println(x));


    }

}
