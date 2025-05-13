package Hard;

import java.util.Arrays;

public class MedianofTwoSortedArrays4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

      int[] sortedArray= makeOneSortedArray(nums1,nums2);

        int med=(nums1.length+nums2.length)/2;
        if(sortedArray.length == 1) return sortedArray[0];

        //even case
        if(sortedArray.length%2==1)
            return sortedArray[med];
        //odd case
        else
          return (sortedArray[med-1]+sortedArray[med])/2.0;
    }

    private int[] makeOneSortedArray(int[] nums1, int[] nums2) {

        int m=nums1.length;
        int n=nums2.length;
        int[] returnArray=new int[m+n];

        int i=0,j=0;int k=0;
        while(i<m&&j<n)
        {
          if(nums1[i]<nums2[j])  {
              returnArray[k] =nums1[i];
              i++;
          }else{
              returnArray[k] =nums2[j];
              j++;
          }
          k++;

        }
        while(i<m){
        returnArray[k] =nums1[i];
            i++;
            k++;
        }
        while(j<n){
            returnArray[k] =nums2[j];
            j++;
            k++;
        }


      return  returnArray;
    }

    public static void main(String[] args){

        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        MedianofTwoSortedArrays4 mtsa=new MedianofTwoSortedArrays4();

        double med=   mtsa.findMedianSortedArrays( nums1,nums2);
        System.out.println("med"+med);
    }
}
