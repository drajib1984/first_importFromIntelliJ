
//Write a simple class Person, it should have following variables
//* firstName
//* lastName
//* adreess
//* age
//write method in class which should return fullname , call it getFullName()
//write a constructor to create Person
//write a method to change address changeAddress(Sting address);
//write a method which should return the address of Person getAddress();

package Assignments;

import java.util.Scanner;

public class PersonAssignment1 {

    private String firstName;
    private String lastName;
    private String address;
    private int age;
    private String fullName;
// default constructor
    public PersonAssignment1() {

    }

// parameterised constructor


    public PersonAssignment1(String firstName, String lastName, String address, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
    }



    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }



    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName = firstName+lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String changeAddress(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the new address: ");
        String next = sc.next();
        address= next;
        return next;
    }

    public int getAge() {
        return age;
    }


}
