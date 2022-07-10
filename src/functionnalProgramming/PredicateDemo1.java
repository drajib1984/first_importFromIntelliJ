package functionnalProgramming;

import java.util.function.Predicate;

public class PredicateDemo1 {
    public static void main(String[] args) {

//EX -1 check if the number is greater than 10 or not
        Predicate<Integer> p = p1->(p1>10);
        System.out.println(p.test(20));
        System.out.println(p.test(5));

// EX -2 check the length of the given string is greater than 4 or not

        Predicate<String> str = i-> (i.length()>4);
        System.out.println(str.test("Rajib"));
        System.out.println(str.test("Ana"));

//EX - 3 print array elements whose size is greater than 4 from array

        String names[]= {"Johny", "Alex","Ana","Rajib","Kevin","Amy"};

        for(String name:names){
            if(str.test(name)){
                System.out.println(name);
            }
        }
    }
}
