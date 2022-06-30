package Assignments;

import java.util.Date;
import java.util.Scanner;

public class Manager extends Employee {
    public Manager(String name, int employeeID, String dept_name, String hire_date, double hourly_rate) {
        super(name, employeeID, dept_name, hire_date, hourly_rate);
    }

    @Override
    public double getSalary() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of hours manager worked: ");
        double hours = sc.nextDouble();

        Scanner ab = new Scanner(System.in);
        System.out.println("Enter the hourly rate for manager: ");
        double rate = ab.nextDouble();

        Scanner bc = new Scanner(System.in);
        System.out.println("Enter the allowances for the manager: ");
        double allowances = bc.nextDouble();

        double salary = hours*rate+allowances;
        return salary;
    }
}

