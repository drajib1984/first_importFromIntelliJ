package FunctionnalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus","car","bicycle","flight","train");
        List<String> upper_case= new ArrayList<String>();
        List<String> upper_case1= new ArrayList<String>();

//Convert the vehicles list in upper case
     // traditional method
     for(String name:vehicles) {
         System.out.println(name.toUpperCase());
         upper_case.add(name.toUpperCase());
     }
         System.out.println(upper_case);

// using stream
//Convert the vehicles list in upper case
         upper_case1=vehicles.stream().map(i->i.toUpperCase()).collect(Collectors.toList());
        System.out.println(upper_case1);
        vehicles.stream().map(i->i.toUpperCase()).forEach(i-> System.out.println(i));
// Find the length of each of items in string

        vehicles.stream().map(i->i.length()).forEach(i-> System.out.println(i));

        for(String x:vehicles){
            System.out.println(x.length());
        }

        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,88,9);
        List<Integer> multiplied = new ArrayList<Integer>();
// for every eleements in the coollection and multiply by 3 and store in a new list
//traditional methods
        for(int x:num){
            System.out.println(x*3);
        }
//using streams

        multiplied = num.stream().map(i->i*3).collect(Collectors.toList());
        System.out.println(multiplied);

        num.stream().map(i->i*3).forEach(System.out::println);
    }
}
