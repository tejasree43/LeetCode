package Hard;

import Medium.ListNode;
import Medium.SwappingNodesinLinkedList1721;

public class ReverseNodesInkGroup25 {

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode previous = null;

        ListNode current = head;
        ListNode temp = head;

        int check = k;

        //to make sure that there are k nodes present in group to reverse them

        while (check > 0) {
            if (temp == null) {
                return head;
            }
            temp = temp.next;
            check--;
        }
        int count = 0;

        //there are not k nodes present in linked list to reverse
        //basic reverse linked list code

        while (current != null && count < k) {

            temp = current.next;
            current.next = previous;

            previous = current;
            current = temp;

            count++;
        }
        if (temp != null) {
            // now connecting tail to other reversed nodes (recursion)
            head.next = reverseKGroup(temp, k);
        }
        return previous;
    }

  //  return previous; the reason of returning this prev is - how internally the recursion function call works

    // Consider an example of 1->2->3->4 with k = 2
    // after the reverse in first iteration we will get
    // null<-1-<2    3->4->null
    // here prev = 2, and head = 1
    // now after second iteration - with the head.next part
    // 2->1->4->3
    // in second iteration prev = 4, and head = 3
    // but, in the case of recursion - when we return them it takes its parent value which was originally 2



    public ListNode print(ListNode head)
    {
        while(head.next!= null)
        {
            System.out.println(head.val +"-->");
            head=head.next;
        }
        System.out.println(head.val +"-->");

        return head;
    }
    public static void main(String[] args){

        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);

        int k=3;

        ReverseNodesInkGroup25 reverseNodes=new ReverseNodesInkGroup25();
        reverseNodes.print(head);
        ListNode output= reverseNodes.reverseKGroup(head,k);
        System.out.println("after sort");
        reverseNodes.print(output);
    }
}
