package singletonDesignPattern;

public class SingletonTest {

    public static void main(String[] args){

       /*System.out.println("Hello World");
       EagerSingleton obj1=EagerSingleton.getInstance();
        System.out.println("obj1 hashCode"+obj1.hashCode());
       EagerSingleton obj2=EagerSingleton.getInstance();
       System.out.println("obj2 hashCode"+obj2.hashCode());

        System.out.println("obj1 and object2 equals"+obj2.equals(obj2));*/

     //Next doubleCheck Lazy
       /* System.out.println("Hello World DoubleCheckLazySingleton");
        DoubleCheckLazySingleton obj1=DoubleCheckLazySingleton.getInstance();
        System.out.println("DoubleCheckLazySingleton obj1 hashCode"+obj1.hashCode());
        DoubleCheckLazySingleton obj2=DoubleCheckLazySingleton.getInstance();
        System.out.println("DoubleCheckLazySingleton obj2 hashCode"+obj2.hashCode());

        System.out.println("obj1 and object2 equals"+obj2.equals(obj2));*/

        //Lazy innerclass doubleCheck Lazy
        System.out.println("Hello World LazyInnerClassSingleton");
        LazyInnerClassSingleton obj1=LazyInnerClassSingleton.getInstance();
        System.out.println("DoubleCheckLazySingleton obj1 hashCode"+obj1.hashCode());
        LazyInnerClassSingleton obj2=LazyInnerClassSingleton.getInstance();
        System.out.println("DoubleCheckLazySingleton obj2 hashCode"+obj2.hashCode());

        System.out.println("obj1 and object2 equals"+obj2.equals(obj2));

    }
}
