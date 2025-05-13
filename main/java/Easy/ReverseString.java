package Easy;

public class ReverseString {

    public String reverseStr(String s, int k) {

        char[] chars = s.toCharArray();

        for (int i = 0; i < s.length() - 1; i += 2 * k) {
            int start = i;
            int end = Math.min(i + k - 1, s.length() - 1);

            while (start < end) {
                char temp = chars[start];
                chars[start++] = chars[end];
                chars[end--] = temp;
            }
        }

        return new String(chars);
    }

    public static void main(String[] args){

      ReverseString reverseString=new ReverseString();
      String s = "abcdefg";
      int k=2;
      String output= reverseString.reverseStr(s,k);
      System.out.println("output="+output);
    }

}
