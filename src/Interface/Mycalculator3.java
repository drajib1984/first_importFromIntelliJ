package Interface;

import java.util.Scanner;

public class Mycalculator3 implements Calculator {
    @Override
    public void calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        double input_1 = sc.nextDouble();

        Scanner ab = new Scanner(System.in);
        System.out.println("Enter the 2nd number: ");
        double input_2 = ab.nextDouble();
        double sum = input_2+input_1+2;
        double diff = input_2-input_1-2;

        System.out.println("The sum of the numbers is :"+sum);
        System.out.println("The difference of the numbers is :"+diff);
    }
}
