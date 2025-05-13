package Medium;


import java.util.HashMap;
import java.util.List;

class LRUCache146 {

  class ListNode{

      int key ;
      int value ;
      ListNode next ,prev ;
      ListNode(int key , int value)
      {
       this.key = key;
       this.value = value;

      }

  }

    ListNode head; //dummy nodes
    ListNode tail; //dummy nodes

    HashMap<Integer,ListNode> hashMap;

    int capacity;
    public LRUCache146(int capacity) {

        hashMap = new HashMap<>();
        this.capacity = capacity ;
         head = new ListNode(0,0);
         tail = new ListNode(0,0);
         head.next = tail ;
         tail.prev = head ;


    }

    public int get(int key) {
        if(!hashMap.containsKey(key)) {
          return -1;
        }
        ListNode node = hashMap.get(key);
        remove(node);
        insertToHeadNode(node);
        return node.value;
    }

    public void put(int key, int value) {

        if(hashMap.containsKey(key)) {
            remove(hashMap.get(key));
          }

        ListNode newNode = new ListNode(key,value);
        insertToHeadNode(newNode);
        hashMap.put(key,newNode);

        if(hashMap.size()>capacity)
        {
          ListNode lru = tail.prev;
          remove(lru);
          hashMap.remove(lru.key);

        }


    }
    public void remove (ListNode node)  // 1 2 3
    {
        node.prev.next = node.next;
        node.next.prev = node.prev ;
    }


    private void insertToHeadNode(ListNode node){


        // head ⇄ X ⇄ Y ⇄ tail    //  before
        // head  z ⇄ X ⇄ Y ⇄ tail //after shift

        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;


    }
    public static void main(String[] args){
        LRUCache146 lRUCache = new LRUCache146(2);
        lRUCache.put(1, 1); // cache is {1=1}
        lRUCache.put(2, 2); // cache is {1=1, 2=2}
       // lRUCache.get(1);    // return 1
        System.out.println( lRUCache.get(1));
        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
       // lRUCache.get(2);    // returns -1 (not found)
        System.out.println(lRUCache.get(2));
        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        lRUCache.get(1);    // return -1 (not found)
        System.out.println( lRUCache.get(3));// return 3
        lRUCache.get(4);
    }
}