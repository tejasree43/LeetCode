package Basics;

public class BetterCompression {
    public String compressString(String s){


       int currentNumber=0;
       int currentIndex=-1;

       int[] frequency=new int[26];
       for(char ch:s.toCharArray()){

           if(ch>='0'&&ch<='9'){
               currentNumber = currentNumber * 10 + (ch - '0');
           }
           else {
               if (currentIndex != -1) {
                   frequency[currentIndex] += currentNumber;
               }
               currentNumber = 0;
               currentIndex = ch - 'a';

           }
       }
        if (currentIndex != -1) {
            frequency[currentIndex] += currentNumber;
        }

     StringBuilder sb=new StringBuilder();

     for(int i=0;i<frequency.length;i++)
       {
           if (frequency[i] > 0) {
               sb.append((char)(i+'a'));
               sb.append(frequency[i]);
           }
       }
        return new String(sb);
    }


    public static void main(String[] args){

        String s1="a14b2c6a12c10b2";
        BetterCompression bettercompression=new BetterCompression();
        String s= bettercompression.compressString(s1);
        System.out.println("output"+s);

    }
}
