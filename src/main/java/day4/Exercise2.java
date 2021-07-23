package day4;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {
        List<Character> names = new ArrayList<>(List.of('A', 'C', 'D'));
        //wstaw na początku listy znak '@'
        names.add(0,'@');
        //wstaw na koniec listy znak '$'
        names.add('$');
        //zmień drugi element na znak '^'
        names.set(1, '^');
        //usuń element o indeksie 1
        names.remove(1);
        //wyświetl listę
        System.out.println(names);
        String str = names.toString()
                .replace(", ", "")
                .replace("[", "")
                .replace("]", "");
        System.out.println(str);
    }
}
