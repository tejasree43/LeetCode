package Easy;


 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }

    public void print(ListNode node) {

        while(node.next!=null)
        {
            node=node.next;
        }
    }
}
 class MergeTwoSortedLists21 {


    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode tempNode=new ListNode();
        ListNode currentNode=tempNode;

        while(list1!=null &&list2!=null)
        {
            if(list1.val<=list2.val)
            {
                currentNode.next=list1;
                list1=list1.next;
            }
            else{
                currentNode.next=list2;
                list2=list2.next;
            }
            currentNode=currentNode.next;
        }
        if(list1!=null){
            currentNode.next=list1;

        }
        if(list2!=null){
            currentNode.next=list2;

        }
        return tempNode.next;
    }
    private  void printList(ListNode node) {

        while(node!=null)
        {

            System.out.println(node.val+" ");
            node=node.next;
        }

        System.out.println("--------");

    }
    public static void main(String[] args)
    {

        MergeTwoSortedLists21 ms=new MergeTwoSortedLists21();


        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(5);

        ms.printList(head1);

        // 1->3->5 LinkedList created
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(4);
        ms.printList(head2);

        // 0->2->4 LinkedList created
        ListNode mergedhead =ms. mergeTwoLists(head1, head2);

        ms.printList(mergedhead);
    }


}
