package Interview;

import Medium.InsertInterval57;

import java.util.Stack;


public class ValidParenthesis {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        /*for (char ch : s.toCharArray()) {
            switch (ch) {
                case '{':
                case '(':
                case '[':
                    stack.push(ch);
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                   return false;
                    }
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
            }

        }
        return stack.isEmpty();*/

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == '}' || ch == ')' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((ch == '}' && top != '{') || (ch == ')' && top != '(') || (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParenthesis parenthesis = new ValidParenthesis();
        String s = "()[]{}(}";
        boolean output = parenthesis.isValid(s);
        System.out.println("output"+output);
    }
}

//The space complexity is O(n), and the time complexity is also O(n), where n is the length of the input string s.