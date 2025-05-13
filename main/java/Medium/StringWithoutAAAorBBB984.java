package Medium;

import java.util.PriorityQueue;
public class StringWithoutAAAorBBB984 {

    private static boolean wouldCauseTripleRepeat(StringBuilder result, String currentString) {
        int len = result.length();
        if (len < 2) return false; // No risk of triple repeat if result has fewer than 2 characters
        //AA A B check and A B BB checks
        char lastChar = result.charAt(len - 1);
        char secondLastChar = result.charAt(len - 2);

        return (lastChar == currentString.charAt(0) && secondLastChar == currentString.charAt(0)) ||
                (lastChar == currentString.charAt(0) && lastChar == currentString.charAt(1));
    }
    public String strWithout3a3b(int AA, int AB, int BB) {

        StringBuilder result = new StringBuilder();
        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> y[0] - x[0]);

        // Push the counts and their corresponding string indices into the priority queue
        if (AA > 0) pq.offer(new int[]{AA, 0}); // 0 represents 'AA'
        if (AB > 0) pq.offer(new int[]{AB, 1}); // 1 represents 'BB'
        if (BB > 0) pq.offer(new int[]{BB, 2}); // 2 represents 'AB'

        // Map indices to their corresponding strings
        String[] strings = {"AA", "AB", "BB"};
        while (!pq.isEmpty()) {
            int[] first = pq.poll();
            int stringIndex = first[1]; // Get the index of the string
            String currentString = strings[stringIndex]; // Get the actual string

           // AAA B  A BBB
            // Check if adding the current string would create "AAA" or "BBB"
            if (wouldCauseTripleRepeat(result, currentString)){
                if (pq.isEmpty()) {
                    break; // No alternative string available
                }
                int[] second = pq.poll();
                int secondStringIndex = second[1];
                String secondString = strings[secondStringIndex];
                if (wouldCauseTripleRepeat(result, secondString))
                    {
                    if (pq.isEmpty()) {
                        break; // No alternative string available
                    }
                    int[] third = pq.poll();
                    int thirdStringIndex = third[1];
                    String thirdString = strings[thirdStringIndex];
                    result.append(thirdString);
                    third[0]--;
                    if (third[0] > 0) {
                        pq.offer(third);
                    }
                    }
                   else{
                        result.append(secondString);
                         second[0]--;
                        if (second[0] > 0) {
                        pq.offer(second);
                         }
                    }
                    pq.offer(first); // Re-add the first string to the heap
                   } else {
                    result.append(currentString);
                    first[0]--; // Decrement the count of the first string
                    if (first[0] > 0) {
                        pq.offer(first);
                    }
                }
            }

            return result.toString();
}

    public static void main(String[] args) {

      // int a = 4,  b = 1 ;
      //  int a = 1,  b = 3 ;
       //int a = 1;int b = 1;int c = 7;
      /* int AA =5 ;
       int AB= 0;
       int  BB=2;*/
        //ans:AABBAABBAA
     /* int AA =1 ;
        int AB= 2;
        int  BB=1;*/
      //  ans: ABABAABB or AABBABAB or ABAABBAB
       /* int AA =0 ;
        int AB= 2;
        int  BB=0;
        //  ans: ABAB*/

        int AA = 0, AB = 0 , BB = 10;
       // ans :BB
        StringWithoutAAAorBBB984 stringWithout = new StringWithoutAAAorBBB984();
       String output = stringWithout.strWithout3a3b(AA,AB,BB);
       System.out.println("output"+output);

    }
}
