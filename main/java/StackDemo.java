import java.util.Stack;

public class StackDemo {
    public static void main(String[] args)
    {
        Stack<Character> input=new Stack<>();
        input.add('a');
        input.add('b');
      //  input.pop();

        input.stream().forEach(s->System.out.println(s));
      //  System.out.println("is Empty method:"+input.isEmpty());


    }
}
