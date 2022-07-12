package functionnalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class employeeData {
    String name;
    int salary;
    String gender;

    public employeeData(String name, int salary, String gender) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }
}


public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> con = i -> System.out.println(i);
        con.accept("Rajib");
        con.accept("Welcome");


        ArrayList<employeeData> ar= new ArrayList<>();
        ar.add(new employeeData("Rajib",50000,"Male"));
        ar.add(new employeeData("John",30000,"Male"));
        ar.add(new employeeData("Mary",20000,"Female"));
        ar.add(new employeeData("Scott",60000,"Male"));

// Calculate the bonus at 10%
        Function<employeeData,Integer> function = i-> i.salary*10/100;


// Find if the bonus is greater tha 5K

        Predicate<Integer> pr =integer -> integer>=5000;

// List of employees with name, salary, gender

        Consumer<employeeData> consumer = i->{
            System.out.println(i.name);
            System.out.println(i.salary);
            System.out.println(i.gender);
        };

        for(employeeData e:ar){
            int bonus= function.apply(e);

            if(pr.test(bonus)){
                consumer.accept(e);
                System.out.println(e.name+"'s bonus is "+bonus);
            }


        }




    }
    }

