package Easy;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo10 {
    public static boolean isMatch(String s, String p) {

        Pattern pat=Pattern.compile(p);
          Matcher mt= pat.matcher(s);
        return mt.matches();
    }
    public static void main(String[] args)
    {
       System.out.println( RegularExpressionDemo10.isMatch("aa","a"));
        System.out.println( RegularExpressionDemo10.isMatch("aa","a*"));
        System.out.println( RegularExpressionDemo10.isMatch("ab",".*"));


    }

}
