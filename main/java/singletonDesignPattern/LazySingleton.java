package singletonDesignPattern;

import java.io.Serializable;

//final copy of singleton
public class LazySingleton extends MyClone implements Serializable {

    private static LazySingleton instance;

    //to prevent from clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            throw new CloneNotSupportedException();
        }
        catch(Exception e){
            System.out.println("unable to create the object using clone");
        }
        return null;
    }

    //To prevent from reflection
    private LazySingleton(){

        if(instance!=null){
            throw new IllegalStateException("object can not be created using reflection");
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    protected  Object readResolve(){
        return instance;
    }


//create a static factory method

    //To avoid the race Condition in multithreaded environment we should add the synchronized keyword
    //to avoid the race condition
  public static synchronized LazySingleton getInstance(){
      if(instance ==null){
         return instance=new LazySingleton();
      }
      else{
          return instance;
      }
  }

}
