package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneNumber17 {

    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();

        if(digits.length() == 0)return result;

        HashMap<Character,String> hm=new HashMap<>();
        hm.put('1',"");
        hm.put('2',"abc");
        hm.put('3',"def");
        hm.put('4',"ghi");
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");

        String temp="";
        backtracking(temp,digits,result,0,hm);
        System.out.println(result);

       return result;
    }

    private void backtracking(String temp, String digits, List<String> result, int start, HashMap<Character, String> hm) {

       if(temp.length()==digits.length()){

           result.add(temp);
           return;
       }

       char digit = digits.charAt(start);
       String stringValue =  hm.get(digit);

       for(int i =0;i<stringValue.length();i++){

         char ch =  stringValue.charAt(i) ;
         temp += ch;
         backtracking(temp,digits,result,start+1,hm);
         temp =temp.substring(0,temp.length()-1);

       }

    }

    public static void main(String[] args){

        String s = "23";
        PhoneNumber17 phoneNumber=new PhoneNumber17();
        phoneNumber.letterCombinations(s);

    }
}
