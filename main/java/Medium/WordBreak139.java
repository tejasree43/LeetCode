package Medium;

import java.util.Arrays;
import java.util.List;

 class Trie{

     Trie[] children;
     boolean isWord;

     int count;

     public Trie() {
         this.children=new Trie[26];
         this.isWord=false;
         this.count=0;
     }
 }

public class WordBreak139 {
    Trie trie;
    public boolean wordBreak(String s, List<String> wordDict) {
         trie=new Trie();

        for(String word:wordDict){

            insertTrie(trie,word);
        }
       int n= s.length();
        boolean dp[]=new boolean[n];
       // dp[0]=true;
        for(int i=1;i<n;i++){
            for(int j=0;j<=i;j++) {

                if(isPresent(s,j,i)){
                    dp[i]=(j-1>=0)?dp[j-1]:true;
                   // dp[i]=true;
                    //dp[i]=true;
                   // System.out.println("value"+value);
                    if(dp[i]) {
                        break;
                    }
                }
                else{
                    System.out.println("executed else block");
                }
            }
            }
        return dp[n - 1];
    }
private boolean isPresent(String word,int start,int end) {

        System.out.println("ji combos"+start+""+end);
    Trie trieNode = trie;

    for (int i = start; i <= end; i++) {

        int c = word.charAt(i) - 'a';
        if (trieNode.children[c] == null) {
            return false;
        }
        trieNode=trieNode.children[c];
    }
        return trieNode.isWord;

}

    private void insertTrie(Trie trie,String word) {

        for(char ch:word.toCharArray()){
            if(trie.children[ch-'a']==null){
                trie.children[ch-'a']=new Trie();
                trie.count++;
            }
            trie=trie.children[ch-'a'];

        }
        trie.isWord=true;
    }

    public static void main(String[] args){
        WordBreak139 wordBreak=new WordBreak139();
        String s = "catsandog";
        String[] wordDict = {"cats","dog","sand","and","cat"};
       boolean output= wordBreak.wordBreak(s, Arrays.asList(wordDict));
       System.out.println("output="+output);
}
}
