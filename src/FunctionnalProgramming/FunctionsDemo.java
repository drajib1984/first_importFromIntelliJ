package FunctionnalProgramming;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class EmployeeDetails {
    String emp_name;
    int emp_salary;

    public EmployeeDetails(String emp_name, int emp_salary) {
        this.emp_name = emp_name;
        this.emp_salary = emp_salary;
    }
}

public class FunctionsDemo {
    public static void main(String[] args) {
        Function<Integer,Integer> fu = i->i*i;
        System.out.println(fu.apply(4));
        System.out.println(fu.apply(2));
        System.out.println(fu.apply(5));

// Find the string lenghth

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String str1 = "Java";
        Function<String,Integer> str_len = i-> i.length();
        System.out.println(str_len.apply(str));
        System.out.println(str_len.apply(str1));
        System.out.println(str_len.apply("Rajib"));

        ArrayList<EmployeeDetails> al = new ArrayList<>();
        al.add(new EmployeeDetails("rajib",50000));
        al.add(new EmployeeDetails("john",30000));
        al.add(new EmployeeDetails("mary",20000));
        al.add(new EmployeeDetails("Ana",60000));

// Give bonus to employee as less than 20K->10%; 20-30K->15%, 30-50K->20%, above 50K->25%

        Function<EmployeeDetails,Integer> ff = i -> {
            int sal = i.emp_salary;
            int bonus;
            if(sal<=20000){
               return bonus = sal*10/100;
            }
            else if (sal>=20000 && sal<=30000){
                 return bonus = sal*15/100;
            }
            else if (sal>=30000 && sal<=50000) {
                 return bonus = sal*20/100;
            }
            else
                return bonus = sal*25/100;

        };

        for(EmployeeDetails e :al){
            int Bouns=ff.apply(e);
            System.out.println("For employee name "+e.emp_name+ " Salary is Rs."+e.emp_salary+" Bonus is Rs."+ ff.apply(e));
// Print if the bonus is >5K only
            Predicate<Integer> pp = i-> i>5000;
                if(pp.test(Bouns)){
                    System.out.println("For more than 5K bonus,employee name "+e.emp_name+ " Salary is Rs."+e.emp_salary+" Bonus is Rs."+ Bouns);
                }
            }
    }
}
