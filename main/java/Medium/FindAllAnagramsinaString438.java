package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsinaString438 {

    public List<Integer> findAnagrams(String s, String key) {

    List<Integer> answer = new ArrayList<>();
    int[] keyArray =loadFrequency(key);
    int j = key.length()-1;

    int i =0;
   String subString = s.substring(i,j);
   System.out.println("subString"+subString);
   int[] subArray =loadFrequency(subString);

   while(j<s.length()){

     subArray[s.charAt(j)-'a']++;
    if(Arrays.equals(keyArray,subArray))  {
       answer.add(i);
    }
       subArray[s.charAt(i)-'a']--;
      j++;
      i++;
   }
   System.out.println();
        return answer;
    }

    //Load the frequencies to int Array

    public int[] loadFrequency(String input){

     int[] frequency = new int[26];

     for(int i =0;i<input.length();i++)
     {
        char ch = input.charAt(i);

        frequency[ch-'a'] = frequency[ch-'a']+ 1;
     }
      return frequency;
    }
      public static void  main(String[] args){
      String  s = "cbaebabacd", p = "abc";
      FindAllAnagramsinaString438 anagrams=new FindAllAnagramsinaString438();
      List<Integer> list=anagrams.findAnagrams(s,p);
      list.stream().forEach(System.out::println);
    }
}
