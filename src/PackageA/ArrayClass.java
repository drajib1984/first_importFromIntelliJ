package PackageA;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClass {
    public static void main(String[] args) {


        //Total & average of 5 subjects
//        Scanner sc = new Scanner(System.in);
//        double[] arr = new double[5];
//        double total = 0;
//        double avg = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Input mark: ");
//            arr[i] = sc.nextDouble();
//            total = total + arr[i];
//            avg = total / arr.length;
//
//        }
//        System.out.println("The total is " + total);
//        System.out.println("The average is " + avg);
//        arr = null;


// Array holding 10 decimal values & calculate the sum

//        Scanner a = new Scanner(System.in);
//        double b[] = new double[10];
//        double sum = 0;
//        for (int i = 0; i < b.length; i++) {
//            System.out.println("Enter the numbers: ");
//            b[i] = a.nextDouble();
//            sum = sum + b[i];
//        }
//        System.out.println("The sum of entered numbers is " + sum);

// Store the name in char

//        char[] name = new char[]{'R', 'A', 'J', 'I', 'B'};
//
//        for (int i = 0; i < name.length; i++) {
//            System.out.print(name[i]);
//        }

// Multiplication table

//        Scanner c = new Scanner(System.in);
//        System.out.println("Enter the number to produce multiplication table: ");
//        int z = c.nextInt();
//        int result = 1;
//        for (int i = 1; i <= 10; i++) {
//            result = z * i;
//            System.out.println(z + " X " + i + " = " + result);
////
//
//        }

        int [] employee_id = new int[5];
        employee_id[0]= 1001;
        employee_id[1]= 1002;
        employee_id[2]= 1003;
        employee_id[4]= 1005;
        System.out.println(employee_id);
        for(int i =0; i< employee_id.length;i++){
            System.out.println(employee_id[i]);
        }
        int[] emp_salary = {100, 200, 300};


//1 D array
        String[] employee_name = {"faak", "dgssfwf", "wrwgfwf"};
        for(int i = 0; i< employee_name.length;i++){
            System.out.println(employee_name[i]);

        }
// 2D arrayy
        int[][] zz =new int[][] {{10,20,30,40},{50,60},{70,80,90}};
        System.out.println(zz);
        System.out.println(zz[0]);
        System.out.println(zz[2][2]);
        for(int i=0;i< zz.length;i++){
            for(int j =0; j< zz[i].length;j++){
                System.out.print(zz[i][j]+" ");
            }
            System.out.println();

        }
// 3D array
        int[][][] gh =new int[][][] {{{10, 20},{30, 40, 50, 60},{70, 80, 90}}};
        for(int i =0;i< gh.length;i++){
            for(int j =0;j<gh[i].length;j++){
                for(int k =0;k<gh[i][j].length;k++){
                    System.out.print(gh[i][j][k]+" ");
                }
                System.out.println();

            }

        }



    }
}





























