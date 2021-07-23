package day4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        boolean isInserted = names.add("Ala");
        System.out.println("Czy imię zostało dodane? " + isInserted);
        names.add("Adam");
        names.add("Celina");
        System.out.println("Rozmiar kolekcji names = " + names.size());
        List<String> newNames = List.of("Beata", "Roman");
        names.addAll(newNames);
        System.out.println(names);
        System.out.println("Czy jest imię Ewa? " + names.contains("Ewa"));
        System.out.println("Czy jest imię Roman? " + names.contains("Roman"));
        names.remove("Adam");
        System.out.println("Kolekcja po usunięciu imienia Adam");
        System.out.println(names);
    }
}
