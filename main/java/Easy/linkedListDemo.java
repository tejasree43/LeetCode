package Easy;

public class linkedListDemo {

    public static void main(String[] args)
    {
       /*  Node n=new Node();
        n.insert(5);
        n.insert(10);
        n.insert(15);
        n.addAtFirst(1);
        n.insertAtIndex(1,12);
        n.insertAtIndex(0,0);
        n.deleteAt(2);
        n.print();*/


        Node list1=new Node();
        list1.insert(1);
        list1.insert(2);
        list1.insert(4);
        list1.print();
        Node list2=new Node();
        list2.insert(1);
        list2.insert(3);
        list2.insert(4);
        list1.print();

    }
}
 class Node{
    Node head=null;
    Node next=null;
    int data = 0;

     Node()
     {
     }

     public void deleteAt(int index) {
         if(index==0)
         {
            head=head.next;
         }
         else{
             Node n=head;
             for(int i=0;i<index-1;i++)
             {
                 n=n.next;
             }
             n.next=n.next.next;
             System.out.println("n values"+n.data);
         }

     }
         public void addAtFirst(int val)
    {
        Node node=new Node();
        node.data=val;
        node.next=null;

        if (head==null) {
            head=node;
        }
        else{
            //Node currentValue=head;
            //node.next=currentValue;
            node.next=head;
            head= node;
        }

    }
    public void insert(int val) {
        Node node=new Node();
        node.data=val;
        node.next=null;

        if (head==null) {
           head=node;
          }
         else {
            Node n = head;
            while (n.next!=null) {
                n = n.next ;
            }
            n.next = node;

        }
    }

     public void insertAtIndex(int index,int value) {
         Node node=new Node();
         node.data=value;
         node.next=null;
         if (head==null) {
             head=node;
         }
         if(index==0)
         {
             addAtFirst(value);
         }
         else {
             Node n = head;
             for (int i=0;i<index-1;i++) {
                 n = n.next ;
             }
             node.next = n.next;
             n.next=node;

         }
     }

    public void print()
    {
        System.out.println("print method starts here");
        Node current = head;
        while(current!= null)
        {
            System.out.println(current.data +"-->");
            current=current.next;
        }

       // another way
       /* while(current.next!= null)
        {
            System.out.println(current.data +"-->");
            current=current.next;
        }
        System.out.println(current.data +"-->");*/

    }
}
