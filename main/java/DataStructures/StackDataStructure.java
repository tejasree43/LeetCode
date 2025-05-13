package DataStructures;

import java.util.Arrays;

public class StackDataStructure {

    int queue[]=new int[5];
    int size;
    int front;
    int rear;

    public void push(int data)
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
        rear++;
        size++;
    }
    public int pop()
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

        int data=queue[front];
        front++;
        size--;
        return data;
    }

    public int size(){
        return size;
    }
    public void print()
    {
        System.out.println("queue length"+queue.length);
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
        StackDataStructure stackDataStructure=new StackDataStructure();
        System.out.println("isEmpty()="+stackDataStructure.isEmpty());

        stackDataStructure.push(1);
        stackDataStructure.push(2);
        stackDataStructure.push(3);
        stackDataStructure.push(4);
        stackDataStructure.push(5);

        stackDataStructure.print();
        System.out.println("size1="+stackDataStructure.size());
        int dequeOutput=stackDataStructure.pop();
        System.out.println(dequeOutput);
        System.out.println("size2="+stackDataStructure.size());
        System.out.println("isEmpty()="+stackDataStructure.isEmpty());



    }
}
