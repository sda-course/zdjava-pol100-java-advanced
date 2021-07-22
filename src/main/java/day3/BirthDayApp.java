package day3;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class BirthDayApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz datę urodzin:");
        String birth = scanner.next();
        try {
            LocalDate birthDate = LocalDate.parse(birth);
            System.out.println("Urodziłeś się :" + birthDate);
        } catch (DateTimeParseException e){
            System.out.println("Niepoprawny format daty!");
        }
    }
}
