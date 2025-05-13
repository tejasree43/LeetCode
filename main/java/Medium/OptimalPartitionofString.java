package Medium;
import java.util.*;

public class OptimalPartitionofString {

    public int partitionString(String s) {

       /*ArrayList al = new ArrayList<>();

       Set<Character> set = new LinkedHashSet<>();
       int count = 0;
       for(char ch :s.toCharArray()) {

        if(set.contains(ch)){
            al.add(set);
            System.out.println("set"+set);

            set = new HashSet<>();
            set.clear();
            count++;
          }
         set.add(ch);
       }
       if(set.size()>0){
           al.add(set);
           count++;
       }

    System.out.println("al"+al);
    System.out.println("count"+count);

        return count;*/

       int count = 0; // count number of minimum substrings.
        Set<Character> set = new HashSet<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(set.contains(s.charAt(i))){ // check character repeat in string
                count++;
                System.out.println(set);
                set.clear();
            }
            set.add(s.charAt(i));
        }
        count++; // incremented since for loop doesn't check the end of string.
        return count;
    }
    public static void main(String [] args){

      String  s = "abacaba" ;
      //String  s = "hdklqkcssgxlvehva" ;//[[q, d, h, k, l], [c, s, k], [s, e, v, g, x, h, l], [a, v]]

      OptimalPartitionofString ops = new OptimalPartitionofString();
      ops.partitionString(s);
    }
}
