package Basics;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EmployeeIdComparator implements Comparator<EmployeeDetails>{


    @Override
    public int compare(EmployeeDetails e1, EmployeeDetails e2) {
        if(e1.getId()==e2.getId()) {
            return 0;
        }
        else if(e1.getId()>e2.getId()){
            return 1;
        }
        else{
            return -1;
        }    }
}

class EmployeeDetails {
    int id;
    String name;
    int salary;

    public EmployeeDetails(){

    }
    public EmployeeDetails(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class ComparatorDemo {

    public static void main(String[] args) {
        EmployeeDetails e1 = new EmployeeDetails(3, "teju", 90000);
        EmployeeDetails e2 = new EmployeeDetails(2, "abc", 20000);
        EmployeeDetails e3 = new EmployeeDetails(1, "srii", 72000);

        List<EmployeeDetails> listRef = new ArrayList<>();
        listRef.add(e1);
        listRef.add(e2);
        listRef.add(e3);

        //using comparator
       // EmployeeDetails e=new EmployeeDetails(); //just plain comparator object
       // EmployeeIdComparator idComparator =new EmployeeIdComparator();

        System.out.println("before sort " + listRef);
        /*Collections.sort(listRef,idComparator); //based on ID
        System.out.println("after sort " + listRef);*/

        listRef.sort((lhs,rhs)->lhs.getName().compareTo(rhs.getName()));
       // listRef.sort(Comparator.comparingInt(EmployeeDetails::getId));

        System.out.println("after sort " + listRef);




    }


}
