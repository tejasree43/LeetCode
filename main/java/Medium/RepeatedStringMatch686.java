package Medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RepeatedStringMatch686 {

    public int repeatedStringMatch(String a, String b) {

        int count = 0;

        StringBuilder sb = new StringBuilder();

        while (sb.length() < b.length()) {
            sb.append(a);
            count++;
        }

        if (sb.toString().contains(b)) {
            return count;
        }
        if (sb.append(a).toString().contains(b)) {
            return ++count;
        }

        System.out.println("count" + count);

        return -1;
    }


    public static void main(String[] args){

      String  a = "abc", b = "wxyz";
        RepeatedStringMatch686 repeat = new RepeatedStringMatch686();
        int count =repeat.repeatedStringMatch( a,  b);
        System.out.println("count"+count);
    }
}
