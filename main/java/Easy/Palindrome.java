package Easy;
public class Palindrome {
    public static boolean isPalindrome(int x)
    {
        //Mathematical way
      /*  int original = x;
        int rev = 0;

        while(x>0){
            System.out.println("x%10="+x%10);
            rev = x%10 + rev*10;
            System.out.println("rev="+rev);
            x= x/10;
            System.out.println("x="+x);

        }
        return rev==original ? true : false;*/

        if(x<0){
            return false;
        }

       // String intString = String.valueOf(x);
        String intString = Integer.toString(x);
        int n =  intString.length();
        for(int i =0; i<n/2;i++){
            int start = intString.charAt(i);
            int end = intString.charAt((n-i)-1);

            if(start!= end){
                return false;
            }

        }

        return true;
    }
    public static void main(String[] args) {
      int input=121;
      boolean output = Palindrome.isPalindrome(input);
      System.out.println("output"+output);
    }


    }
