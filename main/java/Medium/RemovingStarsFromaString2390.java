package Medium;

import java.util.Stack;

public class RemovingStarsFromaString2390 {

    public String removeStars(String s) {

        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){

            if(ch =='*') {
               stack.pop();
            }else {
                stack.push(ch);
            }
        }
        String ans="";
        while(!stack.isEmpty()){

            char ch=stack.pop();
            ans = ch+ans;
        }
        return ans;
       /* StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray())
            if (c == '*')
                res.setLength(res.length() - 1);
            else
                res.append(c);
        return res.toString();*/
    }

    public static void main(String[] args) {
     RemovingStarsFromaString2390 stars = new RemovingStarsFromaString2390();
     String  s = "leet**cod*e";
     String output = stars.removeStars(s);
     System.out.println("output"+output);
    }
    }


