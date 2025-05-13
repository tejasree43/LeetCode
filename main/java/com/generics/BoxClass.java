package com.generics;

public class BoxClass<T>{
   T item ;


   public T getItem()
   {
       return item ;
   }
    public void setItem(T item)
    {
        this.item = item; ;
    }

    public static void main(String[] args)
    {

        BoxClass<String> stringBoxClass = new BoxClass<>();
        stringBoxClass.setItem("TejuString");
        stringBoxClass.getItem();
        System.out.println("StringBox contains"+ stringBoxClass.getItem());

        BoxClass<Integer> integergBoxClass = new BoxClass<>();
        integergBoxClass.setItem(234);
        integergBoxClass.getItem();
        System.out.println("IntegerBox contains"+ integergBoxClass.getItem());
    }
}
