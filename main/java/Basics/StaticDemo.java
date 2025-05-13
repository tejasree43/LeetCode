package Basics;

class Emp{

    int id;
    String name;
    int salary;

    static String ceo;



    Emp(){
        System.out.println("constructor running");
        id=1;
        name="random";
        salary=6000;
        System.out.println("id :"+ id +"name:"+ name +" salary:"+ salary + " ceo:"+ceo);

    }
    static{
        System.out.println("static");
        ceo="Larry";
    }
    static{
        System.out.println("static1");
        ceo="Larry";
    }

    public void show(){

    System.out.println("id :"+ id +"name:"+ name +" salary:"+ salary + " ceo:"+ceo);

    }


}
public class StaticDemo {
     int i=0;
    public static void main(String[] args){

        StaticDemo sdnew =new StaticDemo();
        sdnew.i=9;
        System.out.println( "non static var"+sdnew.i);
        Emp emp=new Emp();
        emp.id=1;
        emp.name="Tejasree";
        emp.salary=1000;
        //Emp.ceo="Nitin"; //We don't know object
        Emp emp2=new Emp();
        emp2.id=1;
        emp2.name="Sri";
        emp2.salary=2000;
        Emp.ceo="Teju";
        emp.show();
        emp2.show();


    }
}
