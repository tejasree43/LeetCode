package Easy;

public class MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {

        StringBuilder answer = new StringBuilder();
        int i =0;

        while(i<word1.length()&&i<word2.length()){
            answer.append(word1.charAt(i));
            answer.append(word2.charAt(i));
          i++;
        }
        if(word1.length()<word2.length()){
            answer.append(word2.substring(i));
        }
        else{
            answer.append(word1.substring(i));

        }

        System.out.println(answer.toString());
        return answer.toString();
    }

    public static void main(String[] args){
     MergeStringsAlternately mergeString = new MergeStringsAlternately();
     //String  word1 = "ab", word2 = "pqrs";
     String  word1 = "abcd", word2 = "pq";


     mergeString.mergeAlternately(word1,word2);
    }
}
