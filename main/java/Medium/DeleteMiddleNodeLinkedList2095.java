package Medium;

public class DeleteMiddleNodeLinkedList2095 {

    public ListNode deleteMiddle(ListNode head) {

      /*  ListNode temp=head;
        int linkedListLength=0;

        while(temp!=null){
            temp=temp.next;
            linkedListLength++;
        }
        int linkedListMidPosition=linkedListLength/2;
        System.out.println("linkedListMidPosition:"+linkedListMidPosition);

        ListNode node = head;
        if(linkedListMidPosition==0){
            return head;
        }
        else {
            for (int i = 0; i < linkedListMidPosition - 1; i++) {
                node = node.next;
            }
            node.next=node.next.next;
        }
        return head;*/

        if(head.next == null){
            return null;
        }

        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;


        while(fast!=null && fast.next!=null){
           temp = slow;
           slow = slow.next;
           fast = fast.next.next;
        }

        temp.next = slow.next;

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
        head.next=new ListNode(3);
        head.next.next=new ListNode(4);
        head.next.next.next=new ListNode(7);
        head.next.next.next.next=new ListNode(1);
        head.next.next.next.next.next=new ListNode(2);
        head.next.next.next.next.next.next=new ListNode(6);

        DeleteMiddleNodeLinkedList2095 deleteMiddleNode=new DeleteMiddleNodeLinkedList2095();
        deleteMiddleNode.print(head);
        ListNode output= deleteMiddleNode.deleteMiddle(head);
        System.out.println("after removed element ");
        deleteMiddleNode.print(output);

    }
}
