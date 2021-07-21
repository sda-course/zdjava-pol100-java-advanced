package homework.task1;

import java.time.LocalDate;

/**
 *Zadanie 1 (łatwe)
 *Zmieniając tylko prawą stronę przypisania w wierszu 15 (z komentarzem na końcu), zmień działanie programu, aby wyświetlał się napis
 *"Bohater XXX urodzony w yyyy-mm-dd"
 *gdzie XXX oraz yyyy-mm-dd to kolejno pola <code>name</code> i <code>birthDate</code> obiektu klasy <code>Person</code>
 *Reszta tej klasy oraz klasa <code>Person</code> nie może być zmieniana!!!
 *Możesz za to tworzyć nowe klasy:-)
 */
public class Task01A {
    public static void main(String[] args) {
        Person hero = new Person("Batman" , LocalDate.of(1980,10,10)); //ZMIEN TYLKO PRAWĄ STRONE!!!
        System.out.println(hero);
    }
}
