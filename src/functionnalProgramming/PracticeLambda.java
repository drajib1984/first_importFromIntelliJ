package functionnalProgramming;

public class PracticeLambda {
    public static void main(String[] args) {
        Thread th = new Thread(() ->System.out.println("in another thread"));
        th.start();
        System.out.println("In main");
        System.out.println(" new line");
    }
}
