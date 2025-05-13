package Easy;


import java.util.HashSet;

/* class SingleNode
{
    int data;
    SingleNode next;

    // Constructor to create a new node
    SingleNode(int d) {data = d; next = null; }
}*/
 class SingleNode {
    int val;
    public SingleNode next;
    public SingleNode(int x) {
      val = x;
      next = null;
 }
}

public class LinkedListCycle141 {

    private  void printList(SingleNode node) {

        while(node!=null)
        {

            System.out.println(node.val+" ");
            node=node.next;
        }

        System.out.println("--------");

    }

    public boolean hasCycle(SingleNode node) {

        //TimeComplexity is O(n)
        //SpaceComplexity is O(n)
        /* HashSet<SingleNode> s = new HashSet<SingleNode>();
        while (node != null) {
            if (s.contains(node))
                return true;
            s.add(node);
            node = node.next;
        }
       */

        //Floyd cycle finding solutions
        //TimeComplexity is O(n)
        //SpaceComplexity is O(1)
        SingleNode fast=node;
        SingleNode slow=node;

            while(fast!=null&&fast.next!=null) {
                slow=slow.next;
                fast=fast.next.next;
                if (slow == fast) {
                    return true;
                }

            }

        return false;
    }



    public static void main(String[] args) {
        LinkedListCycle141 linkedlist=new LinkedListCycle141();


        SingleNode head=new SingleNode(3);
        head.next=new SingleNode(2);
        head.next.next=new SingleNode(0);
        head.next.next.next=new SingleNode(-4);
        //head.next.next.next=head.next;
       // linkedlist.printList(head);
        boolean output= linkedlist.hasCycle(head);
        System.out.println("cycle exist"+output);
    }
}
