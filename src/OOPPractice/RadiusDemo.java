package OOPPractice;

public class RadiusDemo {

    public static void main(String[] args) {
// working with no argument constructor
        RadiusClass rc = new RadiusClass();
        rc.setRadius(5.00);
        System.out.println("The area with no argument constructor is: "+rc.getArea());
        System.out.println("The circumference with no argument constructor is: "+rc.getCircumference());
        System.out.println();
// working with parameterised constructor
        RadiusClass rr = new RadiusClass(7.00);
        System.out.println("The area with parameterised constructor is: "+rr.getArea());
        System.out.println("The circumference with parameterised constructor is: "+rr.getCircumference());

    }

}
