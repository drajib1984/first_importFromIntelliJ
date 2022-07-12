package FunctionnalProgramming;

import java.util.function.Consumer;

public class ConsumerChaining {
    public static void main(String[] args) {
        Consumer<String> c1 = i-> System.out.println(i+" "+"is white");
        Consumer<String> c2 = i-> System.out.println(i+" "+"is having four legs");
        Consumer<String> c3 = i-> System.out.println(i+" "+"is eating grass");

        c1.accept("cow");
        c2.accept("cow");
        c3.accept("cow");

        c1.andThen(c2).andThen(c3).accept("Goat");

        Consumer<String> c4 = c1.andThen(c2).andThen(c3);
        c4.accept("Giraffe");
    }
}
