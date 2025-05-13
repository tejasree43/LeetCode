package Medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatChar3 {

    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxStringLength = 0;

        for (int right = 0; right < s.length(); right++) {

            if (!set.contains(s.charAt(right))) {

                set.add(s.charAt(right));
                maxStringLength = Math.max(maxStringLength, right - left + 1);
            } else {
                while (s.charAt(right) != s.charAt(left)) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));
                set.add(s.charAt(right));
                left++;

            }
        }
        return maxStringLength;

       /* if(s.length()==0){
            return 0;
        }

        Set<Character> set = new HashSet<>();
        int maxStringLength = 0;
        for (int i = 0; i < s.length(); i++) {

           if(set.contains(s.charAt(i))){
               maxStringLength =  Math.max(maxStringLength,set.size());
               set.clear();
               set = new HashSet<>();
           }
           set.add(s.charAt(i));

        }
      return set.size()>maxStringLength?set.size():maxStringLength;*/
    }

    public static void main(String[] args) {

        LongestSubstringWithoutRepeatChar3 lswr = new LongestSubstringWithoutRepeatChar3();
        //String s = "abcabcbb";
         String s = "pwwkew";
        //String s = "au";
        int output = lswr.lengthOfLongestSubstring(s);
        System.out.println("output" + output);

    }
}
//Time complexity: O(n)
//Space complexity: O(k), where k is the number of distinctive characters present in the hashset.