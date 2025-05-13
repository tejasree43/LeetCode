package Medium;

public class RemoveNthNodeFromEnd19 {

    /*Time complexity:
    O(N)
    Space complexity:
    O(1)
   */
    public ListNode removeNthFromEnd(ListNode head, int n) {


        ListNode temp=head;
        //Find the LinkedList length
        int linkedListLength=0;
        while(temp!=null){
            temp=temp.next;
            linkedListLength++;
        }

        int removePosition=linkedListLength-n;
        ListNode node=head;
        if(removePosition==0){
           return head;
        }
        else {
            for (int i = 0; i < removePosition - 1; i++) {
                //iterate up to before removal position
                node = node.next;
            }
            node.next = node.next.next;
        }

        return head;
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

        RemoveNthNodeFromEnd19 rnfe=new RemoveNthNodeFromEnd19();
        rnfe.print(head);
        int n=2;
        ListNode output= rnfe.removeNthFromEnd(head,n);
        System.out.println("after removed element ");
       rnfe.print(output);

    }
}
