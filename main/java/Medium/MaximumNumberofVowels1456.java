package Medium;

public class MaximumNumberofVowels1456 {

    public int maxVowels(String s, int k) {

        int vowelCount = 0;
        int result =0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charCheck(c)) {
                vowelCount++;
            }

            if (i >= k) {
                char removeChar = s.charAt(i - k);
                if (charCheck(removeChar)) {
                    vowelCount--;
                }
            }
            result = Math.max(result, vowelCount);
          }
            return result;
    }

    public boolean charCheck (char ch){
       /* if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o') {
            return true;
        }
        return false;*/
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
      }
    public static void main(String[] args) {

      String  s = "abciiidef";
      int k = 3;
      MaximumNumberofVowels1456  max = new MaximumNumberofVowels1456();
     int vowelCount = max.maxVowels(s,k);

     System.out.println("vowelCount"+vowelCount);
    }

}
