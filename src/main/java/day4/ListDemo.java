package day4;

import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>(List.of("Ala", "Ola", "Adam", "Ewa"));
        System.out.println("Pierwszy element na liście: " + names.get(0));
        System.out.println("Ostatni element na liście: " + names.get(names.size() - 1));
        //System.out.println("Element poza listą: " + names.get(names.size()));
        System.out.println("Lista przed usunięciem:");
        System.out.println(names);
        System.out.println("Usuwamy element na indeksie 1: " + names.remove(1));
        System.out.println("Lista po usunięciu: ");
        System.out.println(names);
        System.out.println("Wstawienie elementu na indeksie 1: " );
        names.add(1, "Karol");
        System.out.println(names);
//        Collection objects = new ArrayList(List.of(2, 5, true, "Bonifacy"));
//        List<String> founded = new ArrayList<>();
//        for(Object obj: objects){
//            if (obj instanceof String){
//                founded.add((String) obj);
//            }
//        }
//        System.out.println(founded);
        System.out.println("Ustawiamy imię Robert na indeksie 2: ");
        String adam = names.set(2, "Robert");
        System.out.println(names);
        System.out.println("Poprzednio na indeksie 2 był: " + adam);
        System.out.println("Tworzymy podlistę elementów od 0 do 2");
        List<String> strings = names.subList(0, 2);
        strings.set(0, "Apollo");
        strings.add("Jola");
        System.out.println(strings);
        System.out.println(names);
    }
}
