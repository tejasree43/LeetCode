package YT;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

class Student {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String name;
    int age;

    Student(String name,int age){
        this.name=name;
        this.age= age;


    }

}
public class StudentsDemo {


    public static void main(String[] args){

        ArrayList list1 = new ArrayList<>((Collection) new Student("abc",21))  ;
        list1.add( new Student("def",18));
        list1.add( new Student("ghi",25));
        list1.add( new Student("ddd",23));

     //list1.stream().filter((Student a)->a.age>20).forEach(System.out.println());



    }
}
