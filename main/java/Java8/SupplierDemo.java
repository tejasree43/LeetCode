package Java8;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String args[]) {

        Supplier<Date> currentDate=()->new Date();
        System.out.println("currentDate="+currentDate.get());
    }
    }
