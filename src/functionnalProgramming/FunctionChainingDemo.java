package functionnalProgramming;

import java.util.function.Function;

public class FunctionChainingDemo {
    public static void main(String[] args) {
        Function<Integer,Integer> f1 = integer -> integer*2;
        Function<Integer,Integer> f2 = integer -> integer*integer*integer;

        System.out.println(f1.andThen(f2).apply(5)); // first applied in f1 and then moving to f2

        System.out.println(f1.compose(f2).apply(2)); // first applied in f2, after composing f2, we then move to f1
    }
}
