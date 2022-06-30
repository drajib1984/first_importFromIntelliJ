package OOPPractice;

public class Person {





    private long salary;


    private String name;
    int age;
    private  int bankPass;

    public Person() {
        System.out.println("I am default constructor");
        System.out.println(salary+" "+name+" "+age+" "+ bankPass);
    }

    public Person(long salary, String name, int age, int bankPass) {
        System.out.println("I am parameterised constructor");
        this.salary = salary;
        this.name = name;
        this.age = age;
        this.bankPass = bankPass;
    }

    public void displaySalary()
    {
        System.out.println(salary);

    }
    public void displayAge(){
        System.out.println(age);
    }
    public void displayName(){
        System.out.println(name);

    }


    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBankPass() {
        return bankPass;
    }

    public void setBankPass(int bankPass) {

        this.bankPass = bankPass;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}








