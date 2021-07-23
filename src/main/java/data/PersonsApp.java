package data;

import day3.Person;

import java.util.List;

public class PersonsApp {
    public static void main(String[] args) {
        PersonGenerator generator = new PersonGenerator();
        List<Person> people = generator.generate(100_000);
        people.stream().limit(100).forEach(System.out::println);
    }
}
