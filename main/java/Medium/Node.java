package Medium;

public class Node {
    int val;
    public Node next;
    Node random;
    public Node() {

    }

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
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
}