package Assignments;

import java.util.Scanner;

public class ReverseRightAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows= sc.nextInt();
        for(int i = rows;i>=1;i--){
            System.out.println();
            for(int j = i;j>=1;j--){
                System.out.print(" "+j);
            }
        }
    }
}
