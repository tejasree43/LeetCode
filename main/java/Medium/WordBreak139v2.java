package Medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak139v2 {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> hs = new HashSet<>(wordDict);

        int n =s.length();
        boolean[] dp = new boolean[n+1];

        dp[0] = true;
        for (int i = 1; i <=s.length(); i++) {

            for (int j = 0; j<i; j++) {
                String subStringref=s.substring(j, i);
                if (dp[j]&& hs.contains(subStringref)) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
       /* Set<String> set = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++)
            for (int j = 0; j < i; j++)
                if (dp[j] && set.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
        return dp[s.length()];*/
    }

        public static void main(String[] args){
            WordBreak139v2 wordBreakVersion=new WordBreak139v2();
            /*String s = "catsandog";
            String[] wordDict = {"cats","dog","sand","and","cat"};*/
            String s = "applepenapple";
            String[] wordDict = {"apple","pen"};
            boolean output= wordBreakVersion.wordBreak(s, Arrays.asList(wordDict));
            System.out.println("output="+output);

    }
}
