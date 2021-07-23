package day4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        //Utwórz kolekcję obiektów typu Double przy pomocy ArrayList
        Collection<Double> doubles = new ArrayList<>();
        //Dodaj do kolekcji liczby 10.5, 21.4 i 6.56
        doubles.add(10.5);
        doubles.add(21.4);
        doubles.add(6.56);
        //Wyświetl zawartość kolekcji
        System.out.println(doubles);
        //dodaj do kolekcji inną kolekcję z liczbami 3.5 i 45.6
        doubles.addAll(List.of(3.5, 45.6));
        //Sprawdź czy w kolekcji jest liczba 21.4
        System.out.println(doubles.contains(21.4));
        //Usuń liczbę 6.56
        doubles.remove(6.56);
        System.out.println(doubles);
        //Dla chętnych
        //Oblicz sumę i średnią liczb w kolekcji
        double sum = 0;
        for(double number: doubles){
            sum += number;
        }
        System.out.println("Suma: " + sum);
        System.out.println("Srednia: " + sum/doubles.size());
    }
}
