package Hard;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class DesignaTextEditor2296 {

    Deque<Character> left = new ArrayDeque<>();
    Deque<Character> right = new ArrayDeque<>();

    public DesignaTextEditor2296() {
    }

    public void addText(String text) {
      for(char ch: text.toCharArray()){
          left.add(ch);
      }
    }

    public int deleteText(int k) {
        int i =0;
        while (!left.isEmpty() && k--> 0) {
            left.removeLast();
            i++;
        }
      return i;
    }

    public String cursorRight(int k) {

        while (!right.isEmpty()&&k-->0) {
           left.addLast(right.removeFirst());
         }
        return getLastChars();
    }
    public String cursorLeft(int k) {
        while (!left.isEmpty()&&k-->0) {
            right.addFirst(left.removeLast());
        }
        return getLastChars();
    }
    public String getLastChars() {

        StringBuilder sb = new StringBuilder();

       int len = Math.min(10, left.size());
       Character[] chars = left.toArray(new Character[0]);
       int calLength = Math.max(0, left.size()-len);
       for (int i =calLength;i<left.size();i++)
       {
           sb.append(chars[i]);
       }

        return sb.toString();

    }

    public static void main(String[] args) {

    DesignaTextEditor2296  textEditor = new DesignaTextEditor2296();
        textEditor.addText("leetcode"); // The current text is "leetcode|".
        int textLength = textEditor.deleteText(4); // return 4
        System.out.println("textLength"+textLength);
        // The current text is "leet|".
        // 4 characters were deleted.
        textEditor.addText("practice"); // The current text is "leetpractice|".
     /*   int textLength2 =  textEditor.deleteText(4); // return 4
        System.out.println("textLength"+textLength);*/

        // The current text is "leet|".
        // 4 characters were deleted.
        String output =  textEditor.cursorRight(3); // return "etpractice"
        System.out.println("output ="+output);

        String leftOutput = textEditor.cursorLeft(8);
        System.out.println("leftOutput"+leftOutput);
        int delete10 = textEditor.deleteText(10);
        System.out.println("delete10="+delete10);
        String cursorRight6 = textEditor.cursorRight(6);
        System.out.println("cursorRight6="+cursorRight6);



    }
}

    /* Input   ["TextEditor", "addText", "deleteText", "addText", "cursorRight", "cursorLeft", "deleteText", "cursorLeft", "cursorRight"]
        [[], ["leetcode"], [4], ["practice"], [3], [8], [10], [2], [6]]
        Output
        [null, null, 4, null, "etpractice", "leet", 4, "", "practi"]*/