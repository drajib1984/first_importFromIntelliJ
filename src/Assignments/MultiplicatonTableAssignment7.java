package Assignments;

import java.util.Scanner;

public class MultiplicatonTableAssignment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to create the multiplication table: ");
        int input_num = sc.nextInt();
        int product = 1;
        for(int i=1; i<=20;i++){
            product = input_num*i;
            System.out.println(input_num+" X "+i+" = "+product);
        }
    }
}
