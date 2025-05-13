package Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class SearchSuggestionsSystem1268 {


    class TrieNode{

    char value;
    TrieNode[] children;
   // PriorityQueue<String> pq = new PriorityQueue<>(Comparator.reverseOrder());
    //PriorityQueue<String> pq = new PriorityQueue<>((a,b)->b.compareTo(a));
    PriorityQueue<String> pq;
    boolean isWord = false;

    TrieNode(){
        children = new TrieNode[26];
        pq = new PriorityQueue<>((a,b)->b.compareTo(a));

    }
  /*  TrieNode(char value){
    TrieNode  node = new TrieNode();
    node.value = value;

    }
*/
    public void addPQ(String input){
        pq.add(input);
        if (pq.size() > 3) pq.poll();

    }

    public List<String> getTopThree(){

    List<String>  topThree = new ArrayList<>();
    while(!pq.isEmpty()){
        topThree.add(pq.poll());
    }
    Collections.reverse(topThree);
        return topThree;
    }
    }



    public List<List<String>> suggestedProducts(String[] products, String searchWord) {

        TrieNode trie = new TrieNode();

        for (String product : products) {
            insert(trie, product);
        }

        List<List<String>> resultWords = new ArrayList<>();

        for (char c : searchWord.toCharArray()) {
           // trie = trie.children[c-'a'];
            if((trie=trie.children[c-'a'])==null){


                break ;
            }
           // trie = trie.children[c-'a'];

            resultWords.add(trie.getTopThree());
        }

        while (resultWords.size() < searchWord.length())
            resultWords.add(new ArrayList<>());

        System.out.println(resultWords);
        return resultWords;

    }
   /* public void insert(TrieNode trie,String product){

     for(char ch : product.toCharArray()){

      if(trie.children[ch-'a'] == null)  {

          trie.children[ch-'a'] = new TrieNode();

      }
       trie = trie.children[ch-'a'];
       trie.addPQ(product);

     }

      //  trie.isWord = true;
    }*/

    private void insert(TrieNode root, String word) {
        for (char c : word.toCharArray()) {
            if (root.children[c - 'a'] == null)
                root.children[c - 'a'] = new TrieNode();
            root = root.children[c - 'a'];
            root.addPQ(word);

        }

    }

    public static void main(String[] args)
    {

     String[] products = {"mobile","mouse","moneypot","monitor","mousepad"};
     String searchWord = "mouse";

     SearchSuggestionsSystem1268 searchSuggestion = new SearchSuggestionsSystem1268();
     searchSuggestion.suggestedProducts(products,searchWord);

    }
}
