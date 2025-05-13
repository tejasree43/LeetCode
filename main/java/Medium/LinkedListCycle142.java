package Medium;




 class ListSingleNode {
    int val;
    ListSingleNode next;
    public ListSingleNode(int x) {
        val = x;
        next = null;
    }
}
public class LinkedListCycle142 {
    public ListSingleNode detectCycle(ListSingleNode head) {

        ListSingleNode fast=head;
        ListSingleNode slow=head;
        int len = 0;

        int i=0;
        while(fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            i++;
            if (slow == fast) {
                System.out.println("i value"+i);
                slow=head;
                while(slow!=fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }

        }

        return null;
    }

    public static void main(String[] args) {

        LinkedListCycle142 linkedlist=new LinkedListCycle142();
        ListSingleNode head=new ListSingleNode(3);
        head.next=new ListSingleNode(2);
        head.next.next=new ListSingleNode(0);
        head.next.next.next=new ListSingleNode(-4);
        head.next.next.next.next=head.next;
        // linkedlist.printList(head);
        ListSingleNode output= linkedlist.detectCycle(head);
        System.out.println(output.val);
    }
}
