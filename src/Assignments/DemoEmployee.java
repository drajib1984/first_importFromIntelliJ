package Assignments;

import java.util.Date;

public class DemoEmployee {
    public static void main(String[] args) {
       Employee e = new Employee("rajib",101,"sales","15-01-1999",20);
        System.out.println("The employee name is "+e.getName()+"\n Employee ID is "+e.getEmployeeID()+
                "\n Dept name is: "+e.getDept_name());
        System.out.println("The monthly employee salary is: "+e.getSalary());

    }
}
