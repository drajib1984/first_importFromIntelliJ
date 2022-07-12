package FunctionnalProgramming;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
    public String name;
    public int salary;
    public int experience;

    public Employee(String name, int salary, int experience) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }
}

class demo{
    public static void main(String[] args) {
        Employee ee = new Employee("John",20000,6);

// Return name using predicate if salary >30K & experience more than 2 yrs

        Predicate<Employee> pr= e->(e.salary>30000 && e.experience>2);
        System.out.println(pr.test(ee));

// Store multiple employee data in arraylist & find out which employees have salary >30K & experience more than 2 yrs
        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee("john",50000,5));
        al.add(new Employee("david",20000,2));
        al.add(new Employee("Scott",30000,3));
        al.add(new Employee("Mary",40000,4));

        Predicate<Employee> pl = i->(i.salary>30000 && i.experience>2);
        for(Employee emp:al){
            if(pl.test(emp)){
                System.out.println(emp.salary+" "+emp.experience+" "+emp.name);
            }


        }


    }

}


public class PredicateDemo2 {
    public static void main(String[] args) {
//Predicate to check the number is even
        Predicate<Integer> p1 = e-> (e%2==0);
        System.out.println(p1.test(20));

// Predicate to check the number is greater than 50
        Predicate<Integer> p2= e-> (e>50);
        System.out.println(p2.test(49));
//EX 1 from the array list, find the numbers that are even and greater than 50
        int a[]={5,10,15,20,25,30,35,40,45,50,55,60,65,70};

        for(int n:a){
            if(p1.test(n) && p2.test(n)){
                System.out.println(n);
            }
            if(p1.and(p2).test(n)){
                System.out.println(n);
            }

        }
//EX 2 from the array list, find the numbers that are even and greater than 50
        int az[]={5,10,15,20,25,30,35,40,45,50,55,60,65,70};
        for(int x:az){
            if(p1.or(p2).test(x)){
                System.out.println(x);
            }
        }
//EX 2 from the array list, find the numbers that are odd using the predicatee to find even

        int cx[]={5,10,15,20,25,30,35,40,45,50,55,60,65,70};
        for(int c:cx){
            if(p1.negate().test(c)){
                System.out.println(c);
            }

        }

        for(int c:cx){
            if(p2.negate().test(c)){
                System.out.println(c);
            }
        }
    }

}
