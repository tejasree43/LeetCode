public class hashCodeDemo {

    public static void main(String args[]){

        Employee e1=new Employee();
        e1.setId(1);
        e1.setName("Tejasree");

        Employee e2=new Employee();
        e2.setId(1);
        e2.setName("Tejasree");

        System.out.println("equals deep comparision"+ (e1.equals(e2)));
        System.out.println("shallow memory comparision"+ (e1==e2));



    }


}
