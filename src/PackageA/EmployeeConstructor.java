package PackageA;

public class EmployeeConstructor {

    int emp_id;
    String name;

    EmployeeConstructor(int emp_id,String name)
    {
        this.name=name;
        this.emp_id=emp_id;


    }

    public static void main(String[] args) {
        EmployeeConstructor e1 = new EmployeeConstructor(101,"deepak");
        EmployeeConstructor e2 = new EmployeeConstructor(102,"rajib");
        System.out.println("Employee 1: "+e1.name+" "+ e1.emp_id);
        System.out.println("Employee 2: "+e1.name+" "+e2.emp_id);


    }
}
