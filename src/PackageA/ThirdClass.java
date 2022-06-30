package PackageA;

import java.util.Scanner;

//Odd or even
public class ThirdClass {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number : ");
        int i = sc.nextInt();


        int x = 99;
        if (x % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");


        }
// Positive oor negative
        int y = -2;

        if (y > 0) {
            System.out.println("the number is positive");
        } else if (y < 0) {
            System.out.println("The number is negative");

        } else {
            System.out.println("The number is zero");

        }

// Largest of 3 numbers

        int a = 499;
        int b = 499;
        int c = 499;
        if (a > b && a > c) {
            System.out.println("The largest number is a");
        } else if (b > a && b > c) {
            System.out.println("The largest number is b");

        } else if (c > b & c > a) {
            System.out.println("The largest number is c");

        } else {
            System.out.println("All numbers are equal");
        }


    }
}
