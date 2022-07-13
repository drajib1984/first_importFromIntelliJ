package FunctionnalProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedDemo {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(6,3,7,1,8,11,9,2);
        System.out.println(lst);
        List<String> lst1= Arrays.asList("john","mary","kim","david","smith");
//sort in ascending order
        lst.stream().sorted().forEach(System.out::println);
        lst1.stream().sorted().forEach(System.out::println);
        List<Integer> sorted_lst = lst.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted_lst);
        List<String> sorted_lst1=lst1.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted_lst1);
//sort in reverse order
        lst.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        lst1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        List<Integer> rev_order = lst.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(rev_order);
        List<String> rev_order1= lst1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(rev_order1);
    }
}
