package Inheritance;

public class Child extends Parent {
    private  int grade;


    public Child(String name, int age, String address, int grade) {
        super(name, age, address);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
//set getter setter
}
