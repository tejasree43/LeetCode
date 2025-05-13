package Easy;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses22 {
    List<String> parenthesisPair=new ArrayList();
    public List<String> generateParenthesis(int n) {

        StringBuffer sb=new StringBuffer();
        int open=0;int close=0;
        backtrackingParenthesis(n,open,close, sb);
        return parenthesisPair;
    }
    public void backtrackingParenthesis(int n, int open, int close, StringBuffer sb)
    {
        if(sb.length()==n*2)
        {
            parenthesisPair.add(sb.toString());
            return;
        }
        if(open<n) {
           sb.append('(');
           backtrackingParenthesis(n,open+1,close, sb);
           sb.deleteCharAt(sb.length()-1);
        }
        if(close<open)
        {
            sb.append(')');
            backtrackingParenthesis(n,open,close+1, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public static void main (String[] args)
    {
    GenerateParentheses22 gp=new GenerateParentheses22();
    int input=3;
    List a=gp.generateParenthesis(input);
    a.stream().forEach(s->System.out.println(s));
    }
}


/*
    Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
*/

//Input: n = 3
//Output: ["((()))","(()())","(())()","()(())","()()()"]

/*
Input: n = 1
Output: ["()"]
*/
