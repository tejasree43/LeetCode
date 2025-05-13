package Java8;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

    public static void main(String[] args){

       List<Customer> customers= EkartDataBase.getAll();


       //Mapping Logic-for one to one mapping
       // List<String> emails=customers.stream().map(Customer::getEmail).collect(Collectors.toList());
        //customer->customer.getEmail() ->one to one mapping

        List<String> emails1=customers.stream().map(s->s.getEmail()).collect(Collectors.toList());

        System.out.println("emails1"+emails1);

        //customer->customer.getPhoneNumbers() ->one
        List<List<String>> streamPhoneNumbers=customers.stream().map(customer->customer.getPhoneNumbers()).collect(Collectors.toList());

        System.out.println("streamPhoneNumbers"+streamPhoneNumbers);

        List<String> phoneNumbers=  customers.stream().flatMap(x->x.getPhoneNumbers().stream()).collect(Collectors.toList());
        List<String> phoneNumbers1=  customers.stream().flatMap(x->x.getPhoneNumbers().stream()).map(x->x).collect(Collectors.toList());

        System.out.println("phoneNumbers"+phoneNumbers);
    }
}
