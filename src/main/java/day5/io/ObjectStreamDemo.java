package day5.io;

import day3.Person;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Adam", 67, LocalDate.of(2000, 10, 10)));
        people.add(new Person("Ewa", 55, LocalDate.of(1999, 4, 15)));
        PeopleFileRepository repository = new PeopleFileRepository(people, "c:\\data\\people.ser");
        List<Person> personList = repository.load();
        System.out.println(personList);
    }
}
