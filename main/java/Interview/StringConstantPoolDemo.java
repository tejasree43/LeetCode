package Interview;

import java.text.ParseException;

public class StringConstantPoolDemo {

    public static void main(String[] args) throws ParseException {

        String s1 = "teju";
        String s2 = "teju";
        String s3 = new String("teju");
        String s4 = new String("teju");

        System.out.println(s1==s2);
        System.out.println(s3==s1);
        System.out.println("-----------");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s4));



    }
}
