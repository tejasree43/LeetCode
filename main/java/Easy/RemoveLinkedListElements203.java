package Easy;

import Medium.ListNode;

public class RemoveLinkedListElements203 {

    public ListNode removeElements(ListNode head, int val) {

        if (head == null) {
            return null;
        }
        while (head != null&& head.val ==val) {
              head = head.next;
        }

       // ListNode answer = new ListNode();

        //ListNode previous = answer;
        ListNode current = head;

       /* while (current != null && current.next!=null) {

            if (current.next.val == val) {
                current = current.next.next;
            } else {

                current = current.next;
            }

         }*/
       // ListNode current = head;
        ListNode previous = null;


        while(current!=null){

            if(current.val == val){
                previous.next = current.next;
                //current = current.next;
            }
            else{

                previous = current;

            }
            current = current.next;

        }

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

    public static void main(String[] args){
        ListNode head=new ListNode(7);
        head.next=new ListNode(7);
        head.next.next=new ListNode(7);
        head.next.next.next=new ListNode(7);
      /*  head.next.next.next.next=new Medium.ListNode(4);
        head.next.next.next.next.next=new Medium.ListNode(5);
        head.next.next.next.next.next.next=new Medium.ListNode(6);
*/
        ListNode listNode=new ListNode();

        RemoveLinkedListElements203 rlle=new RemoveLinkedListElements203();
       // listNode.print(head);
        int n=7;
        ListNode output= rlle.removeElements(head,n);
        System.out.println("after removed element ");
        rlle.print(output);

    }
}
