package Basics;


import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;


 class Address {

     private String city;
     private String state;
     private String country;
     public String getState() {
         return state;
     }
     public void setState(String state) {
         this.state = state;
     }
     public String getCity() {
         return city;
     }
     public void setCity(String city) {
         this.city = city;
     }
     public String getCountry() {
         return country;
     }

     public void setCountry(String country) {
         this.country = country;
     }

     Address(String city,String state,String country){
         this.state=state;
         this.city=city;
         this.country=country;
     }

     @Override
     public String toString() {
         return "Address{" +
                 "city='" + city + '\'' +
                 ", state='" + state + '\'' +
                 ", country='" + country + '\'' +
                 '}';
     }
 }
class Employee{
   int id;
    int age;
    String name;

    public List<Address> getListAddresses() {
        return listAddresses;
    }

    public void setListAddresses(List<Address> listAddresses) {
        this.listAddresses = listAddresses;
    }

    List<Address> listAddresses;


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



    Employee(String name, int id, int age, List<Address> listAddresses){
        this.name=name;
        this.id=id;
        this.age=age;
       this.listAddresses=listAddresses;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", listAddresses=" + listAddresses +
                '}';
    }
}

public class FilterDemo {

    public static void main(String[] args){

    List<Employee> al=new ArrayList<>();
        List<Address> address=new ArrayList<>();
        Address add1=new Address("wanchai","kowloon","HK");
        address.add(add1);
        List<Address> address2=new ArrayList<>();
        Address add2=new Address("cause","kowloon","HK");
        address2.add(add2);
        List<Address> address3=new ArrayList<>();
        Address add3=new Address("canon","kowloon","HK");
        address3.add(add3);



        al.add(new Employee("teju",2,25,address));
        al.add(new Employee("teju",2,25,address));
        al.add(new Employee("abc",3,26,address3));


        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2);


        /*Arrays.asList("a", "b", "c")
                .stream()
                .map(str -> str)          // <- is the same as this.
                .collect(Collectors.toMap(
                        Function.identity(), // <-- And this,
                        str -> str));
*/
        //List<Employee> result=al.stream().filter((Employee s)->s.age==25).collect(Collectors.toList());

            /*  Collection<Employee> filteredEmployees = al.stream()
                .collect(Collectors.toMap(
                        Employee::getId, Function.identity(),
                        BinaryOperator.maxBy(Comparator.comparing(Employee::getId))
                )).values();
*/

      //  filteredEmployees.forEach(System.out::println);
        //to remove duplicates

       // arrayList.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);






        // result.stream().forEach(System.out::println);

        //To get only names just map it.
     //   result.stream().map(Employee::getId).forEach(System.out::println);

        //filter the address which starts with c

     /* al.stream().map(Employee::getListAddresses).flatMap(Collection::stream).filter(children->children.getCity().startsWith("c"))
                .collect(Collectors.toList()).forEach(System.out::println);*/

    /*  al.stream()
                .filter(employee -> employee.getListAddresses().stream()
                        .anyMatch(adr -> adr.getCity().startsWith("c")))
                .forEach(System.out::println); */

      // collecting not required to use forEac*/

    }
}
