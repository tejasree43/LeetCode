package Easy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPalindrome125 {

    public boolean palindrome(String str)
    {
        //The time complexity of the code is O(n), and the space complexity is also O(n), where n is the length of the input string str.
      /*  String temp=str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        System.out.println("temp:"+temp);

         char[] ch=temp.toCharArray();
         StringBuffer sb=new StringBuffer();
        for(int i=ch.length-1;i>=0;i--)
        {
            sb.append(ch[i]);
        }
        String s1= String.valueOf(sb);
       return s1.equals(temp);*/


      /*  String temp=str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        System.out.println("temp:"+temp);*/

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]");
        Matcher match =pattern.matcher(str);
        String tempString = match.replaceAll("").toLowerCase();
        int n = tempString.length();

        for(int i=0;i<n/2;i++)
        {
           if(tempString.charAt(i)!=tempString.charAt(n-i-1)){
              return false ;
           }
        }
        return true;
    }

    public static void main(String[] args)
    {

        ValidPalindrome125 sp=new ValidPalindrome125();

        String s= "A man, a plan, a canal: Panama";
        System.out.println(sp.palindrome(s));
    }
}
