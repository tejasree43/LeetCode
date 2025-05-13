package Basics.immutable;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public final class Employee {
    private final String name;

    private final Date dob;

    //private final String Street;


    private final Set<String> skills;

    public Employee(String name, Date dob, Set<String> skills) {
        this.name = name;
        this.dob = dob;
        this.skills = skills;
    }
    public Date getDob() {

        return new Date(dob.getTime());

    }
    public Set<String> getSkills() {

        return new HashSet<>(skills);
    }
    public String getName() {
        return name;
    }

    public static void main(String[] args) throws ParseException {

        HashSet<String> hs=new HashSet<>();
        hs.add("Spring");
        hs.add("Hibernate");

        String dobDate="16/04/1990";
        Employee employee=new Employee("teju",StringUtil.stringToDate(dobDate),hs) ;
        System.out.println("employee name"+employee.getName());
        System.out.println("employee dob"+employee.getDob());
        System.out.println("employee skills"+employee.getSkills());

        employee.getSkills().add("JPA");
        System.out.println("employee skills after set"+employee.getSkills());


    }

}
