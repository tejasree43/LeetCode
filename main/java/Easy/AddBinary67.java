package Easy;

import java.math.BigInteger;

public class AddBinary67 {

    public String addBinary(String a, String b) {

    StringBuilder result = new StringBuilder();

    int i = a.length()-1;
    int j = b.length()-1;
    int carry = 0;

    while(i>=0||j>=0){

        int sum = carry;

        if(i>=0){
            sum +=a.charAt(i) -'0';
            i--;
        }
        if(j>=0){
            sum +=b.charAt(j) -'0';
            j--;
        }
        carry = sum > 1 ? 1:0;
        // getting carry depend on the quotient we get by dividing sum / 2 that will be our carry. Carry could be either 1 or 0
        // if sum is 0 res is 1 & then carry would be 0;
        // if sum is 1 res is 1 & carry would be 0
        // if sum is 2 res is 0 & carry would be 1
        // if sum is 3 res is 1 & carry would be 1
        result.append(sum%2);

    }
       if(carry!=0){
           result.append(carry);
        }

       // return result.reverse().toString();

       //shortcut solution

        BigInteger m = new BigInteger(a,2);
        BigInteger n = m.add(new BigInteger(b,2));
        return n.toString(2);

    }

        public static void main(String[] args) {

        AddBinary67 binaryAdd = new AddBinary67();
       // String a = "11",  b = "1" ;
            String a = "1011",  b = "1101" ;
       String output = binaryAdd.addBinary(a,b);
       System.out.println("output"+output);
    }

}


   /* Given two binary strings a and b, return their sum as a binary string.
        Example 1:
        Input: a = "11", b = "1"
        Output: "100"

        Example 2:
        Input: a = "1010", b = "1011"
        Output: "10101"*/