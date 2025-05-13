package Medium;

public class ImplementTrie208 {

    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean word;
        char value;

        public TrieNode() {

        }
        public TrieNode(char value) {

            TrieNode node =  new TrieNode();
            node.value = value;
        }
    }

    TrieNode root;
   public ImplementTrie208 (){
        root = new TrieNode();
   }

    public void insert(String word) {

        TrieNode  trie = root;
        for(char ch :word.toCharArray()){

            if(trie.children[ch-'a']==null){

          trie.children[ch-'a']=new TrieNode((char) (ch-'a'));

           }
           trie= trie.children[ch-'a'];
         }
        trie.word =true;


    }

    public boolean search(String word) {
        TrieNode  trie = root;
        for(char ch :word.toCharArray()){
                if(trie.children[ch-'a']==null){
                    return false;
                 }
            trie =trie.children[ch-'a'];

        }
        return trie.word;
    }

    public boolean startsWith(String prefix) {
        TrieNode  trie = root;
        for(char ch : prefix.toCharArray()){
            if(trie.children[ch-'a']==null){
                return false;
            }
            trie =trie.children[ch-'a'];

        }
        return true;
    }
    public static void main(String[] args) {

     ImplementTrie208 trieDemo = new ImplementTrie208();
        trieDemo.insert("apple");
     boolean output =   trieDemo.search("apple");
     boolean output1 =   trieDemo.search("app");
     boolean output2 =   trieDemo.startsWith("app");

     System.out.println(output);
     System.out.println(output1);
     System.out.println("starts with app"+output2);
     trieDemo.insert("app");
     boolean output4 =   trieDemo.search("app");
     System.out.println(" app present"+output4);
     trieDemo.insert("teju");
        System.out.println("search teju"+trieDemo.search("teju"));



    }
}
