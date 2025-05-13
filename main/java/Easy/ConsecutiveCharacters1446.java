package Easy;

import java.util.HashMap;

public class ConsecutiveCharacters1446 {

    public int maxPower(String s) {

     char ch[]=s.toCharArray();
     int n=ch.length;
     int i=0;
     int sum=0;
     int maxValue=0;
     while(i<n){

         int j=i;
         sum=0;
         while(j<n){
             if(ch[i]==ch[j]){
                 sum++;
             }
             else if(ch[i]!=ch[j]){
                 break;
             }
             j++;
         }
         maxValue=Math.max(maxValue,sum);
         i++;
     }

    return maxValue;
    }
    public static void main(String[] args){

        String s = "abbcccddddeeeeedcba";
        ConsecutiveCharacters1446 consecutiveCharacters=new ConsecutiveCharacters1446();
        int output=consecutiveCharacters.maxPower(s);
        System.out.println(output);

    }
}
