package FunctionnalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterDemo1 {
    public static void main(String[] args) {

        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(8);
        ar.add(15);
        ar.add(18);
        ar.add(25);
        ar.add(32);
        ar.add(35);
        ar.add(44);

// Another way to store object in array list.
        List<Integer> ar1 = Arrays.asList(10,15,20,25,30,23,75);
        ArrayList<Integer> even_list= new ArrayList<Integer>();
        ArrayList<Integer> even_list1= new ArrayList<Integer>();

// Ex-1 fnd the even numbers in arraylist

        // traditional method with for loop

        for(int a:ar){
            if(a%2==0) {
                even_list.add(a);
                System.out.println(even_list);
            }
        }

        // with streams

        even_list1= (ArrayList<Integer>) ar.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(even_list1);

        ar1.stream().filter(n->n%2==0).forEach(n-> System.out.println(n));

        ar.stream().filter(n->n%2==0).forEach(System.out::println);


        List<String> names = Arrays.asList("Melisandre","Sansa","John","Jeffry","Daniryes");
        System.out.println(names);

// Find the names having more than 6 letter & less than 9
        List<String> filtered_names = names.stream().filter(n -> n.length() >= 6 && n.length() <= 9).collect(Collectors.toList());
        System.out.println(filtered_names);

        names.stream().filter(n->n.length()>=6 && n.length()<=9).forEach(n-> System.out.println(n));


        List<String> Null_names = Arrays.asList("cup",null,"forest",null,"sky","book",null,"theatre");

        List<String> noNull_names= new ArrayList<String>();

        noNull_names=Null_names.stream().filter(n->n!=null).collect(Collectors.toList());
        System.out.println(noNull_names);

        Null_names.stream().filter(n->n!=null).forEach(n-> System.out.println(n));







    }

}



