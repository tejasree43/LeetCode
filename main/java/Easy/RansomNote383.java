package Easy;

import java.util.Arrays;

public class RansomNote383 {

    public boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote.length() > magazine.length()) return false;

        int[] input = new int[26];

        for(char ch :magazine.toCharArray()){
            input[ch-'a']++;
        }

        for(char c :ransomNote.toCharArray()){
           if( input[c-'a']==0){
               return false;
           }
            input[c-'a']--;
        }
        return  true;


      }



    public static void main(String[] args){

      String  ransomNote = "aab", magazine = "baa";
      RansomNote383 ransom = new  RansomNote383();
     boolean output = ransom.canConstruct(ransomNote,magazine);
     System.out.println(output);
    }
}
