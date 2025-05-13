package Easy;


import java.util.Queue;
import java.util.Stack;

public class ImplementQueueUsingStacks {

    Stack<Integer> stack;
    Stack<Integer> topPopStack;

    public ImplementQueueUsingStacks() {
        this.stack = new Stack<>();
        this.topPopStack = new Stack<>();

    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        while(!stack.isEmpty()){
            topPopStack.add(stack.pop());
        }
        int pop = topPopStack.pop();
        while(!topPopStack.isEmpty()){
            stack.add(topPopStack.pop());
        }
        return pop;
    }

    public int peek() {

        if(!empty()){
            while(!stack.isEmpty()){
                topPopStack.push(stack.pop());
            }
            int v = topPopStack.peek();
            while(!topPopStack.isEmpty()){
                stack.push(topPopStack.pop());
            }
            return v;
        }
        return 0;
    }

    public boolean empty() {

        return stack.isEmpty();
    }

    public static void main(String[] args){
        ImplementQueueUsingStacks queue = new ImplementQueueUsingStacks();
        queue.push(1);
        queue.push(2);

        int topValue= queue.peek(); // return 1
        System.out.println("topValue"+topValue);
        int popValue= queue.pop(); // return 1

        System.out.println("popValue"+popValue);

        boolean stackEmpty= queue.empty(); // return False
        System.out.println("stackEmpty"+stackEmpty);
    }
}
