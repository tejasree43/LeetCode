package Easy;

import java.util.Hashtable;
public class FirstUniqueCharacterString387 {

    public int firstUniqueChar(String s) {
        Hashtable<Character,Integer> queue=new Hashtable<>();

        /*for(char c:s.toCharArray()) {
            queue.add(c);
        }*/
        return 0;
    }

    public static void main(String[] args)
    {
        FirstUniqueCharacterString387 firstUniqueChar=new FirstUniqueCharacterString387();
        String firstUnique ="leetcode";
        int output =firstUniqueChar.firstUniqueChar(firstUnique);
        System.out.println("output"+output);
    }
}

