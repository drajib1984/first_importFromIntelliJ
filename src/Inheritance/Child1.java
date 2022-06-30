package Inheritance;

public class Child1 extends Parent1 {

    public void test1(){
        System.out.println("In child1 class");

    }
    public  void doStudies(){
        System.out.println(" Child1 studies in Grade 1");
    }

    @Override
    public void dinnerMenuPreference() {
        super.dinnerMenuPreference();
        System.out.println("Child1 wants to eat burger");
    }

    public Child1() {
    }
}
