package singletonDesignPattern;

public class User {

    public String name ;

    User(String name){
        this.name = name;
    }

    public void sayHello(){
    System.out.println("Hello my name is "+name);
    }

}
