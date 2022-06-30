package Assignments;

import java.security.PublicKey;
import java.util.Date;

public class EmployeeAssignment14 {
    private String name;
    private int employeeID;
    private String dept_name;
    private Date hire_date;
    private double hourly_rate;

    public EmployeeAssignment14(String name, int employeeID, String dept_name, Date hire_date, double hourly_rate) {
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

    public Date getHire_date() {
        return hire_date;
    }

    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    }

    public double getHourly_rate() {
        return hourly_rate;
    }

    public void setHourly_rate(double hourly_rate) {
        this.hourly_rate = hourly_rate;
    }
}
