package Medium;



import java.util.LinkedList;

class MyLinkedList {

    int val ;
    MyLinkedList head;
    MyLinkedList next;
    int size;


    public MyLinkedList() {
        this. size=0;

    }
    public MyLinkedList(int val, MyLinkedList next) {
        this.val = val;
        this.next =null;

    }
    public int get(int index) {

        if(index == 0){
            if(head==null) {
                return -1;
            }
            else{
               return head.val;
            }
        }
        else{
            MyLinkedList current = head ;

            int i=0;
            while(current!=null&&i<index){

                 current = current.next;

                 if(i==index-1){
                     return current.val;
                 }

            i++;
            }
        }
        return -1;

    }

    public void addAtHead(int val) {

        MyLinkedList node=new MyLinkedList(val,null);

        if (head == null){
            head = node;
        } else{

            MyLinkedList current = head;
             node.next=current;
             head=node;
        }

        size++;

    }

    public void addAtTail(int val) {

        MyLinkedList node = new MyLinkedList(val, null);
        MyLinkedList current = head;

        if (head == null) {

            head = node;
        } else {
            while (current.next != null) {
                current = current.next;
            }

            current.next = node;
        }
        size++;

    }
    public void addAtIndex(int index, int val) {

        MyLinkedList node=new MyLinkedList(val,null);

        MyLinkedList current = head ;

        if(index==0){
            node.next=head;
            head=node;
        } else if (index >= size) {
            if (index == size) {
                addAtTail(val);
            }
            return;
        }else {
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

                node.next = current.next;
                current.next = node;

        }
        size++;

    }

    public void deleteAtIndex(int index) {
        if(index ==0){
            head= head.next;
        } else {

            MyLinkedList current = head ;

            int i=0;
            while(current.next!=null && i<index-1){
                current = current.next;
                i++;
            }
            if( current.next!=null) {
                current.next = current.next.next;
            }
        }

    }

    public void print()
    {
        MyLinkedList current = head;
       System.out.println("print method start here");

        //  Node current = head;
        while(current!= null)
        {
            System.out.print(current.val +"-->");
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
    public static void main(String[] args) {


        MyLinkedList myLinkedList = new MyLinkedList();
     ;
        myLinkedList.addAtIndex(1,0);
        myLinkedList.print();
        System.out.println();
        myLinkedList.get(0);
        myLinkedList.print();
        System.out.println();
     /*
["MyLinkedList","addAtHead","addAtTail","addAtIndex"]
[[],[1],[3],[3,2]]

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(3,2);



        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1,2);

        myLinkedList.get(1);
        myLinkedList.deleteAtIndex(1);
        myLinkedList.get(1);

        myLinkedList.get(3);
        myLinkedList.deleteAtIndex(3);
        myLinkedList.deleteAtIndex(0);
        myLinkedList.get(0);
        myLinkedList.deleteAtIndex(0);
        myLinkedList.get(0);

*/

       /* MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1,2);
        myLinkedList.print();
        System.out.println();
        int output1 =myLinkedList.get(1);
        System.out.println("output="+output1);
        myLinkedList.deleteAtIndex(1);
        myLinkedList.print();

        int output2 =myLinkedList.get(1);
        System.out.println("output2="+output2);

        int output3 = myLinkedList.get(3);
        System.out.println("output3=="+output3);

        myLinkedList.deleteAtIndex(3);

        myLinkedList.print();
        System.out.println();

        myLinkedList.deleteAtIndex(0);
        myLinkedList.print();
        System.out.println();
        int output4=myLinkedList.get(0);
        System.out.println("output4=="+output4);
        myLinkedList.print();
        System.out.println("end");

        myLinkedList.deleteAtIndex(0);
        myLinkedList.print();
        System.out.println("nothing left");

        int output5=myLinkedList.get(0);
        System.out.println("output5=="+output5);
*/






         /*myLinkedList.addAtHead(7);
        myLinkedList.print();
        System.out.println();

       // myLinkedList.addAtTail(1);
        myLinkedList.addAtHead(2);

        myLinkedList.print();
        System.out.println();
        myLinkedList.addAtHead(1);

       // myLinkedList.addAtHead(9);
        myLinkedList.print();
        System.out.println();
        // myLinkedList.addAtHead(9);
        myLinkedList.addAtIndex(3, 0);    // linked list becomes 1->2->3

        myLinkedList.print();
        System.out.println();

        myLinkedList.deleteAtIndex(2);
        myLinkedList.print();
        System.out.println();
        myLinkedList.deleteAtIndex(2);

        // linked list becomes 1->2->3
        myLinkedList.print();
        System.out.println();

        myLinkedList.addAtHead(6);
        myLinkedList.print();
        System.out.println();
        myLinkedList.addAtTail(4);
        int outPutValue = myLinkedList.get(4);

        myLinkedList.print();

        System.out.println("outPutValue"+outPutValue);*/
    }
}

