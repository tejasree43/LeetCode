package Medium;

public class OddEvenLinkedList328 {

    public ListNode oddEvenList(ListNode head) {

        if(head == null){
            return null;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode newHead = even;

        while(even!=null&&even.next!=null&&odd!=null&&odd.next!=null)
        {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next ;
            even = even.next;
        }

        odd.next = newHead;

        return head;
    }

    public ListNode print(ListNode head1)
    {
        if(head1==null){
            return null;
        }
        while(head1.next!= null)
        {
            System.out.println(head1.val +"-->");
            head1=head1.next;
        }
        System.out.println(head1.val +"-->");

        return head1;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        OddEvenLinkedList328 oddEven = new OddEvenLinkedList328();
        ListNode output = oddEven.oddEvenList(head);
        System.out.println("after removed element ");
        oddEven.print(output);

    }
}
