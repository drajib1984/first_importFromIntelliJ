package functionnalProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rajib","Robin","Dasbabu","Arijit");
        Consumer<String> cs = f-> System.out.println(f);

        names.forEach(cs);

        //names.forEach(e-> System.out.println(e));

        //names.forEach(System.out::println);

        names.sort((t1,t2)->t1.compareTo(t2));
        names.forEach(s-> System.out.println(s));

        names.sort((t1,t2)->t1.compareTo(t2));
        names.forEach(System.out::println);
        names.sort(String::compareTo);
    }

}



