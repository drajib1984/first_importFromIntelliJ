package PackageA;

import java.util.Scanner;

public class SwitchPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the day: ");
        String s = sc.nextLine();
        switch (s) {
            case "Sunday": System.out.println("It is Sunday");
            break;
            case "Monday": System.out.println("It is Monday");
            break;
            case "Tuesday": System.out.println("It is Tuesday");
            break;
            case "Wednesday": System.out.println("It is Wednesday");
            break;
            case "Thursday": System.out.println("It is Thursday");
            break;
            case "Friday": System.out.println("It is Friday");
            break;
            case "Saturday": System.out.println("It is Saturday");
            break;
            default: System.out.println("Wrong entry");


        }


        Scanner scanner;


    }
}
