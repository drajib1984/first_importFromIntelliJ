package Assignments;

public class DemoPageAssignment1 {

    public static void main(String[] args) {


//method in class which should return fullname
        PersonAssignment1 p = new PersonAssignment1();
        p.setFirstName("Rajib");
        p.setLastName(" Das");
        System.out.println("The full name is "+p.getFullName());


//constructor to create Person
        PersonAssignment1 p1 = new PersonAssignment1("Amit"," Kulkarni","North York",33);
        System.out.println("Details of the person is"+"\n Name: "+p1.getFullName()+"\n Address is: "+p1.getAddress()+"\n Age is: "+p1.getAge());


//method to change address changeAddress(Sting address)
        System.out.println("The updated address is "+p1.changeAddress());

//method which should return the address of Person getAddress()

        p.setAddress("Scarborough");
        System.out.println("The address of person is "+p.getAddress());

    }
}
