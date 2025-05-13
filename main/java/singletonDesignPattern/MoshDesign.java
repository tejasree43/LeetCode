package singletonDesignPattern;

public class MoshDesign {


    public static void main(String[] args) {

        //var user = new User();
       // user.sayHello();
       TaxCalculator calculator = getTaxCalculator();
       System.out.println(calculator.taxCalculate());
    }
    public static TaxCalculator getTaxCalculator()
    {
        return new TaxCalcultor2026();
    }

}
