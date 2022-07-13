package FunctionnalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DistinctCountLimitDemo {
    public static void main(String[] args) {
        List<String> veh_list = Arrays.asList("Bus","Car","Bicycle","Bus","Car","Car","Bike");
        List<String> updated_list = new ArrayList<String>();
//distinct elements
        veh_list.stream().distinct().forEach(System.out::println);
        updated_list= veh_list.stream().distinct().collect(Collectors.toList());
        System.out.println(updated_list);
//count elements
        System.out.println(veh_list.stream().count());
        int x = (int) updated_list.stream().count();
        System.out.println(x);
//limit the elements

        veh_list.stream().distinct().limit(3).forEach(System.out::println);

        List<Integer> num_list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//how many even
        System.out.println(num_list.stream().filter(n -> n % 2 == 0).count());
        num_list.stream().filter(i->i%2==0).forEach(System.out::println);
// find the min number
        Optional<Integer> min =num_list.stream().min((a, b)->{return a.compareTo(b);});
        System.out.println(min);
        Optional<Integer> max = num_list.stream().max((c, d) -> {return c.compareTo(d);});
        System.out.println(max);

    }
}
