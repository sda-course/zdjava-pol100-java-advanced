package day4;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> uniqueNames = new TreeSet<>(List.of("Ola" ,"Adam", "Ala", "Ola"));
        System.out.println(uniqueNames);
        System.out.println("Czy jest imię Ala: " + uniqueNames.contains("Ala"));
        boolean isAdded = uniqueNames.add("Robert");
        System.out.println("Czy dodano Roberta: " + isAdded);
        isAdded = uniqueNames.add("Robert");
        System.out.println("Czy dodano drugi raz Roberta: " + isAdded);
        uniqueNames.remove("Adam");
        System.out.println("Set po usunięciu Adama: ");
        System.out.println(uniqueNames);
    }
}
