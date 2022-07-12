package FunctionnalProgramming;

import java.util.List;
import java.util.stream.Collectors;

import static FunctionnalProgramming.ListMakingPractice.Gender.FEMALE;

public class ListMakingPractice {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John",Gender.MALE),
                new Person("Alice", FEMALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("David",Gender.MALE)
        );
        people.stream().filter(person -> FEMALE.equals(person))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }




    public static class Person{
        private String name;
        private Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }



    enum Gender{
        MALE,FEMALE
    }
}


