package Medium;


//208. Implement Trie (Prefix Tree)
public class TrieNode {

    Trie[] children;
    boolean isWord;
    int count;
    public TrieNode() {
        children = new Trie[26];
        this.isWord = true;
        this.count=0;
    }

    public void insert(String word) {
      Trie trie =new Trie();

      for(char ch:word.toCharArray()){

          if(trie.children[ch]==null){
              trie.children[ch] = new Trie();
              trie.count++;
          }
          trie = trie.children[ch];

       }
        trie.isWord=true;

    }

    public boolean search(String word) {
       // Trie trie =;


        for(char ch:word.toCharArray()){

            char c = word.charAt(ch);
            for(int i=0;i<26;i++){
                /*if(trie.children[i]!=null){

                }*/

            }


        }



        return false;
    }

    public boolean startsWith(String prefix) {

        return false;
    }
}
