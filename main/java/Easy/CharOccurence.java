package Easy;

import java.util.*;

public class CharOccurence {

    public void countChars(String input) {

    //Time Complexity: O(n)
    //Auxiliary Space: O(1)
    int i=0;
    while(i+1<input.length()) {
      //  int j = 0;
        int count = 1;

        while (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
            count++;
            i++;
        }
        System.out.print(input.charAt(i)+""+count+"");
        i++;

    }
    }
    public static void main (String[] args){

        String input = "GeeeEEKKKss";
        CharOccurence count = new CharOccurence();
        count.countChars(input);
    }
}
