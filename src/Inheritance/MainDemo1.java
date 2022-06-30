package Inheritance;

public class MainDemo1 {

    public static void main(String[] args) {

        Parent1 obj = new Parent1(); // tight coupling
        obj.dinnerMenuPreference();
        Child1 obj1 = new Child1();  // tight coupling
        obj1.dinnerMenuPreference();
        Parent1 obj2 = new Child1(); //loose coupling
        obj2.dinnerMenuPreference();
        Parent1 obj3 = new Parent1();
        obj3.handleBusiness();    //compile time polymorphism
        obj3.handleBusiness(4);  //compile time polymorphism

        Parent1 obj4 = new Child1(); // runtime polymorphism for ---> overridden methods only with loose coupling, MAGIC goes to child class
        obj4.dinnerMenuPreference();
        ((Child1)obj4).doStudies();  // type casting for finding non-overridden methods in child class
        ((Child1)obj4).test1();     // type casting for finding non-overridden methods in child class



    }


}
