package PackageA;

public class ConstructorDefault {

int i ;
String s;
    public static void main(String[] args) {

       ConstructorDefault  cd = new ConstructorDefault();
        System.out.println(cd.i);
        System.out.println(cd.s);
    }
}
// output is 0 as a default value being initialised, in case of string it would be null