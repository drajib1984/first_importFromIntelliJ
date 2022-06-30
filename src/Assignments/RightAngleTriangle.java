package Assignments;

import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of rows: ");
        int rows = sc.nextInt();
        for(int i =1;i<=rows;i++){
            System.out.println();
            for(int j =1; j<=i;j++){
                System.out.print(" "+j);
            }
        }
    }
}
