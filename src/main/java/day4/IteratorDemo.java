package day4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>(List.of("Ala", "Ola", "Adam", "Ewa"));
        //Nie można modyfikować kolekcji podczas przeglądania instrukcją foreach!!!
//        for(String name: names){
//            if (name.startsWith("A")){
//                names.remove(name);
//            }
//        }
        //Jeśli podczas przeglądania kolekcji chcemy usuwać elementy kolekcji to tylko
        //za pomocą iteratora!!!
        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
            if (name.length() == 3){
                iterator.remove();
            }
        }
        /*
        Ala Ola Adam Ewa
       ^
        next
        Ala^Ola Adam Ewa
        iterator = Ala
        iterator.remove

           ^Ola Adam Ewa

         */
    }
}
