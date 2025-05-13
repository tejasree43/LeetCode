package Easy;

public class GreatestCommonDivisorofStrings1071 {

    public String gcdOfStrings(String str1, String str2) {

        if(!(str1+str2).equals(str2+str1)) return "";

        int gcdLength = gcd(str1.length(),str2.length());

        return str1.substring(0,gcdLength);
    }

    private int gcd(int x, int y) {

        if(y == 0) {
            return x;

        }
        else {
            int value = x%y;
            return gcd(y,value);
        }

    }
    public static void main(String[] args){

     //tring  str1 = "ABCABC",  str2 = "ABC";
      String  str1 = "ABABAB", str2 = "ABABY";
      GreatestCommonDivisorofStrings1071 gcd = new GreatestCommonDivisorofStrings1071();
      String output = gcd.gcdOfStrings(str1,str2);
      System.out.println("output"+output);
    }
}
