package Inheritance;

public class Child2 extends Parent1 {

    public void test2(){
        System.out.println("In child2 class");

    }
    public  void doStudies(){
        System.out.println(" Child2 studies in Grade 2");
    }

    @Override
    public void dinnerMenuPreference() {
        super.dinnerMenuPreference();
        System.out.println("Child2 wants to eat ham");
    }

    public Child2() {
    }
}
