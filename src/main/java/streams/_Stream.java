package streams;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static  streams._Stream.Person.Gender.*;

public class _Stream {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Leonel", MALE, 24),
                new Person("Jose", MALE, 22),
                new Person("Stephanie", FEMALE, 27),
                new Person("Mynor", MALE, 20),
                new Person("Laura", FEMALE, 25)
        );

        // Prints name's length
        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        // Print all genders
        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        boolean containsOnlyFemales = people.stream()
                .allMatch(person -> FEMALE.equals(person.gender));

        System.out.println(containsOnlyFemales);
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
