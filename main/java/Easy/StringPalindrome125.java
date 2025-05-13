package Easy;

public class StringPalindrome125 {

    public boolean palindrome(String str)
    {

        String temp=str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        System.out.println("temp:"+temp);
       /* char[] ch=temp.toCharArray();
        StringBuffer sb=new StringBuffer();
        for(int i=ch.length-1;i>=0;i--)
        {
            sb.append(ch[i]);
        }
        String s1= String.valueOf(sb);
       return s1.equals(temp);*/
        char[] ch=temp.toCharArray();
        int i=0;
        int j=ch.length-1;

        char tempch = 0;
        while(i<j)
        {
         if(ch[i]!=ch[j])
         {
             tempch=ch[j];   
             
             return false;
         }
System.out.println("tempch"+tempch);
        }
      return true;
    }

    public static void main(String[] args)
    {

        StringPalindrome125 sp=new StringPalindrome125();

        String s= "abca";
      System.out.println(sp.palindrome(s));
    }

}
