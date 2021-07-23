package day4;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Exercise3 {
    public static void main(String[] args) {
        //Utwórz mapę map z kluczem Double i wartością String
        Map<Double, String> map = new TreeMap<>();
        //Dodaj do mapy pary: 1.45 -> "AAA", 2.67 -> "BBB", 1.78 -> "VVV"
        map.put(1.45, "AAA");
        map.put(2.67, "BBB");
        map.put(1.78, "VVV");
        //Wyświetl klucze lub wartości
        System.out.println(map.keySet());
        System.out.println(map.values());
        //Pobierz wartość z klucza 1.78
        System.out.println(map.get(1.78));
        //Usuń wartość o kluczu 1.45
        map.remove(1.45);
        //Wyświetl mapę
        System.out.println(map);
    }
}
