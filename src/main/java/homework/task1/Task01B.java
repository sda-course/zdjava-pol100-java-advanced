package homework.task1;

import java.time.LocalDate;

/**
 * Część 1
 * Zdefiniuj w tym pakiecie publiczną klasę Player (konstruktor, metody get i set),
 * która przechowuje informacje o graczu:
 * name - imię gracza,
 * birthDate - datę urodzin gracza,
 * points - liczba punktów jako liczba całkowita,
 * games - tabela z nazwami ulubionych gier.
 * Wykorzystaj dziedziczenie i istniejącą klasę Person. Wykorzystaj w konstruktorze Player odwołanie
 * do konstruktora klasy Person.
 * Część 2
 * Zdefiniuj metodę toString() w klasie Player. W metodzie main utwórz obiekt tej klasy
 * i wyświetl go metodą System.out.println().
 *
 */
public class Task01B {
    public static void main(String[] args) {
        Player player = new Player("Adam", LocalDate.of(2000,10,10), 120,
                new String[]{"Call of duty", "Fallout", "ABCd"});
        System.out.println(player);
    }
}
