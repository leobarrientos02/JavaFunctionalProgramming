package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static imperative.Main.Person.Gender.*;

public class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Leonel", MALE, 24),
                new Person("Jose", MALE, 22),
                new Person("Stephanie", FEMALE, 27),
                new Person("Mynor", MALE, 20),
                new Person("Laura", FEMALE, 25)
        );

        System.out.println("Imperative Approach");
        // Imperative approach
        List<Person> females = new ArrayList<>();
        for(Person person : people){
            if(FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        // Print all females
        for(Person person : females){
            System.out.println(person);
        }

        System.out.println("Declarative Approach");
        // Declarative approach (This means using Streams and Collections)
        people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        private final int age;

        Person(String name, Gender gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        enum Gender{
            MALE, FEMALE
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    ", age=" + age +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person)) return false;
            Person person = (Person) o;
            return age == person.age && Objects.equals(name, person.name) && gender == person.gender;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, gender, age);
        }
    }
}
