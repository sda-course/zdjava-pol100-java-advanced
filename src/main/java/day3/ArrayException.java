package day3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayException {
    public static void main(String[] args) {
        String[] names = {"ALA", "OLA", "EWA", "KAROL"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz numer imienia");
        int index = scanner.nextInt();
        try {
            System.out.println(names[index]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Nie ma imienia pod takim indeksem!");
        } catch (InputMismatchException e){
            System.out.println("Nie wpisałeś poprawnie liczby całkowitej!");
        }
    }
}
