package Medium;

import java.util.*;

public class RemoveDuplicateLetters316 {
    public String removeDuplicateLetters(String s) {

    Stack<Character> stack = new Stack<>();

        int[]  alpha = new int[26];
       HashMap<Character,Integer> map = new HashMap<>();

       for(int i=0;i<s.length();i++){
           map.put(s.charAt(i),i);

       }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(alpha[ch-'a']==1){
                continue;
            }

            while(!stack.isEmpty()&& ch <stack.peek()&& i<map.get(stack.peek())){

                alpha[stack.pop()-'a'] = 0;
            }

            stack.push(ch);
            alpha[ch-'a'] = 1;

        }
        StringBuilder sb = new StringBuilder();

       for(char c:stack){
         sb.append(c);
        }


       return sb.toString();

       /* int[] alpha = new int[26];
        HashMap<Character, Integer> map =  new HashMap<>();
        Stack<Character> stack = new Stack<>();

        //Store the last Index of the character.
        for(int i = 0; i < s.length(); i++) map.put(s.charAt(i), i);

        //TRAVERSE EACH CHARACTER
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);

            //IF ALREADY ADDED, CONTINUE
            if(alpha[curr - 'a'] == 1) continue;

            //IF WE CAN POP THE PEEK BECAUSE IN NEXT TRAVERSAL I CAN ADD THIS CHARACTER
            //BY USING IT'S LAST INDEX.
            while(!stack.isEmpty() && curr < stack.peek() && i < map.get(stack.peek())){
                // ONCE I POP I HAVE TO CHANGE THE ALPHA ARRAY TOO.
                alpha[stack.pop() - 'a'] = 0;
            }
            stack.push(curr);
            alpha[curr - 'a'] = 1;
        }

        StringBuilder sb = new StringBuilder();
        for(char c:stack){
            sb.append(c);
        }
        return sb.toString();*/
    }

    public static void main(String[] args) {
       String s = "cbacdcbc";
       RemoveDuplicateLetters316 removeDuplicates=new RemoveDuplicateLetters316();
     String output=   removeDuplicates.removeDuplicateLetters(s);

     System.out.println(output);

    }


}
