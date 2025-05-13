package Easy;

import Medium.ListNode;
import Medium.SortList148;

public class ReverseLinkedList206 {


    public ListNode reverseList(ListNode head) {

      /*  ListNode previous=null;
        ListNode current=head;


        while(current!=null){
            ListNode temp= current.next;
            current.next = previous;
            previous = current;
            current=temp;

        }

        return previous;*/
        //Using recursion
       /* ListNode previous=null;
        ListNode current=head;*/

        if(head == null || head.next == null){
            return head;
        }

        ListNode newHead = reverseList(head.next);

        ListNode temp = head.next;
        temp.next = head;
        head.next = null;

        return newHead;
    }

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

        ReverseLinkedList206 sl=new ReverseLinkedList206();
        sl.print(head);
        ListNode output= sl.reverseList(head);
        System.out.println("after sort");
        sl.print(output);


    }
}
