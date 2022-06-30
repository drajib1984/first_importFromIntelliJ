package Assignments;

import java.util.Date;
import java.util.Scanner;

public class Employee {
    private String name;
    private int employeeID;
    private String dept_name;
    private String hire_date;
    private double hourly_rate;

    public Employee(String name, int employeeID, String dept_name, String hire_date, double hourly_rate) {
        this.name = name;
        this.employeeID = employeeID;
        this.dept_name = dept_name;
        this.hire_date = hire_date;
        this.hourly_rate = hourly_rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getHire_date() {
        return hire_date;
    }

    public void setHire_date(String hire_date) {
        this.hire_date = hire_date;
    }

    public double getHourly_rate() {
        return hourly_rate;
    }

    public void setHourly_rate(double hourly_rate) {
        this.hourly_rate = hourly_rate;
    }

    public double getSalary(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of hours employee worked: ");
        double hours = sc.nextDouble();

        Scanner ab = new Scanner(System.in);
        System.out.println("Enter the hourly rate for employee: ");
        double rate = ab.nextDouble();

        double salary = hours*rate;
        return salary;


    }
}
