package ThinkJava;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class VariablesAndOpearators {
    public static void main(String[] args) {

//        System.out.println("Hello !! Java");
//        System.out.println("How are you?");
//        System.out.print("Goodbye ");
//        System.out.println("Cruel World!!");
//        System.out.println("My name is Rajib.\nI stay in Canada.\tJust love it.\n\tI have a dog named \"Snoopy\" with me");


//        int a = 5;
//        int b = a;
//        System.out.println(b);
//        System.out.println(a);
//        a = 100;
//        System.out.println(a);
//        System.out.println(b);
//
//        String firstName = "Hello Again";
//        System.out.println(firstName);
//        System.out.print("The firstname is ");
//        System.out.println(firstName);
//
//        int hour = 11;
//        int min = 59;
//        System.out.print("The current time is ");
//        System.out.print(hour);
//        System.out.print(":");
//        System.out.println(min);
//        System.out.println("Have a great day!!");
//        System.out.print("The number of minutes since midnight is ");
//        System.out.println(hour*60+min);
//        System.out.print("The fraction of the 12th hour passed: ");
//        System.out.println(min/60);
//        System.out.print("The %age of 12th hour that has passed: ");
//        System.out.println(min*100/60);
//        double minutes = 59.00;
//        System.out.print("The fraction of 12th hour passed: ");
//        System.out.println(minutes/60);
//        System.out.print("the percentage of 12th hour passed: ");
//        System.out.println(minutes*100/60);
//        System.out.println(1+2+" "+"hello"); //Java executes these operations from left to right.
//        System.out.println("hello"+1+2); //Java executes these operations from left to right.
//        System.out.println(4/2+2); //But for numeric operators, Java follows mathematical conventions.
//
//
//        String c;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("say something: ");
//        c=sc.nextLine();
//        System.out.println("you said "+ c);
//        System.out.println("say something else: ");
//        c=sc.nextLine();
//        System.out.println("you also said "+c);
//
//
//        double inch;
//        double cm;
//        double feet;
//        Scanner d = new Scanner(System.in);
//        System.out.println("Enter the height in centimeters: ");
//        inch=d.nextInt();
//        double cmPerInch=2.54;
//        cm=inch*cmPerInch;
//        System.out.println("The height in centimeters is: "+cm);
//
//        double pi = 3.14;
//        int x = (int) pi;
//        System.out.println(x);
//        double temp  = x;
//        System.out.println(temp);


//When you read a String followed by an int, everything works just fine. But when you read an int followed by a String,
// you need to realize that Scanner doesn't see input as multiple lines as we do. Instead, it gets a stream of character
//When you run nextInt, it reads characters until it gets to a non-digit.
//        int age;
//        String name;
//        Scanner cd = new Scanner(System.in);
//        System.out.println("Enter your age: ");
//        age = cd.nextInt();
//        cd.nextLine();
//        System.out.println("Enter your name: ");
//        name=cd.nextLine();
//        System.out.println("hello "+name+". Your age is "+age);

//        double celsius;
//        double fahrenheit;
//        Scanner aa = new Scanner(System.in);
//        System.out.println("Enter the temperature in Celsius: ");
//        celsius=aa.nextInt();
//        fahrenheit=celsius*9/5+32;
//        System.out.println("The temperature is Fahrenheit is "+ fahrenheit);

//        int hour;
//        int min;
//        int sec;
//        int input;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the seconds to calculate hour, minutes and seconds: ");
//        input=sc.nextInt();
//        hour=input/3600;
//        min=(input%3600)/60;
//        sec=input%60;
//        System.out.println("the time is "+hour+" hours "+ min+" minutes "+sec+" seconds");


//        int guessedNumber=35;
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("Enter the magic number: ");
//            int input=sc.nextInt();
//            if(input==guessedNumber) {
//                System.out.println("You hit Jackpot");
//                break;
//            }
//            else if(input<guessedNumber) {
//                System.out.println("your input is less than magic number by "+(guessedNumber-input));
//                }
//            else {
//                System.out.println("your input is greater than magic number by "+(input-guessedNumber));
//
//            }
//
//            }


//       Random random = new Random();
//       int x = random.nextInt();
//       System.out.println(x);
//
//       System.out.println("First Line");
//       System.out.println();
//       System.out.println("Next Line");

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a value: ");
//        int x = sc.nextInt();
//        if (x > 0) {
//            System.out.println(x + " is positive number");
//        } else if (x < 0) {
//            System.out.println(x + " is a negative number");
//        } else {
//            System.out.println(x + " is neither positive nor negative");
////        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Enter the name of fruit or vegetable: ");
//        String x = sc.nextLine();
//        switch (x) {
//
//            case "apple", "banana", "cherry":
//                System.out.println("Its a fruit");
//                break;
//            case "asparagus", "broccoli", "carrot":
//                System.out.println("Its a veggy");
//                break;
//            default:
//                System.out.println("wrong input");


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int x = sc.nextInt();
//        while (x > 1) {
//            x = x - 1;
//            System.out.println(x);
//
//        }
//        System.out.println("Blast off");

//        int x;
//        for (x=10;x>=1;x--){
//           System.out.println(x);
//
//        }
//        System.out.println("Blast off!!");

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int x = sc.nextInt();
//        while (x<=8) {
//            x=x+2;
//            System.out.print(x+", ");
//
//        }
//        System.out.println("Do you like it?");


//        int x;
//        for(x=2;x<=20;x+=2){
//            System.out.print(x+" ,");
//
//        }
//        System.out.println("did you like it?");
//        System.out.println("the value of x is now "+x);

        for(int x=1;x<=10;x++){
            for(int y=1; y<=10;y++){
                System.out.print(x*y+" ");
            }
            System.out.println();


        }






    }



}




















