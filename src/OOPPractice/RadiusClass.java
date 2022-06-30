package OOPPractice;

public class RadiusClass {
    private double radius;
    private static final double pi = Math.PI;
    private double circumference;
    private double area;

// no argument constructor
    public RadiusClass() {
    }
// parameterised constructor
    public RadiusClass(double radius) {
        this.radius = radius;

    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        circumference=2*pi*radius;
        return circumference;
    }

    public double getArea() {
        area=pi*radius*radius;
        return area;
    }





}
