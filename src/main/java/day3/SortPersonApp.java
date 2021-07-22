package day3;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

class WeightComparator implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return Double.compare(o1.getWeight(), o2.getWeight());
    }
}

public class SortPersonApp {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Adam", 78, LocalDate.of(2000,10,10)),
                new Person("Ewa", 52, LocalDate.of(2001,10,12)),
                new Person("Celina", 56, LocalDate.of(1999,10,11))
        };
        //sortowanie domyślne na podstawie interfejsu Comparable
        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));
        //sortowanie zgodnie z interfejsem Comparator
        Arrays.sort(persons, new WeightComparator());
        System.out.println(Arrays.toString(persons));

        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getBirthDate().compareTo(o2.getBirthDate());
            }
        });

        System.out.println(Arrays.toString(persons));
    }
}
