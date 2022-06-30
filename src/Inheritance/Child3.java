package Inheritance;

public class Child3 extends Parent1 {

    public void test3(){
        System.out.println("In child3 class");

    }
    public  void doStudies(){
        System.out.println(" Child3 studies in Grade 1");
    }

    @Override
    public void dinnerMenuPreference() {
        super.dinnerMenuPreference();
        System.out.println("Child3 wants to eat sandwich");
    }

    public Child3() {
    }
}
