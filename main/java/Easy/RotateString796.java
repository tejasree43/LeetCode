package Easy;

import java.util.Arrays;

public class RotateString796 {

    public boolean rotateString(String s, String goal) {

      int n=s.length()-1;
      char[] ch=s.toCharArray();
      int start=0; int i=0;
        while(i<n){

          while(start<n)
          {
              char temp=ch[n];
              ch[n]=ch[start];
              ch[start]=temp;
              start++;
          }

          if(Arrays.equals(ch,goal.toCharArray())){
              return true;
          }
         /* if(goal.equals(new String(ch))){
              return true;
          }*/

          i++;
          start=0;

      }
     return false;
    }

    public static void main(String[] args)
    {
        RotateString796 rs=new RotateString796();
        String s = "abcde", goal = "cdeab" ;
        boolean output  =rs.rotateString(s,goal);
        System.out.println("output"+output);
    }
}
