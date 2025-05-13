package singletonDesignPattern;

public class DoubleCheckLazySingleton {
    private static DoubleCheckLazySingleton instance;
    private DoubleCheckLazySingleton(){

    }
//create a static factory method

    //To avoid the race Condition in multithreaded environment we should add the double checked
    //to avoid the race condition
    public static  DoubleCheckLazySingleton getInstance(){
        if(instance ==null) {
            synchronized (DoubleCheckLazySingleton.class) {
                if(instance ==null) {
                     instance= new DoubleCheckLazySingleton();
                }
            }
        }
         return instance;
    }
}
