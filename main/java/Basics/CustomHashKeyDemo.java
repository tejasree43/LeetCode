package Basics;


import java.util.HashMap;
import java.util.Objects;

class StudentDetails{

    int id;
    String name;

    public StudentDetails(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

   /* public void setName(String name) {
        this.name = name;
    }*/


    public int getId() {
        return id;
    }

   /* public void setId(int id) {
        this.id = id;
    }*/

    @Override
    public String toString() {
        return "StudentDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDetails that = (StudentDetails) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
public class CustomHashKeyDemo {

    public static void main(String[] args){

     StudentDetails  sd1  =  new StudentDetails(1,"teju");
     StudentDetails  sd2  =  new StudentDetails(1,"teju");
     StudentDetails  sd3  =  new StudentDetails(1,"teju");

     HashMap<StudentDetails,Integer> hMap = new HashMap();

        hMap.put(sd1,1);
        hMap.put(sd2,1);
        hMap.put(sd3,1);

       // sd2.setId(1);

        System.out.println(hMap);

        //drawback for this is if you set the ID after placing in map the data will be lost
        //For better efficiency make the class as immutable ,or you can avoid setter method to manipulate the data.
        System.out.println(hMap.get(sd2));

    }
}
