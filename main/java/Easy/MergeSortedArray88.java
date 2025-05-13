package Easy;

import java.util.Arrays;

public class MergeSortedArray88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        System.out.println("nums1 length="+nums1.length);
        System.out.println("nums2 length="+nums2.length);


        int i=m-1,j=n-1,k=nums1.length-1;


      //  i=2;j=2;k=5;
        while(j>=0)
        {
            if(i>=0&&nums1[i]>nums2[j])
            {
                nums1[k]=nums1[i];
                i--;
                k--;
            }
            else{
                nums1[k]=nums2[j];
                j--;
                k--;

            }
        }
        Arrays.stream(nums1).forEach(s->System.out.println(s));

    }

    public static void main(String[] args)
    {
        MergeSortedArray88 mergeSortedArray=new MergeSortedArray88();

        /*int[] nums1= {2,0};
        int  m=1;
        int[] nums2={1};
        int n=1;*/
        int[] nums1= {1,2,3,0,0,0};
        int[] nums2 = {4,5,6};
        int m = 3;int n =3;


     //   [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        mergeSortedArray.merge(nums1,m,nums2,n);
    }
}
   // Time Complexity:
   //     The time complexity of this program is O(m + n), where m is the length of nums1 and n is the length of nums2.
//     The while loop iterates until j reaches -1, which means all elements from nums2 have been merged into nums1.
//     In each iteration, either i or j is decremented, so the total number of iterations would be approximately m + n.

  //  Space Complexity:
   //  The space complexity of this program is O(1), as it does not use any additional data structures that grow
   //  with the input size. It only uses a fixed amount of space to store the indices (i, j, k) and temporary variables.
