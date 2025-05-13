package Basics;

public class StringCompression {

    public String compressString(char[] chars){


      StringBuffer sb=new StringBuffer();
        int i=0;int j=1;int count=0;int k=0;
        while(i<chars.length){
            sb.append(chars[i]);
            count=0;
            while(j<chars.length) {
                if(chars[i]!=chars[j]){
                    break;
                }
                if (chars[i] == chars[j]) {
                    count++;
                }
                j++;
            }
            i=j;
            k++;
            if(count>0) {
                    sb.append(count);
                    k++;
            }
        }
         return new String(sb);
    }


    public static void main(String[] args){

        char[] chars={'a','a','a','a','a','a','a','a','a','a','a','a','a','a','b','b','c','c'};
        StringCompression compression=new StringCompression();
       String s= compression.compressString(chars);
       System.out.println("output"+s);

    }
}
