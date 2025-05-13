package Easy;

import java.util.Arrays;

public class TwoPointerSimpleDemo {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        System.out.println("nums1 length="+nums1.length);
        System.out.println("nums2 length="+nums2.length);

        int list1Size=nums1.length;
        int list2Size=nums2.length;

        int i=0,j=0,k=0;

        int[] input=new int[6];
        while(i<list1Size &&j<list2Size)
        {
            if(nums1[i]<=nums2[j])
            {
                input[k]=nums1[i];
                i++;
                k++;
            }
            else{
                input[k]=nums2[j];
                j++;
                k++;

            }
        }
        if (i < list1Size) {

            input[k]=nums1[i];
            k++;
            i++;
        }
        if (j < list1Size) {
            input[k]=nums2[j];
            k++;
            j++;

        }


        Arrays.stream(input).forEach(s->System.out.println(s));

    }

    public static void main(String[] args)
    {
        MergeSortedArray88 mergeSortedArray=new MergeSortedArray88();

        int[] nums1= {1,4,5};
        int  m=3;
        int[] nums2={1,3,4};
        int n=3;
        mergeSortedArray.merge(nums1,m,nums2,n);
    }
}

