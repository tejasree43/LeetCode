package DataStructures;

import java.util.Iterator;
import java.util.PriorityQueue;

class Student implements Comparable<Student>{
  String studentName;
  int studentRank;
  public Student(String studentName, int studentRank) {
    this.studentName=studentName;
    this.studentRank=studentRank;
  }
  @Override
  public int compareTo(Student s) {
    if(studentRank < s.studentRank) {
      return -1;
    }
    else if(studentRank > s.studentRank)
    {
      return 1;
    }
      return 0;
  }
  @Override
  public String toString() {
    return "Student{" +
            "studentName='" + studentName + '\'' +
            ", studentRank=" + studentRank +
            '}';
  }
}

public class PriorityQueueDemo {

  public static void main(String[] args) {
    //PriorityQueue<Student> pq = new PriorityQueue<>();
  /*  pq.add(new Student("srii",2));
    pq.add(new Student("abc",3));
    pq.add(new Student("data",4));
    pq.add(new Student("Tejas",1));
    Iterator<Student> it=pq.iterator();
    System.out.println("before queue size"+pq.size());
    System.out.println("before queue head"+pq.peek());
    System.out.println("removing for peek"+pq.remove());

    while(it.hasNext())
    {
    System.out.println("The item of the queue"+pq.poll().toString());
    }
    System.out.println("after queue size"+pq.size());
*/

    PriorityQueue<Integer> queue = new PriorityQueue<>();
    queue.add(5);
    queue.add(3);
    queue.add(4);
    queue.add(1);


    queue.stream().forEach(s->System.out.println(s));


  }

}
