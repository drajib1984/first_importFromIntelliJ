package Interface;

public class Demo {
    public static void main(String[] args) {
        Calculator c1 = new MyCalculator1();
        c1.calculator();
        Calculator c2 = new MyCalculator2();
        c2.calculator();
        Calculator c3 = new Mycalculator3();
        c3.calculator();
    }

}
