package OOPPractice;

public class MainDemo {

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Jacky");
        p.setBankPass(4321);
        p.setSalary(5000);
        p.setAge(30);
        System.out.println(p.getAge()+" "+p.getSalary()+" "+p.getName()+" "+p.getBankPass());;


        Person p1= new Person(10000,"rajib",34,1234);
        System.out.println(p1.getAge()+" "+p1.getSalary()+" "+p1.getName()+" "+p1.getBankPass());;






    }
}
