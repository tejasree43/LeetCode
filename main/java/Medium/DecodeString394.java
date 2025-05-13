package Medium;

import java.util.Stack;

//3[a]2[bc]
public class DecodeString394 {

        public String decodeString(String s) {

            Stack<Integer> stack = new Stack<>();
            Stack<StringBuilder> stackStringBuilder = new Stack<>();

            StringBuilder builder = new StringBuilder();

            char[] stringToCharArray =s.toCharArray();
            int number = 0;
            for(char ch:stringToCharArray)
            {
             if(Character.isDigit(ch)){
                 number = (number*10) + ch-'0';
             }
             else if (ch == '[')
             {
                 stackStringBuilder.add(builder);
                 builder = new StringBuilder();
                 stack.add(number);
                 number = 0;
             }
             else if (ch == ']')
             {
                 StringBuilder temp =builder;
                 int numberFromStack=stack.pop();
                 builder = stackStringBuilder.pop();

                 while (numberFromStack>0)
                 {
                     builder.append(temp);
                     numberFromStack--;
                 }
              //  builder.append("");
                 number = 0;
             }
             else{
                 builder.append(ch);
             }
            }

            return  builder.toString();
        }

        public static void main(String[] args){

    DecodeString394 decodeString = new DecodeString394();
    //String s = "30[a]2[bc]";
      String s  ="3[a2[c]]";//"3[a2[c]]:"accaccacc"
        //String s= "3[a]2[bc]";
        //"aaabcbc"

       // String s  =  "2[abc]3[cd]ef";//"abcabccdcdcdef"
       String output =  decodeString.decodeString(s);

       System.out.println(output);

    }
}

       /*Example 1:

        Input: s = "3[a]2[bc]"
        Output: "aaabcbc"
        Example 2:

        Input: s = "3[a2[c]]"
        Output: "accaccacc"
        Example 3:

        Input: s = "2[abc]3[cd]ef"
        Output: "abcabccdcdcdef"
*/