package Assignments;

import java.util.Scanner;

public class BMIAssignment3 {
    private double height;
    private double weight;
    private double BMI;

    public BMIAssignment3() {

    }


    public void setHeight() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height in meters: ");
        double input_height = sc.nextDouble();
        this.height = input_height;
    }

    public void setWeight() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight in kgs: ");
        double input_weight = sc.nextDouble();
        this.weight = input_weight;
    }

    public double getBMI() {
        BMI = weight/(height*height);
        return BMI;
    }
}
