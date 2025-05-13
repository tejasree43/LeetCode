package Medium;



 class CopyListwithRandomPointer138 {

     public Node copyRandomList(Node head) {

         Node current =head;

         return current;
     }
     public Node print(Node head)
     {
         while(head.next!= null)
         {
             System.out.println(head.val +"-->"+head.random.val);
             //System.out.println(head.random.val +"-->");

             head=head.next;
         }
         System.out.println(head.val +"-->");

         return head;
     }
     public static void main(String[] args) {

         CopyListwithRandomPointer138 copy= new CopyListwithRandomPointer138();

     /*    Node head = new Node(7);
         head.random =new Node();
         head.next = new Node(13);
         head.next.next = new Node(11);
         head.next.next.next = new Node(10);
         head.next.next.next.next = new Node(1);*/

         Node head = new Node(1);
         head.next = new Node(2);
         head.next.next = new Node(3);
         head.next.next.next = new Node(4);
         head.next.next.next.next = new Node(5);

         head.random = head.next;
         head.next.random = head;
         head.next.next.random = head.next.next.next.next;
         head.next.next.next.random = head.next.next;
         head.next.next.next.next.random = head.next;

         copy.print(head);

        Node output= copy.copyRandomList(head);
         System.out.println("the out put is");

         copy.print(output);


     }

}
