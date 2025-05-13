package DataStructures;



class TrieDemo {
    class TrieNode {

        TrieNode[] children;
        boolean isWord;
        int count;

        TrieNode() {
            this.children = new TrieNode[26];
            this.isWord = false;
            this.count = 0;
        }

    }


    public void insert(TrieNode trie, String str) {

        for (char ch : str.toCharArray()) {

            if (trie.children[ch-'a'] == null) {
                trie.children[ch-'a'] = new TrieNode();
                trie.count++;

            }
            trie= trie.children[ch-'a'];

        }
        trie.isWord = true;

    }

  public TrieNode get(TrieNode[] children, StringBuilder sb) {

        for (int i = 0; i < 26; i++) {
            if (children[i] != null) {
                System.out.println("children[i]="+children[i]);
                sb.append((char) (i + 'a'));
                return children[i];

            }
        }

        return null;
   }
    public String longestCommonPrefix(String[] strs) {
        TrieNode trie = new TrieNode();
        for (String str : strs) {
            insert(trie, str);
        }

        StringBuilder sb = new StringBuilder();

         while(trie.count==1 && !trie.isWord) {

          // trie = get(trie.children, sb);

             for (int i = 0; i < 26; i++) {
                 if (trie.children[i] != null) {
                     sb.append((char) (i + 'a'));
                     trie=trie.children[i];
                     break;

                 }
             }
        }

        return sb.toString();

    }





        public static void main (String[]args)
        {

            TrieDemo td = new TrieDemo();
            String[] stringInputs= {"flower","flow","flight"};
            String output  = td.longestCommonPrefix( stringInputs);
            System.out.println("output"+output);

        }

    }
