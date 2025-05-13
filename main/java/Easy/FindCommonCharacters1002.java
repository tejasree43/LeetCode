package Easy;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters1002 {

    public List<String> commonChars(String[] words) {

       int[]  last = count(words[0]);
       for(int i =1;i< words.length;i++){
           System.out.println(words[i]);
           last = sectionCompare(last,count(words[i]));
           System.out.println();
          }
        List<String> arrayList2 = new ArrayList<>();

        for(int i =0; i<26; i++)
        {
            if(last[i]!=0) {
                int uncode =('a'+i);
                System.out.println(uncode);
                char ch = (char) (uncode);
                while(last[i]>0){
                    arrayList2.add(String.valueOf(ch));
                    last[i]--;
                }
            }
        }
        return arrayList2;
    }

    private int[] sectionCompare(int[] a, int[] b) {

        int[] combFreq = new int[26] ;
        for(int i =0;i<combFreq.length;i++){
            combFreq[i]=Math.min(a[i],b[i]);
        }
        return combFreq;
    }

    private int[] count(String word) {

       int[] freq = new int[26] ;
       for(char c:word.toCharArray()){
           freq[c-'a']++;

       }
     return freq;
    }

    public static void main(String[] args){

   String[] words = {"bella","label","roller"};

    FindCommonCharacters1002 fcc = new FindCommonCharacters1002();
    List output =fcc.commonChars(words);
    System.out.println(output);
    }
}
