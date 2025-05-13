package DataStructures;

import java.util.Arrays;

//FIFO order

public class QueueDataStructure {

    int queue[]=new int[4];
     int size;
     int front;
     int rear;

     public void enQueue(int data)
     {
         /*if(queue.length==0)
         {
           queue[front]=data;
           rear=data;
           rear++;
         }
         else{
             queue[rear]=data;
             rear++;
         }*/
         queue[rear]=data;
         rear=(rear+1)%4;
         size++;
     }
    public int deQueue()
    {
        System.out.println("dequeue starts");
       /*  my solution;
       /* int temp;
        int n=size-1;
        int i=0;
        while(n>=0) {
            temp = queue[i];
            System.out.println("temp"+temp);
          n--;
          i++;  }*/

        //in circular way
        int data=queue[front];
        front=(front+1)%4;
        size--;
        return data;

       /* int data=queue[front];
        front++;
        size--;
        return data;*/
    }

    public int size(){
         return size;
    }
     public void print()
     {
         Arrays.stream(queue).forEach(s->System.out.println(s));

     }
    public boolean isEmpty()
    {
        if(size==0)
        {
            return true;
        }
        return false;
    }

     public static void main(String[] args)
     {
         QueueDataStructure queueDatastructure=new QueueDataStructure();
         System.out.println("isEmpty()="+queueDatastructure.isEmpty());

         queueDatastructure.enQueue(5);
         queueDatastructure.enQueue(2);
         queueDatastructure.enQueue(7);
         queueDatastructure.enQueue(3);

         queueDatastructure.print();
         System.out.println("size1="+queueDatastructure.size());
         int dequeOutput=queueDatastructure.deQueue();
         System.out.println(dequeOutput);
         System.out.println("size2="+queueDatastructure.size());
         System.out.println("isEmpty()="+queueDatastructure.isEmpty());
         queueDatastructure.enQueue(4);
         System.out.println("size3="+queueDatastructure.size());

         queueDatastructure.print();



     }
}
