package SystemDesign;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employee{

  int employeeId;
  String name;
  String org;
  int exp;
  boolean isManager;
 public Employee(int employeeId,String name, String org, int exp, boolean isManager) {
  this.employeeId = employeeId;
  this.name = name;
  this.org = org;
  this.exp = exp;
  this.isManager = isManager;
 }


}

/*interface Filter<T,R>{
 //List<R> filter(List<T> items,Predicate<T> condition);
 List<R> filter(List<T> items, Predicate<T> condition);

}*/
interface Filter<T, R> {
 List<R> filter(List<T> items, Predicate<T> condition);

}

class EmployeeFilterByID implements Filter<Employee,Integer>{
 @Override
 public List<Integer> filter(List<Employee> employees, Predicate<Employee> condition) {

  List<Integer> result = new ArrayList<>();
  for(Employee employee:employees){
  if(condition.test(employee)) {
    result.add(employee.employeeId);
    }
  }
  return result;
 }
}

class EmployeeFilterByName implements Filter<Employee,String>{
 @Override
 public List<String> filter(List<Employee> employees, Predicate<Employee> condition) {

  List<String> result = new ArrayList<>();
  for(Employee employee:employees){

   if(condition.test(employee)) {
    result.add(employee.name);
   }
  }
  return result;
 }
}
public class designGenericFilter {
 public static void main(String[] args) {

 /*List<Employee> employees =new ArrayList<>();
  employees.add(new Employee("Adam", "Sales", 5, false));
  employees.add(new Employee("Bob", "Marketing", 7, true));
  employees.add(new Employee("Charlie", "Sales", 3, false));
*/
  List<Employee> employees = List.of(
          new Employee(1, "Adam", "Sales", 6, false),
          new Employee(2, "Bob", "Marketing", 7, true),
          new Employee(3, "Charlie", "Sales", 3, false)
  );
  System.out.println(employees.size());

  Predicate<Employee> salesNonManagerExpGreaterThanFive =
          e -> "Sales".equals(e.org) && !e.isManager && e.exp > 5;

  //Employee filter by Id
  Filter<Employee, Integer> EmployeeFilterByID = new EmployeeFilterByID();
  List<Integer> employeeIdsResult = EmployeeFilterByID.filter(employees, salesNonManagerExpGreaterThanFive);
  System.out.println("Employee IDs result: " + employeeIdsResult);

 //Employee filter by Name
  Filter<Employee, String> EmployeeFilterByName = new EmployeeFilterByName();
  List<String> employeeNamesResult = EmployeeFilterByName.filter(employees, salesNonManagerExpGreaterThanFive);
  System.out.println("Employee names result: " + employeeNamesResult);

 }
}

  /*  Coding (Logical and Maintainable):
        We have e DB of employees, which can be represented as an in-memory Map of EmployeeID->Employee Object

        Class Employee {
        String name,
        String org,
        int exp, //Experience in Years
        boolean isManager
        }

        Map<Integer, Employee>
        {
        1: {“Adam”, “Sales”, 5, false},
        2: {“Bob”, “Marketing”, 7, true},
        3: {“Charles”, “Sales”, 2, false},
        4: {“David”, “Sales”, 10, true},
        …
        …
        }

        Write a library/function which returns the IDs of all employees that are in Sales, not managers, with >5 years of experience.
        This is just one use-case, make the library flexible so that it can also serve other use-cases.

        Filter --> EmployeeName
        Filter --> EmployeeOrg
        Filter --> EmployeeExp
        Filter --> EmployeeMgr*/