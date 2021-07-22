package day3;

import day1.model.Person;

import java.time.LocalDate;

public class GenericBoxDemo {
    public static void main(String[] args) {
        GenericBox<String> boxString = new GenericBox<>(10, "AAAAA");
        GenericBox<Person> personBox = new GenericBox<>(20, new Person(
                "DD","EE", LocalDate.of(2000,10,10)
        ));
        System.out.println("Zawartość: " + boxString.getContent());
        System.out.println("Czyścimy pudełko! ");
        boxString.clear();
        System.out.println("Czy coś jest w pudełku: " + boxString.isPresent());
    }
}
