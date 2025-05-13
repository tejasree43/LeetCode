package Easy;

import Medium.ListNode;
import java.util.*;

public class RemoveDuplicatesfromSortedList83 {

    public ListNode deleteDuplicates(ListNode head) {
    //BruteForce Approach:

        //Brute Force Approach
       /* ListNode ans=new ListNode();
        if(head==null)
        {
            return head;
        }
        SortedSet<Integer> set=new TreeSet<>();
        ListNode currentNode=head;
        while(currentNode!=null)
        {
            set.add(currentNode.val);
            currentNode=currentNode.next;
        }
        ListNode temp=ans;
        List<Integer> al=new ArrayList<>(set);

        for(int i=0;i<al.size();i++){
           int value= al.get(i);
            temp.val = value;
               if(i!=al.size()-1){
                   temp.next=new ListNode() ;
               }
               else{
                   temp.next=null;
               }
              temp=temp.next;
        }
        return ans;
    } */

        if(head == null ||head.next ==null)
        {
            return head ;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head ;
        ListNode previous = dummy ;
        ListNode current = head ;

        while(current!=null)
        {
            if (current.next !=null && current.val==current.next.val)
            {
                    current = current.next;
                    previous.next = current ;
            }
            else{
                    previous = previous.next;
                   current = current.next;

            }


        }

          return dummy.next;

    }

    public static void main(String[] args) {

        RemoveDuplicatesfromSortedList83 removeDuplicates=new RemoveDuplicatesfromSortedList83();
       // -3,-1,0,0,0,3,3 expected : -3,-1,0,3
       /* ListNode head1 = new ListNode(-3);
        head1.next = new ListNode(-1);
        head1.next.next = new Medium.ListNode(0);
        head1.next.next.next = new Medium.ListNode(0);
        head1.next.next.next.next = new Medium.ListNode(0);
        head1.next.next.next.next.next = new Medium.ListNode(3);
        head1.next.next.next.next.next.next = new Medium.ListNode(3);*/

        //Testcase 2 = 1,1,2,3,3

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(1);
        head1.next.next = new ListNode(2);
        head1.next.next.next = new ListNode(3);
        head1.next.next.next.next = new ListNode(3);

        removeDuplicates.printList(head1);

        ListNode result=removeDuplicates.deleteDuplicates(head1);
        removeDuplicates.printList(result);

    }

    private  void printList(ListNode node) {

        System.out.println("Inside Print method");
        while(node!=null)
        {
            System.out.print(node.val+"-> ");
            node=node.next;
        }
        System.out.println("--------");

    }
}
