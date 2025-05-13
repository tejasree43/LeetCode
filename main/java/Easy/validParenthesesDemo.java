package Easy;

import java.util.Stack;

public class validParenthesesDemo {

    public static boolean isValid(String input) {
        Stack<Character> st = new Stack<>();


        char[] charInput = input.toCharArray();

        for (Character ch : charInput) {

            switch (ch) {

                case '(':
                case '[':
                case '{':
                    st.push(ch);
                    break;
                case ')':
                    if(st.isEmpty()||st.pop()!='('){
                        return false;
                    }
                    break;
                case ']':
                    if(st.isEmpty()||st.pop()!='['){
                        return false;
                    }
                    break;
                case '}':
                    if(st.isEmpty()||st.pop()!='{'){
                        return false;
                    }
                    break;
            }

        }
        st.stream().forEach(s -> System.out.println(s));
        System.out.println("size"+st.size());

        return st.isEmpty();

    }

    public static void main(String[] args) {

/*        System.out.println( isValid("()[]{}"));
        System.out.println( isValid("(]"));
        System.out.println( isValid("({})"));*/
        System.out.println( isValid("[]"));




    }

}
