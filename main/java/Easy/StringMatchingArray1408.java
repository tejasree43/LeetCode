package Easy;

import java.util.*;
import java.util.stream.Collectors;

public class StringMatchingArray1408 {

    public List<String> stringMatching(String[] words) {

        Set<String> setElements=new HashSet<>();
        int i=0;int j;
        while(i<words.length)
        {
            j=0;
            while(j<words.length)
            {
                if(i!=j && words[i].contains(words[j])){
                    setElements.add(words[j]);
                }
                j++;
            }
            i++;
        }
        System.out.println(setElements);
      List<String> al=  setElements.stream().collect(Collectors.toList());
        return al;
    }

    public static void main(String[] args){
        StringMatchingArray1408 sma=new StringMatchingArray1408();
        //String[] words = new String[]{"mass", "as", "hero", "superhero"};

       // String[] words = {"leetcode","et","code"};
        String[] words = {"leetcoder","leetcode","od","hamlet","am"};
        List<String> output=sma.stringMatching(words);
        output.stream().forEach(s->System.out.println(s));
    }

}
