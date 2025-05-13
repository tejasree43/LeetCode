package Medium;

import java.util.*;

public class DetermineifTwoStringsAreClose1657 {
    public boolean closeStrings(String word1, String word2) {

        /*HashMap<Character, Integer> map1 = new HashMap();
        HashMap<Character, Integer> map2 = new HashMap();

        if (word1.length() != word2.length()) {
            return false;
        }

        for (int i = 0; i < word1.length(); i++) {
            map1.put(word1.charAt(i), map1.getOrDefault(word1.charAt(i), 0) + 1);
            map2.put(word2.charAt(i), map2.getOrDefault(word2.charAt(i), 0) + 1);
        }

        System.out.println(map1);
        System.out.println(map2);
        if (map1.keySet().equals(map2.keySet())) {

            List list1 = new ArrayList<>(map1.values());
            List list2 = new ArrayList<>(map2.values());

            Collections.sort(list1);
            Collections.sort(list2);

            if (list1.equals(list2) && map1.keySet().equals(map1.keySet())) {

                return true;
            }

        }
        return false;*/

        //2nd approach using the array frequency

        int a[] = new int[26];
        int b[]= new int [26];

        if(word1.length()!=word2.length()){
            return false;
        }

        for(int i=0;i<word1.length();i++){

            a[word1.charAt(i)-'a'] ++;
            b[word2.charAt(i)-'a'] ++;

        }
        //letters verification
        for(int i =0;i<26;i++){

          if(a[i]==0&&b[i]!=0||b[i]==0&&a[i]!=0){
              return false;
          }
        }
        Arrays.sort(a); //values verification
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }


 public static void main(String[] args) {

  String word1 = "abc", word2 = "bca";
   /*  String   word1 = "abbzzca";
     String   word2 = "babzzcz";
*/
    // String word1 ="uau",word2="ssx";
  DetermineifTwoStringsAreClose1657 strings = new DetermineifTwoStringsAreClose1657();
  boolean output = strings.closeStrings(word1,word2);

  System.out.println("output"+output);
 }
 }

