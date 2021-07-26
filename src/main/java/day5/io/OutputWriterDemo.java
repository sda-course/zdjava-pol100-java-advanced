package day5.io;


import day3.Person;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OutputWriterDemo {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Adam", 67, LocalDate.of(2000, 10, 10)));
        people.add(new Person("Ewa", 55, LocalDate.of(1999, 4, 15)));
        try (
                FileOutputStream file = new FileOutputStream("c:\\data\\people.txt");
                PrintWriter writer = new PrintWriter(file)
        ) {
            for (Person person : people) {
                writer.println(person.getName()+"\t"+person.getWeight()+"\t"+person.getBirthDate());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nie można utworzyć pliku!");
        } catch (IOException e) {
            System.out.println("Błąd podczas zapisu pliku!");
        }
    }
}
