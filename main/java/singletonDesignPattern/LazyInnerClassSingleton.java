package singletonDesignPattern;

public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton(){

    }
//This solution is thread safe and no need add synchronization
    private static class singletonHelper{
    private static final LazyInnerClassSingleton instance=new LazyInnerClassSingleton();
    }

    public static LazyInnerClassSingleton getInstance(){
       return singletonHelper.instance;
    }
}
