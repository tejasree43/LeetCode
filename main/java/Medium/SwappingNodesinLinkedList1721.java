package Medium;

public class SwappingNodesinLinkedList1721 {

    public ListNode swapNodes(ListNode head, int k) {


        int counterValue=k;

        ListNode result1=head;
        ListNode result2=head;

        ListNode temp=head;

        while(counterValue>0){
            result1=temp;
            temp=temp.next;
            counterValue--;
        }

        //very imp step to understand end index k-1 items
        while(temp!=null){
            temp=temp.next;
            result2=result2.next;
        }
        System.out.println("result1 value"+result1.val);
        System.out.println("result2 value"+result2.val);

        int nodeValue=result2.val;
        result2.val=result1.val;
        result1.val=nodeValue;

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
        head.next.next.next.next.next=new ListNode(6);
        head.next.next.next.next.next.next=new ListNode(7);

        int k=2;

        SwappingNodesinLinkedList1721 swapNodes=new SwappingNodesinLinkedList1721();
        swapNodes.print(head);
        ListNode output= swapNodes.swapNodes(head,k);
        System.out.println("after sort");
        swapNodes.print(output);
    }
}
