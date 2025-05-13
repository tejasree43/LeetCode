package Medium;

import java.util.Arrays;
import java.util.PriorityQueue;
//1383. Maximum Performance of a Team same problem
public class MaximumSubsequenceScore2542 {

    public long maxScore(int[] nums1, int[] nums2, int k) {

        long answer =0;
        int n =nums1.length;

        System.out.println("size"+n);
        int[][] arrayNums = new int[n][2];


        for(int i =0;i<n;i++){

            arrayNums[i][0]=nums1[i];
            arrayNums[i][1]=nums2[i];;

        }

        Arrays.sort(arrayNums,(a,b)->b[1]-a[1]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int j =0;

        int sum =0;
        while(j<n){

            sum +=arrayNums[j][0];
            pq.add(arrayNums[j][0]);

            answer = Math.max(answer,sum*arrayNums[j][1]);

            if(pq.size()==k){

                sum -=  pq.poll();;

            }
        j++;
        }

        return (int)(answer);
    }

    public static void main(String[] args) {
    //int[] nums1 = {1,3,3,2}, nums2 = {2,1,3,4};

    // int[] nums1 = {2,10,3,1,5,8}, nums2 = {5,4,3,9,7,2};

        int[] nums1 = {2,8,2}, nums2 = {2,7,1};
    // int k = 2;
    int k = 2;
     MaximumSubsequenceScore2542 maxSubSequence = new MaximumSubsequenceScore2542();
     long output = maxSubSequence.maxScore(nums1,nums2,k);
     System.out.println("output"+output);
    }
}
/*
 nums1 = {1,3,3,2}, nums2 = {2,1,3,4};

 MergeArray = {{1,2},{3,1},{3,3},{2,4}};

 After Sort =  {{2,4},{3,3},{1,2},{3,1}};

 //subSequence pattern examples
 0,1,2,3
1,3,3,2

[0,1,2,3]    pq cover:
 0,1,2       1 3 2
             2 3 3
 0,1,3
 0,2,3
 1,3,1

[0,1,2,3,4]

0,1,2
0,1,3
0,1,4
0,2,3
0,2,4
0,3,4
1,2,3
1,2,4
2,3,4


 */