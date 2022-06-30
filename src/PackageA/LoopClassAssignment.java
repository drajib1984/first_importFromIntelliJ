package PackageA;


import java.util.Scanner;

public class LoopClassAssignment {

    public static void main(String[] args) {
// sum of natural numbers
        int total =0;
        int i = 1;
        for (i = 1; i <=10; i++){
            total=total+i;
        }
        {
            System.out.println(total);
        }

// factorial of a number
        int product =1;
        int j = 10;
        for(j=10;j>=1;j--) {
            product = product * j;}
            {
                System.out.println(product);
            }
// Fibonacci series 0 1 1 2 3 5 8 13 21

        int k= 0;
        int l =1;
        int m = 50;
        int next;
        for(k=0;k<=m;k++){

            System.out.print(k+" ");
            next=k+l;
            k=l;
            l=next;


        }

        Scanner sc = new Scanner(System.in);
        int rows;
        int columns;
        String symbol;
        System.out.println("Enter the number of rows: ");
        rows= sc.nextInt();
        System.out.println("Enter the number of columns: ");
        columns=sc.nextInt();
        System.out.println("Enter the symbol you want to use: ");
        symbol=sc.next();
        for (i=1; i<= rows;i++){
            System.out.println();
            for (j=1; j<=columns;j++){
                System.out.print(symbol);


            }


        }


    }


}
