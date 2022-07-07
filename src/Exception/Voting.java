package Exception;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        double input_age = sc.nextDouble();
        try {
            if (input_age < 18) {
                throw new YoungAgeException("You are not eligible for voting");
            } else
                System.out.println("You can vote");
        }
        catch (YoungAgeException ex)
        {
            ex.printStackTrace();
        }
        System.out.println("Heello");

    }




}
