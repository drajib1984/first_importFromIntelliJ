package FunctionnalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class  Student{
    String name;
    int id;
    char grade;

    public Student(String name, int id, char grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
}



public class FlatMapDemo {
    public static void main(String[] args) {

        List<Student> sc1 = Arrays.asList(
                new Student("Smith",101,'A'),
                new Student("John",102,'B'),
                new Student("Kenedy",103,'C')
        );

        List<Student> sc2 = Arrays.asList(
                new Student("Scott",104,'A'),
                new Student("Mary",105,'B'),
                new Student("Kitty",106,'C')
        );

        List<List<Student>> sc_collection = Arrays.asList(sc1,sc2);
// get all the namees of the student

        sc_collection.stream().flatMap(i->i.stream())
                              .map(i->"The name is "+i.name +" and grade is "+i.grade)
                              .forEach(System.out::println);





        List<Integer> l1 = Arrays.asList(1,2,3,4,5,6);
        System.out.println(l1);
        List<Integer> l2 = Arrays.asList(1,2);
        List<Integer> l3 = Arrays.asList(3,4);
        List<Integer> l4 = Arrays.asList(5,6);

        List<List<Integer>> l5 = Arrays.asList(l2,l3,l4);
        System.out.println(l5);

        List<Integer>final_list=l5.stream().flatMap(i->i.stream()).collect(Collectors.toList());
        System.out.println(final_list);
//now add 10 to each elments & print
        l5.stream().flatMap(x->x.stream()).map(x->x+10).forEach(System.out::println);
        List<Integer> l6= l5.stream().flatMap(x->x.stream()).map(x->x+10).collect(Collectors.toList());
        System.out.println(l6);

        List<String> teamA = Arrays.asList("Scott","David","John");
        List<String> teamB = Arrays.asList("Mary","Luna","Tom");
        List<String> teamC = Arrays.asList("Ken","Jhonny","Kitty");

        List<List<String>> comby_list = Arrays.asList(teamA,teamB,teamC);


        System.out.println(comby_list);
// want to read the names of each & every player of the team
        comby_list.stream().flatMap(i->i.stream()).forEach(System.out::println);

        List<String> read_list = comby_list.stream().flatMap(i->i.stream()).collect(Collectors.toList());
        System.out.println(read_list);
    }
}
