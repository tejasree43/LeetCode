package Easy;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {

    Queue<Integer> queue;
    Queue<Integer> topPopQueue;

    public ImplementStackUsingQueues() {
       this.queue = new LinkedList<>();
        this.topPopQueue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {

        while(queue.size()>1){
            topPopQueue.add(queue.remove());
        }
        int pop = queue.remove();

        Queue<Integer> temp = queue;
        queue = topPopQueue;
        topPopQueue=temp;

        return pop;
    }

    public int top() {

        while(queue.size()>1){
            topPopQueue.add(queue.remove());
        }
        int top = queue.peek();
        topPopQueue.add(queue.remove());
        //simple swap
        Queue<Integer> temp=queue;
        queue=topPopQueue;
        topPopQueue=temp;
       return top;
    }

    public boolean empty() {
        if(queue.isEmpty()) return true;
        return false;
    }

    public static void main(String[] args){
        ImplementStackUsingQueues myStack = new ImplementStackUsingQueues();
        myStack.push(1);
        myStack.push(2);
        //myStack.push(3);

        int topValue= myStack.top(); // return 2
        System.out.println("topValue"+topValue);
        int popValue= myStack.pop(); // return 2
        int popValue1= myStack.pop(); // return 2

        System.out.println("popValue"+popValue);
        System.out.println("popValue1"+popValue1);

        boolean stackEmpty= myStack.empty(); // return False
        System.out.println("stackEmpty"+stackEmpty);
    }
}
