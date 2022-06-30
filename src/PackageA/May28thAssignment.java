package PackageA;

import java.util.Scanner;

public class May28thAssignment {
    public static void main(String[] args)
// Sum of natural numbers
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int Num = sc.nextInt();
        int i = 0;
        int sum = 0;
        while (Num >= i) {
            sum = sum + i;
            i++;

        }
        System.out.println("The sum of " + Num + " is " + sum);
// Factorial
        int j = 1;
        int factorial = 1;
        while (Num >= j) {
            factorial = factorial * j;
            j++;

        }
        System.out.println("the factorial for " + Num + " is " + factorial);
//Guess game
        int magicNum = 35;
        Scanner cs = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter magic number: ");
            int input_num = cs.nextInt();
            if (input_num == magicNum) {
                System.out.println("You hit jackpot");
                break;
            } else if (input_num > magicNum) {
                System.out.println("Input is greater than magic Number");
            } else {
                System.out.println("Input is lower than magic Number");

            }

        }

        Scanner ab = new Scanner(System.in);
        System.out.println("Input the month number: ");
        int i1 = ab.nextInt();
        switch (i1){

            case 1,3,5,7,8,10,12:
                System.out.println("The month "+ i1+" has 31 days");
                break;
            case 4,6,9,11:
                System.out.println("The month "+ i1+" has 30 days");
                break;
            case 2:
                System.out.println("The month "+ i1+" has 28 days or 29 days(leap year)");
                break;
            default:
                System.out.println("Wrong input");
        }

    }
}



