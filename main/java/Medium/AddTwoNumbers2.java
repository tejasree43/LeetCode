package Medium;
import java.math.BigInteger;
import java.util.Stack;

class AddTwoNumbers2 {

    /*public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Stack<Integer> stack=new Stack();
        ListNode currentNode=l1;
        ListNode currentNode2=l2;

        StringBuffer sb=new StringBuffer();
        StringBuffer sb2=new StringBuffer();

         while(currentNode!=null)
              {
               int fields = currentNode.val;
               stack.push(fields);
               currentNode=currentNode.next;
             }

        while(!stack.isEmpty())
          {
              sb.append(stack.pop());
          }

        while(currentNode2!=null)
        {
            int fields = currentNode2.val;
            stack.push(fields);
            currentNode2 = currentNode2.next;
        }
        while(!stack.isEmpty())
        {
            sb2.append(stack.pop());

        }
        BigInteger l1int = new BigInteger(String.valueOf(sb));
        BigInteger l2int = new BigInteger(String.valueOf(sb2));

        BigInteger sum = l1int.add(l2int);

        System.out.println("sum"+sum);

        ListNode ans = new ListNode();
        ListNode tmp = ans;

        String sumStr = String.valueOf(sum);

       for(int i=sumStr.length()-1;i>=0;i--) {
           int value =(int)sumStr.charAt(i)-'0';
           tmp.val = value;
           if (i != 0) {
               tmp.next = new ListNode();
           } else {
               // for last element , set next null;
               tmp.next = null;
           }
           tmp = tmp.next;
       }
       // }


     return ans;

    }*/

 /*   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Stack<Integer> stack=new Stack();
        ListNode currentNode=l1;
        ListNode currentNode2=l2;

        StringBuffer sb=new StringBuffer();
        StringBuffer sb2=new StringBuffer();

        while(currentNode!=null)
        {
            int fields = currentNode.val;
            stack.push(fields);
            currentNode=currentNode.next;
        }

        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }

        while(currentNode2!=null)
        {
            int fields = currentNode2.val;
            stack.push(fields);
            currentNode2 = currentNode2.next;
        }
        while(!stack.isEmpty())
        {
            sb2.append(stack.pop());

        }
        BigInteger l1int = new BigInteger(String.valueOf(sb));
        BigInteger l2int = new BigInteger(String.valueOf(sb2));

        BigInteger sum = l1int.add(l2int);

        System.out.println("sum"+sum);

        ListNode ans = new ListNode();
        ListNode tmp = ans;

        String sumStr = String.valueOf(sum);

        for(int i=sumStr.length()-1;i>=0;i--) {
            int value =(int)sumStr.charAt(i)-'0';
            tmp.val = value;
            if (i != 0) {
                tmp.next = new ListNode();
            } else {
                // for last element , set next null;
                tmp.next = null;
            }
            tmp = tmp.next;
        }
        // }


        return ans;

    }*/

   // In summary, the program has a time complexity of O(max(m, n)) and a space complexity of O(max(m, n)).
   // It performs addition digit by digit on the linked lists and creates a new linked list to store the result.
   // The complexity scales linearly with the length of the longer input list.
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode l3 = dummy;
        int carrySum = 0;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int value1 = (l1 != null) ? l1.val : 0;
            int value2 = (l2 != null) ? l2.val : 0;

            //formula to be added
            carrySum = value1 + value2 + carry;
            carry = carrySum / 10;
            int node = carrySum % 10;
            ListNode newNode = new ListNode(node);
            l3.next = newNode;
            if (l1 != null)
                l1 = l1.next;
                if (l2 != null)
                    l2 = l2.next;
                l3 = l3.next;
            }
                if (carry > 0) {
                    ListNode newNode1 = new ListNode(carry);
                    l3.next = newNode1;
                    l3 = l3.next;

               }
        return dummy.next;
       }

      /*  while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }

        while(currentNode2!=null)
        {
            int fields = currentNode2.val;
            stack.push(fields);
            currentNode2 = currentNode2.next;
        }
        while(!stack.isEmpty())
        {
            sb2.append(stack.pop());

        }
        BigInteger l1int = new BigInteger(String.valueOf(sb));
        BigInteger l2int = new BigInteger(String.valueOf(sb2));

        BigInteger sum = l1int.add(l2int);

        System.out.println("sum"+sum);

        ListNode ans = new ListNode();
        ListNode tmp = ans;

        String sumStr = String.valueOf(sum);

        for(int i=sumStr.length()-1;i>=0;i--) {
            int value =(int)sumStr.charAt(i)-'0';
            tmp.val = value;
            if (i != 0) {
                tmp.next = new ListNode();
            } else {
                // for last element , set next null;
                tmp.next = null;
            }
            tmp = tmp.next;
        }
        // }*/




    public static void main(String[] args) {

        AddTwoNumbers2 addLists=new AddTwoNumbers2();

       /* ListNode head1 = new ListNode(2);
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(3);
        addLists.printList(head1);

        // 1->3->5 LinkedList created
        ListNode head2 = new ListNode(5);
        head2.next = new ListNode(6);
        head2.next.next = new ListNode(4);
        addLists.printList(head2);*/

      //  Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
      //  Output: [8,9,9,9,0,0,0,1]

        ListNode head1 = new ListNode(9);
        head1.next = new ListNode(9);
        head1.next.next = new ListNode(9);
        head1.next.next.next = new ListNode(9);
        head1.next.next.next.next = new ListNode(9);
        head1.next.next.next.next.next= new ListNode(9);
        head1.next.next.next.next.next.next= new ListNode(9);

       // addLists.printList(head1);
        ListNode head2 = new ListNode(9);
        head2.next = new ListNode(9);
        head2.next.next = new ListNode(9);
        head2.next.next.next = new ListNode(9);

       // addLists.printList(head2);
        ListNode result=addLists.addTwoNumbers(head1,head2);
        addLists.printList(result);

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
