package Medium;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class RearrangedNumber2165 {
    public long smallestNumber(long num) {

       boolean isNegative = false;

       long number = 0;

       if(num<0){
           isNegative = true;
           num = num *-1;
       }
      long answer =  reConstructToString(num,isNegative);

        System.out.println(number);
        System.out.println(isNegative);
        return isNegative? -answer:answer;
    }

    private long reConstructToString(long num,boolean isNegative) {

        String numString = Long.toString(num);
        char[] charArray = numString.toCharArray();

        if(!isNegative){
            Arrays.sort(charArray);
        }
        else{

      // Arrays.stream(charArray).
             //  String numString = Long.toString(num);
           // char[] charArray = numString.toCharArray();
           /* Character[] boxedArray = Arrays.stream(charArray)
                    .mapToObj(c -> (Character) c)
                    .toArray(Character[]::new);*/

            // Arrays.sort(charArray);

            /*int i =0;
            int j = charArray.length-1;
          while(i<=j)  {
              char temp = charArray[i] ;
              charArray [i] = charArray[j] ;
              charArray[j] = temp;
              i++;
              j--;
          }*/

           /* Arrays.sort(charArray,(a,b)-> {
                        String s1 = a + "" + b;
                        String s2 = b + "" + a;
                        return s2.compareTo(s1);
                    }
            );*/
            String a = new String(charArray);
            return Long.parseLong(a);
        }

        String value = new String(charArray);
        if(value.charAt(0)!='0') return Long.parseLong(value);

        for (int i=1;i<charArray.length;i++){

            if(value.charAt(i)!='0'){
                char temp;
                 temp= charArray[0];
                charArray[0] = charArray[1];
                charArray[1]=temp;
                String reValue = new String(charArray);
                return Long.parseLong(reValue);
            }

        }

        return 0;
    }

    public static void main(String[] args){
        RearrangedNumber2165 rearrange = new RearrangedNumber2165();
        //long number = -7605;
        long number = 310 ;
        long output = rearrange.smallestNumber(number);
        System.out.println("output"+output);

       /* char[] charArr = {'a', 'b', 'c'};

        Character[] charArrBoxed = new String(charArr).chars().mapToObj(c->(char) c).toArray(Character[]::new);

       System.out.println(Arrays.toString(charArrBoxed));
*/


    }
}
