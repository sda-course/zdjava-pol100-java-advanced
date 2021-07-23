package day4;

import day3.Person;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Person> people = new HashMap<>();
        people.put("adam@op.pl",
                new Person("Adam",78, LocalDate.of(2000,10,10)));
        people.put("ooo@osda.pl",
                new Person("Ola",57, LocalDate.of(2000,9,11)));
        people.put("gkt@wp.pl",
                new Person("Karol",82, LocalDate.of(2001,10,10)));
        System.out.println("Pobieramy osobę spod klucza adam@op.pl:" + people.get("adam@op.pl"));
        //HashMap dopuszcza klucz null, ale TreeSet już nie
        //System.out.println("Pobieramy osobę spod klucza null: " + people.get(null));
        //Dla niestniejącego klucza mapa zwraca null!!!
        Person person = people.get("ada@op.pl");
        //Null check niezbędny!!!
        if (person != null) {
            if (person.getBirthDate() != null) {
                System.out.println(person.getBirthDate().getYear());
            }
        }
        String key = "ada@op.pl";
        //Uwaga HashMap dopuszcza null jako wartość pod kluczem
        people.put(key, null);
        if (people.containsKey(key)){
            if (people.get(key) != null) {
                System.out.println(people.get(key).getBirthDate());
            }
        }
        System.out.println("Zbiór kluczy: " + people.keySet());
        System.out.println("Zbiór wartości: " + people.values());
        //Iterowanie po mapie
        for(Map.Entry<String, Person> entry: people.entrySet()){
            System.out.println("Klucz " + entry.getKey() +", wartość " + entry.getValue());
        }
    }
}
