package Medium;

import java.util.Stack;

public class MaximumTwinSum2130 {


    public int pairSum(ListNode head) {

        if(head == null){
            return 0;
        }

        ListNode current = head ;

        Stack<Integer> stack = new Stack();
        int i =0;
        while(current!=null){

            stack.push(current.val);
            current = current.next;
            i++;

        }

        int twinValue = 0;

        while(stack.size()>stack.size()/2){
             int value = stack.pop();
             int currentValue = value+head.val;
             twinValue = Math.max(twinValue,currentValue);
             head = head.next;
        }
        return twinValue;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);

        MaximumTwinSum2130 twinSum = new MaximumTwinSum2130();
        int output = twinSum.pairSum(head);
        System.out.println("output"+output);

    }
}
