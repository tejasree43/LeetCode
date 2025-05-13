package Medium;

import org.w3c.dom.NodeList;

public class RemoveDuplicatesfromSortedListII82 {


    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode previous = dummy ;

        ListNode current = head;
    while (current != null)
    {
        if(current.next != null&&current.val ==current.next.val) {

            while (current.next != null && current.val == current.next.val) {

                current = current.next;
            }
            previous.next = current.next ;
        }else {
            previous = previous.next;
        }

        current = current.next ;

    }
   return  dummy.next;
    }





    public static void main(String[] args){

       // Node link = new Node()
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(3);
        head1.next.next.next.next = new ListNode(4);
        head1.next.next.next.next.next= new ListNode(4);
        head1.next.next.next.next.next.next= new ListNode(5);
        RemoveDuplicatesfromSortedListII82 h = new RemoveDuplicatesfromSortedListII82();
       ListNode output =  h.deleteDuplicates(head1);
     //  System.out.println(output.toString());
       // head1.p
    }

}
