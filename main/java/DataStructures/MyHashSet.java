package DataStructures;

import java.util.ArrayList;
import java.util.List;


class LinkNode{
    int val;
    LinkNode next;

    LinkNode (int val){
      this.val= val;
      this.next = null;
    }


        }
public class MyHashSet {

    LinkNode head;
    public MyHashSet() {

        head = null;

    }

    public void add(int key) {

        if(head ==null){
            head = new LinkNode(key);
        }

         boolean keyExists= contains(key);
         if(!keyExists){

          LinkNode temp = head;

          while(temp.next!=null){

              temp=temp.next;
          }
          temp.next = new LinkNode(key);
        }

    }

    public void remove(int key) {
        if(head == null) return;

        if(head.val == key){

            head = head.next;
        }
        LinkNode temp = head;

        while(temp.next!=null){

            if(temp.val==key){
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }


    }

    public boolean contains(int key) {

        if (head == null) return false;
        if (head.val == key) return true;

        LinkNode temp = head;

        while (temp.next != null) {
            if (temp.val == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args)
    {
    MyHashSet obj = new MyHashSet();
        obj.add(2);
        obj.add(1);
        obj.remove(2);
    boolean output = obj.contains(1);
    System.out.println("output"+output);

    }
}
