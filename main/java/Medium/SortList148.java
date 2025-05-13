package Medium;


public class SortList148 {

    public ListNode sortList(ListNode head) {

      if(head==null|| head.next==null){
          return head;
      }

     // For merge sort return the lists into halves
        ListNode previous=null;
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null&&fast.next!=null){

            previous=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        previous.next=null;
        //recursion for two halves
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);

        return mergeHelper(l1,l2);
    }
    public static ListNode mergeHelper( ListNode list1 , ListNode list2){
        System.out.println("calling merge sort");
        ListNode temp=new ListNode();
        ListNode currentNode= temp;

        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){

                currentNode.next=list1;
                list1=list1.next;
            }
            else{
                currentNode.next=list2;
                list2=list2.next;
            }
            currentNode= currentNode.next;
        }
        if(list1!=null){
            currentNode.next=list1;
            currentNode= currentNode.next;
        }
        if(list2!=null){
            currentNode.next=list2;
            currentNode= currentNode.next;
        }

    return temp.next;
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
        ListNode head=new ListNode(4);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(1);
        SortList148 sl=new SortList148();
        sl.print(head);
        ListNode output= sl.sortList(head);
        System.out.println("after sort");
        sl.print(output);


    }
}
