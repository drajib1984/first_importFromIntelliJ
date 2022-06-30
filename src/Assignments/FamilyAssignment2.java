//Write a simple class Family, it should have following variables
//* FatherName, MotherName, SonName, DaughterName
//* FatherSalary, MotherSalary, SonFee, DaughterFee
//* Grocery (hard coded value – 500)
//Write a constructor to create Family
//Write a method just to display all family members name, call it displayNames()
//Write method in class which should return total salary, call it getTotalSalary()
//Write method in class which should return total fees, call it getTotalFee()
//Write a method which should return the total savings after removing all expenses getSavings();
//Write a method using if else which should check if savings are > 1000, it should display the
//message “Congratulation!! FatherName you saved this much = savings value”
//Else “Dear FatherName!! Please try to save for next month”.

package Assignments;

import java.util.Scanner;

public class FamilyAssignment2 {
    private String fatherName;
    private String motherName;
    private String sonName;
    private String daughterName;
    private int fatherSalary;
    private int motherSalary;
    private int sonFees;
    private int daughterFees;
    private int grocery;
    private int totalSalary;
    private int totalFees;
    private int savings;

    public FamilyAssignment2(String fatherName, String motherName, String sonName, String daughterName,
                             int fatherSalary, int motherSalary, int sonFees, int daughterFees, int grocery) {
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.sonName = sonName;
        this.daughterName = daughterName;
        this.fatherSalary = fatherSalary;
        this.motherSalary = motherSalary;
        this.sonFees = sonFees;
        this.daughterFees = daughterFees;
        this.grocery = grocery;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getSonName() {
        return sonName;
    }

    public void setSonName(String sonName) {
        this.sonName = sonName;
    }

    public String getDaughterName() {
        return daughterName;
    }

    public void setDaughterName(String daughterName) {
        this.daughterName = daughterName;
    }

    public int getFatherSalary() {
        return fatherSalary;
    }

    public void setFatherSalary(int fatherSalary) {
        this.fatherSalary = fatherSalary;
    }

    public int getMotherSalary() {
        return motherSalary;
    }

    public void setMotherSalary(int motherSalary) {
        this.motherSalary = motherSalary;
    }

    public int getSonFees() {
        return sonFees;
    }

    public void setSonFees(int sonFees) {
        this.sonFees = sonFees;
    }

    public int getDaughterFees() {
        return daughterFees;
    }

    public void setDaughterFees(int daughterFees) {
        this.daughterFees = daughterFees;
    }

    public int getGrocery() {
        return grocery;
    }

    public void setGrocery(int grocery) {
        this.grocery = grocery;
    }

    public String displayNames() {

        String allNames = getFatherName() + ", " + getMotherName() + ", " + getSonName() + ", " + getDaughterName();
        return allNames;
    }

    public int getTotalSalary() {
        totalSalary = fatherSalary + motherSalary;
        return totalSalary;

    }

    public int getTotalFees(){
        totalFees= sonFees+daughterFees;
        return totalFees;
    }

    public int getSavings(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total of all expenses for the month: ");
        int expenses = sc.nextInt();
        savings = fatherSalary+motherSalary-expenses;
        if(savings>=1000){
            System.out.println("Congratulations "+getFatherName()+" & "+getMotherName()+" you saved this much: "+savings);
        }
        else System.out.println("Dear "+getFatherName()+" & "+getMotherName()+" Please try to save for next month");
        return savings;


        }



}
