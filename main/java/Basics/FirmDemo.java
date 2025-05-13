package Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    int id;
    int age;
    String name;
    String firm;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    Student(String name, int id, int age, String firm) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.firm = firm;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", firm='" + firm + '\'' +
                '}';
    }
}

    public class FirmDemo {

    public static void main(String[] args) {
        List<Student> al=new ArrayList<>();

        al.add(new Student("teju",2,25,"e1"));
        al.add(new Student("teju",2,25,"e2"));
        al.add(new Student("abc",3,26,"e1"));


        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2);

        //grouping by firm will return the map<Integer,List<Student>
        al.stream().collect(Collectors.groupingBy(Student::getFirm)).forEach((k,v) ->System.out.println("key="+ k +",value="+v));;



    }

}
