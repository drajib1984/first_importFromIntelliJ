package PackageA;

import java.util.Scanner;

public class LoopClass {

    public static void main(String[] args) {
// initial number          when to end the loop         how to update
        for (int i = 100; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        int total = 0;
        for (int i = 1; i <= 100; i++) {
            total = i + total;
        }
        {
            System.out.println(total);
        }

        int b = 1;
        for (int a = 1; a <= 10; a++) {
            b = b * a;

        }
        {
            System.out.println(b);
        }

        for (int s = 1; s <= 5; s++) {
            for (int t = 1; t <= 5; t++)
            {
                System.out.print(t+" ");
            }
            System.out.println();

        }

        int magicNumber=30;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please input the number: ");
        int i = sc.nextInt();
        while(i!=magicNumber){
            System.out.println("please try again");
            i = sc.nextInt();
        }
    }


}

