package Basics;



public class IsPalindromeDemo {

    public static boolean IsPalindromeCheck(String s){

      int  low=0;
      int high=s.length()-1;

      while(low<high){

          if(s.charAt(low)!=s.charAt(high))
          {
              return false;
          }
          low++;
          high--;

      }


        return true;
    }
    public static void main(String[] args){
       String  s = "aaa";

       int n=121;
    boolean output=IsPalindromeDemo.IsPalindromeCheck(s);

    System.out.println("palindrome"+output);
    }
}
