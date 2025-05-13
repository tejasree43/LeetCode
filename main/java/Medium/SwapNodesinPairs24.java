package Medium;

 class SwapNodesinPairs24 {

    public ListNode swapPairs(ListNode head) {

        ListNode listNodeTemp1=head;
        ListNode listNodeTemp2=head.next;

        while(listNodeTemp1!=null&&listNodeTemp2!=null){

          int t=listNodeTemp2.val;
          listNodeTemp2.val=listNodeTemp1.val;
          listNodeTemp1.val=t;

          if(listNodeTemp2.next!=null){

              listNodeTemp1=listNodeTemp2.next;
          }
          else{
              return head;
          }
          if(listNodeTemp1.next!=null){

              listNodeTemp2=listNodeTemp1.next;
          }
          else{
              return head;
          }
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
        SwapNodesinPairs24 sl=new SwapNodesinPairs24();
        sl.print(head);
        ListNode output= sl.swapPairs(head);
        System.out.println("after sort");
        sl.print(output);
    }


}
