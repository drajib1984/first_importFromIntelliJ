package PackageA;

public class ConstructorParametrized {

    ConstructorParametrized(int a, String s)
    {
        System.out.println("This is parameterized constructor");

    }

    public static void main(String[] args) {
        ConstructorParametrized cp = new ConstructorParametrized(100, "rajib");
    }
}
