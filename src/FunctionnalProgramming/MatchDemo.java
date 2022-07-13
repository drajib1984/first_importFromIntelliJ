package FunctionnalProgramming;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatchDemo {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<String>();
        fruits.add("One apple");
        fruits.add("One mango");
        fruits.add("Two apples");
        fruits.add("More grapes");
        fruits.add("Two guavas");
        System.out.println(fruits);

        Set<String> fruits1 = new HashSet<String>();
        fruits1.add("Two guavas");

//Find out if one exists in the set list

        System.out.println(fruits.stream().anyMatch(i -> i.contains("One")));
        System.out.println(fruits.stream().anyMatch(i -> {return i.startsWith("One");}));
        System.out.println(fruits.stream().anyMatch(i -> i.startsWith("one")));

// Find out if "Two guavas" exists or not
        System.out.println(fruits.stream().allMatch(i -> i.contains("Two guavas")));
        System.out.println(fruits1.stream().allMatch(i -> i.contains("Two guavas")));
        System.out.println(fruits1.stream().allMatch(i -> i.equals("Two guavas")));

//noneMatch
        System.out.println(fruits.stream().noneMatch(i -> i.startsWith("One")));

//find any

        List<String> lst2= Arrays.asList("one","two","three","four","five");
        List<String> lst3= Arrays.asList();
        Optional<String> optionalS = lst2.stream().findAny();
        System.out.println(optionalS);
        System.out.println(optionalS.get());
//find first
        Optional<String> first = lst2.stream().findFirst();
        System.out.println(first.get());

//concatenating string

        List<String>animal_list= Arrays.asList("Dog","Cat","Elephant");
        List<String>bird_list= Arrays.asList("Peacock","Parrot","Crow");

        Stream<String> stream1 = animal_list.stream();
        Stream<String> stream2 = bird_list.stream();

        List<String> combo_stream = Stream.concat(stream1,stream2).collect(Collectors.toList());
         System.out.println(combo_stream);


        for(String item:combo_stream){
            System.out.println(item);

        }

    }
}
