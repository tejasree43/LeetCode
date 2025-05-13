package Easy;

public class ReverseVowelsofaString345 {

    public String reverseVowels(String s) {


        char[] word= s.toCharArray();
        int i =0;

        int j = word.length-1;
        String vowels = "aeiouAEIOU";

        while(i<j){


            while(i<j&& vowels.indexOf(word[i])==-1){
                i++;
            }

            while(i<j&&vowels.indexOf(word[i])==-1){
                j--;
            }

            char temp = word[i];
            word[i] = word[j];
            word[j] = temp ;

            i++;
            j--;
        }
        String answer = new String(word);
        return answer;
    }

    public boolean isVowel(char ch) {

        switch (ch) {

            case ('a'):
                ;
            case ('e'):
                ;
            case ('i'):
                ;
            case ('o'):
                ;
            case ('u'):
                ;
                return true;
            default:
                return false;

        }
    }
    public static void main(String[] args) {

     String  s = "hello" ;

     ReverseVowelsofaString345 reverseVowels = new ReverseVowelsofaString345();
     String output =reverseVowels.reverseVowels(s);
     System.out.println("output"+output);
    }

}
