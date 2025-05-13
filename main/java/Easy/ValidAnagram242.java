package Easy;


import java.util.Arrays;

public class ValidAnagram242 {
    public static boolean isAnagram(String s, String t) {

        boolean output=true;
        char[] str1= s.toCharArray();
        char[] str2= t.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2)   ;

        int slength=s.length();
        int tlength=t.length();
        if(slength!=tlength)
        {
            return output= false;
        }
        for(int i=0;i<str1.length;i++)
        {
            if(str1[i]!=str2[i])
            {
                output= false;
            }
        }

        return output;
    }

    public static void main(String[] args){

        ValidAnagram242 validAnagram=new ValidAnagram242();
       boolean output= validAnagram.isAnagram("anagram", "nagaram");

       System.out.println(output);
    }

}
