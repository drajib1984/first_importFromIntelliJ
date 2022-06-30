package PackageA;

public class SecondClass {

    public static void main(String[] args) {
        System.out.println("I love Java");
        System.out.println("I love love Java");
        System.out.println("I love love love Java");

        int result=SecondClass.doubleMe(3);
        System.out.println(result);

        String greet=SecondClass.greetings();
        System.out.println(greet);

        String cup=SecondClass.makeTea();
        System.out.println(cup);

        int result1 = SecondClass.sum((short) 3, (short) 4);
        System.out.println(result1);

        int result2= SecondClass.sum(6,5);
        System.out.println(result2);


        long num=242472424249l;
        short num1=3422;
        byte num3=123;
        int num4=342422422;




        long big=4242424353534646l;
        int small= (int)(big);
        System.out.println(small);

        int e= 45;
        float f = 5.5f;
        float result3=(float) (e+f);
        System.out.println(result3);

        int g = 45;
        float h = 5.5f;
        String i = "Hello";
        String result4 = (String)(g+h+i);
        System.out.println(result4);

        int j = 10;
        int l = ++j;
        int k=l+1;

        System.out.println(j);
        System.out.println(k);
        System.out.println(l);

        int m = 10;
        int o = m++;
        int n =o+1;
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);



    }

    public static String makeTea() {
        System.out.println("Ok, preparing taa for you");
        return "Please take the cup of tea";

    }

    public static int doubleMe (int x) {
        return 2*x;


    }

    public static String greetings() {
        System.out.println("Good Morning");

        return "Good Morning Rajib";
    }

    public static int sum(short a,short b ) {

        short result1 =(short)(a+b);
        return result1;
    }

    public static int sum(int c, int d) {
        int result2=(int)(c+d);
        return result2;

    }


    }

