package Hard;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {


    int count = 0;

    List<String> result = new ArrayList<>();
    public List<String> kSimilarity(String s1, String s2) {

        int n =s1.length();
        System.out.println("string length"+n);
        int startIndex = 0;


         permute(startIndex ,s1.toCharArray(),s1,n);
        System.out.println("result"+result);
        System.out.println("count"+count);
        return result;
    }

    public  void  permute(int startIndex ,char[] chars,String s1,int n){

        StringBuffer sb = new StringBuffer();


        if(startIndex ==s1.length()){
            sb=sb.append(chars);
            result.add(sb.toString());
           return ;
        }

        for(int i = startIndex;i<chars.length;i++){
            swap(chars,startIndex,i);
            permute(startIndex+1, chars ,s1,n);
            swap(chars,i,startIndex);

        }
    }

    public void swap(char[] chars,int i,int j){

        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] =temp;
    }

    public static void main(String[] args){

      String  s1 = "abc", s2 = "ba";
      StringPermutation kSimilarStrings = new StringPermutation();
      kSimilarStrings.kSimilarity( s1,  s2);

    }
}
