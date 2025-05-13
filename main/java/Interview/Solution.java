package Interview;

import java.util.Arrays;

public class Solution {
    public static boolean isPossible(int n, int A[])
    {
        // Sorting the given array
        Arrays.sort(A);

        int length = A.length;

        if(length%2!=0) {

         return false;
        }


        // Initializing two pointers
        int i = 0;
         int j = 1;
          while (j < length) {

            if (A[i] == A[j] ) {
                i++;
                j++;
            }
            else {
            return false;
            }
            i++;
            j++;
        }

        // After whole array is traversed,
        // which means N/2 pairs have sum
        // equal to target, hence return true
        return true;
    }

    public static void main(String[] args)
    {
        int N = 6;
        int A[] = {1,2,2,1,7,6};

        // Function call
        boolean answer = isPossible(N, A);
        if (answer)
            System.out.print("True");
        else
            System.out.print("False");
    }
}

