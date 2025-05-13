package Medium;


class MinStack155 {

    class ListNode{
        int value;
        ListNode next;
        int min;
        ListNode(int value, int min, ListNode next){
           this.value=value;
           this.next=next;
           this.min=min;
        }
    }
    ListNode head;
    public MinStack155() {
        head=null;
    }
    public void push(int val) {

        if(head==null){
            head=new ListNode(val,val,null);
        }
        int minimumValue=Math.min(head.min,val);
        head=new ListNode(val,minimumValue,head);
    }
    public void pop() {

        head=head.next;
    }
    public int top() {

        return head.value;
    }
    public int getMin() {
        return head.min;
    }

    public static void main(String[] args){
        MinStack155 minStack = new MinStack155();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.pop();
        int topValue = minStack.top();
        System.out.println("topValue"+topValue);
        int minValue = minStack.getMin();
        System.out.println("minValue"+minValue);

    }
}