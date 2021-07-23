package day4;

import day3.Person;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class HashCodeEqualsDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Adam", 87, LocalDate.of(200,10,10));
        Person p2 = new Person("Adam", 87, LocalDate.of(200,10,10));
        System.out.println("Equals: czy identyczne? " + p1.equals(p2));
        Set<Person> people = new HashSet<>();
        people.add(p1);
        people.add(p2);
        System.out.println(people);
    }
}
