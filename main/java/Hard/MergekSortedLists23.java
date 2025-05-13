package Hard;

import Medium.ListNode;

import java.util.PriorityQueue;

public class MergekSortedLists23 {

   // Time complexity:
   // O(nlogn) which is the time taken to create a heap. Remember PriorityQueue are created using a heap.
    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < lists.length; i++) {

            ListNode current = lists[i];
            while (current != null) {
                pq.add(current.val);
                current = current.next;
            }

        }
        ListNode head=new ListNode();
        ListNode temp=head;
        while(pq.size()>0){
         temp.next=new ListNode(pq.remove());
         System.out.println( temp.next.val);
         temp= temp.next;
        }


        System.out.println();

        return head.next;
    }


    public static void main(String[] args){

        //list1
        ListNode list1=new ListNode(1);
        list1.next=new ListNode(4);
        list1.next.next=new ListNode(5);

        //list2
        ListNode list2=new ListNode(1);
        list2.next=new ListNode(3);
        list2.next.next=new ListNode(3);

        //list3
        ListNode list3=new ListNode(2);
        list3.next=new ListNode(6);
        ListNode[] nodes={list1,list2,list3};

        MergekSortedLists23 mergeKList=new MergekSortedLists23();
        mergeKList.mergeKLists(nodes);
    }
}
