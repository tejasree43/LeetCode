package Easy;

import Interview.LuckyNumber;

import java.util.Arrays;

public class AddDigits258 {

    public int addDigits(int num) {

        String str = String.valueOf(num);
        int i=0;
        int total =0;
        while(i<str.length()){

            total+=str.charAt(i)-'0';
            i++;
        }
        if(total<10){
            return total;
        }

        return addDigits(total);

    }
    public static void main(String[] args) {

        int k= 38;
        AddDigits258 digit = new AddDigits258();
        int output = digit.addDigits(k);
        System.out.println(output);
    }
}
