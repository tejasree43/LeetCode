package singletonDesignPattern;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonBreakTest {
    public static void main(String[] args) throws CloneNotSupportedException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
/*
       System.out.println("Hello World LazySingleton using clone");
        LazySingleton instance=LazySingleton.getInstance();
        System.out.println("obj1 hashCode"+instance.hashCode());
        LazySingleton instance2= (LazySingleton) instance.clone();
       System.out.println("obj2 hashCode"+instance2.hashCode());

        System.out.println("obj1 and object2 equals"+instance2.equals(instance2));

        */

       /* System.out.println("Hello World LazySingleton using reflection");
        LazySingleton instance=LazySingleton.getInstance();
        System.out.println("obj1 hashCode"+instance.hashCode());
        LazySingleton reflectionInstance=null;

       Constructor[] constructors= LazySingleton.class.getDeclaredConstructors();

       for(Constructor constructor:constructors){
           constructor.setAccessible(true);
           reflectionInstance= (LazySingleton) constructor.newInstance();
       }

        System.out.println("reflectionInstance hashCode"+reflectionInstance.hashCode());

        System.out.println("obj1 and object2 equals"+reflectionInstance.equals(instance));*/

        //Next Serialization
        System.out.println("Hello World serialization/De serialization");
        LazySingleton instance1=LazySingleton.getInstance();
        System.out.println("LazySingleton obj1 hashCode"+instance1.hashCode());

        //serialize singleton object to a file

        ObjectOutput out=new ObjectOutputStream(new FileOutputStream("singletonser"));
        out.writeObject(instance1);
        out.close();

        //DeSerialize singleton object from a file

        ObjectInput in=new ObjectInputStream(new FileInputStream("singletonser"));
        LazySingleton instance2= (LazySingleton) in.readObject();
        in.close();
        System.out.println("DeSerialize instance2"+instance2.hashCode());
        System.out.println("obj1 and object2 equals"+instance2.equals(instance1));

        //Lazy innerclass doubleCheck Lazy
     /*   System.out.println("Hello World LazyInnerClassSingleton");
        LazyInnerClassSingleton obj1=LazyInnerClassSingleton.getInstance();
        System.out.println("DoubleCheckLazySingleton obj1 hashCode"+obj1.hashCode());
        LazyInnerClassSingleton obj2=LazyInnerClassSingleton.getInstance();
        System.out.println("DoubleCheckLazySingleton obj2 hashCode"+obj2.hashCode());

        System.out.println("obj1 and object2 equals"+obj2.equals(obj2));*/

    }


}
