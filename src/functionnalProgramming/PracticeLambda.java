package functionnalProgramming;

import java.security.PrivilegedAction;

@FunctionalInterface
interface Cab{
    public abstract void bookCab();
}
class  Ola implements Cab{
    @Override
    public void bookCab() {
        System.out.println("Ola booked");
    }
}

interface Cab1{
    public void bookCab1(String source, String destination);
}

class Uber implements Cab1{

    @Override
    public void bookCab1(String source, String destination) {
        System.out.println("Uber booked from "+source+" to "+destination);
    }
}

interface Cab2{
    public abstract String bookCab2(String source1, String destination1);
}

class Myn4 implements Cab2{
    @Override
    public String bookCab2(String source1, String destination1) {
        System.out.println("Myn4 booked from "+source1+" to "+destination1);
        return ("fare is $20");
    }
}


public class PracticeLambda {
    public static void main(String[] args) {
        Cab cc = new Ola();
        cc.bookCab();

        Cab1 ab = new Uber();
        ab.bookCab1("Airport","Home");

        Cab2 bc = new Myn4();
        bc.bookCab2("Home","Airport");

// lambda expression
        Cab c1 = ()-> System.out.println("Ola booked thru lambda expression");
        c1.bookCab();

        Cab1 c2=(source, destination)->System.out.println("Uber booked from "+source+" to "+destination+" thru lambda expression");
        c2.bookCab1("Airport","Home");

        Cab2 c3 =(source1,destination1)->{System.out.println("Myn4 booked from "+source1+" to "+destination1+" thru lambda expression");
            return ("fare is $20");};
        c3.bookCab2("Home","Airport");
    }

    }

