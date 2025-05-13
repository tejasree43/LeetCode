package Hard;

import java.util.Stack;

public class LongestValidParentheses {

    public int longestValidParentheses(String s) {


        Stack<Character> chstack=new Stack<>();
        Stack<Integer> ind=new Stack<>();
        ind.push(-1);
        int ans=0;
        if(s.length()==0)
        {
            return ans;
        }

       char[] params= s.toCharArray();

        for(int i=0;i<params.length;i++){

               if(s.charAt(i)=='(') {
                   chstack.push('(');
                   ind.push(i);
               }
             else{
                 if(!chstack.empty()&&chstack.peek()=='('){
                      chstack.pop();
                       ind.pop();
                       ans=Math.max(ans,i-ind.peek());
                   }
                 else{
                     ind.push(i);
                 }

           }
        }

        System.out.println("count="+ans);
return ans;

    }

    public static void main(String[] args) {
        LongestValidParentheses longValid=new LongestValidParentheses();

       //String s="(()";
      //  String s="()(())";

         String s=")()())";
      // String s = "()(()";
        longValid.longestValidParentheses(s);
    }
}
