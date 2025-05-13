package Easy;

import java.util.HashMap;
import java.util.HashSet;

public class WordPattern290 {

    public boolean wordPattern(String pattern, String s) {

        //Time complexity: O(n)
        //Space complexity: O(n)

        HashMap<Character,String> hMap = new HashMap();
        HashSet<String> hs=new HashSet<>();

        String [] stringArray = s.split("\\s");
        if(pattern.length()!=stringArray.length) return false;
        for( int i=0;i<pattern.length();i++){

           if(hMap.containsKey(pattern.charAt(i))){
             if(!hMap.get(pattern.charAt(i)).equals(stringArray[i])){
                 return false;
               }
           }
           else{
               if(hs.contains(stringArray[i])){
                   return false;
               }
               hMap.put(pattern.charAt(i),stringArray[i]) ;
               hs.add(stringArray[i]);
           }

        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba", s = "dog dog dog dog";

        WordPattern290 wordPattern = new WordPattern290();
        boolean output = wordPattern.wordPattern(pattern, s);
        System.out.println("output" + output);
    }
}
