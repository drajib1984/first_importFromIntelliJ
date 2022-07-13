package FunctionnalProgramming;

import java.util.Arrays;
import java.util.List;

class employeeDataDemo {
    int emp_id;
    String emp_name;
    int salary;

    public employeeDataDemo(int emp_id, String emp_name, int salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.salary = salary;
    }
}
public class MapDemo2 {
    public static void main(String[] args) {

        List<employeeDataDemo> ee = Arrays.asList(
                new employeeDataDemo(101,"Alex",10000),
                new employeeDataDemo(102,"Brian",20000),
                new employeeDataDemo(103,"Charles",30000),
                new employeeDataDemo(104,"David",40000),
                new employeeDataDemo(105,"Edward",50000)
        );


        ee.stream().filter(i-> i.salary>=20000).map(i->i.emp_name+" "+i.emp_id).forEach(System.out::println);

    }
}
