package day1.app;

import day1.model.Person;
import day1.model.Student;
import day1.model.Worker;

import java.math.BigDecimal;
import java.time.LocalDate;

public class InheritanceDemo {
    public static void main(String[] args) {
        Worker worker = new Worker(
                "Adam",
                "Karolak",
                LocalDate.of(2000,10,01),
                new BigDecimal("1500.5"),
                "mag. inż."
        );
        //Dopisz utworzenie i przypisanie do pól obiektu klasy Student
        Student student = new Student(
                "Ewa",
                "Anecka",
                LocalDate.of(1999,11,14),
                128993,
                "Java"
        );
        System.out.println(worker);
        String toString = worker.toString();
        System.out.println(toString);
        System.out.println(student);

        Person karol = worker;
        karol.setFirstName("Zenon");
        System.out.println(karol);
        Person ewa = student;
        System.out.println(ewa);
        Person[] club = new Person[3];
        club[0] = karol;
        club[1] = ewa;
        club[2] = new Person("Robert", "Rurka", LocalDate.of(1989, 12,12));
        for(Person person: club){
            System.out.println(person.asPersonString());
        }
        //wykorzystanie polimorfizmu
        for(Person person: club){
            System.out.println(person);
        }
    }
}
