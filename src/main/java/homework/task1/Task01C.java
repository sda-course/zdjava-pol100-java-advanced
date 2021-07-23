package homework.task1;

import java.awt.event.WindowStateListener;
import java.time.LocalDate;

/**
 * Część 1
 * Zadeklaruj w metodzie main tablicę trzech obiektów klasy Person o nazwie persons.
 * Umieść w tablicy dwa dowolne obiekty klasy Person oraz jeden klasy Player.
 * Wyświetl wszystkie obiekty z tablicy.
 * Co musisz zrobić, aby dla obiektów klasy Person zostały wyświetlone imiona i daty urodzin?
 * Część 2
 * Załóż, że nie wiesz, w której komórce tablicy persons znajduje się obiekt klasy Person.
 * Napisz kod, który znajdzie i wyświetli obiekt tej klasy w tablicy.
 *
 */
public class Task01C {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("AA", LocalDate.of(2000,10,10));
        persons[1] = new Person("BB", LocalDate.of(2000,10,10));
        persons[2] = new Player("AA", LocalDate.of(2000,10,10), 123, null);
        for(Person p: persons){
            //System.out.println(p.name +" " +p.birthDate);
            if (!(p instanceof Player)){
                System.out.println(p);
            }
        }
    }
}
