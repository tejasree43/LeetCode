package Medium;

import java.util.Stack;

public class RemoveKDigits402 {
    public String removeKdigits(String num, int k) {

        Stack<Character> stack = new Stack();
        for(Character ch :num.toCharArray()) {

            while (!stack.isEmpty() && k > 0 && (ch < stack.peek())) {
                stack.pop();
                k--;
            }

            if(!stack.isEmpty()||ch!='0')
            {
                stack.push(ch);
            }

        }
        while(!stack.isEmpty()&& k-->0)
        {
            stack.pop();
        }
        if(stack.isEmpty()) return "0";

        String ans ="";
        while(!stack.isEmpty()){
            ans = stack.pop()+ans;
        }
        return ans;

    }
    public static void main(String[] args) {
        RemoveKDigits402 removeKdigit = new RemoveKDigits402();
        String num = "10200";
        int k = 1;
        String output = removeKdigit.removeKdigits(num,k);

        System.out.println("output"+output);

    }
}
