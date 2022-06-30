package Assignments;

public class Multiples3and5Assignment6 {

    public static int multiple3and5() {

        int n = 100;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
