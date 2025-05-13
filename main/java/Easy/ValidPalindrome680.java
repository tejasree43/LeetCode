package Easy;

public class ValidPalindrome680 {
    public boolean validPalindrome(String s) {


        int  i = 0;
        int  j = s.length()-1;
        while(i<j){
           char lc = s.charAt(i);
           char rc = s.charAt(j);

           if(lc!=rc){
              return compare(s,i,j-1)|| compare(s,i+1,j);
           }
           i++;
           j--;
       }
        return true;
    }
    public boolean compare(String s,int l,int r){
      System.out.println("accessing");
        char lc = s.charAt(l);
        char rc = s.charAt(r);
        while(l<r) {
            if (lc != rc) {

                return false;
            }
            l++;
            r--;
        }
        return true;

    }



    public static void main(String[] args)
    {

        ValidPalindrome680 sp=new ValidPalindrome680();

        String s= "eeccccbebaeeabebccceea";
        System.out.println(sp.validPalindrome(s));
    }
}
