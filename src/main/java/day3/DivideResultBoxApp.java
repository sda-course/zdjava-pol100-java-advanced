package day3;

import java.lang.reflect.GenericSignatureFormatError;
import java.util.Scanner;
class Result{
    int fraction;
    int remainder;
}

public class DivideResultBoxApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz licznik");
        int a = scanner.nextInt();
        System.out.println("Wpisz mianownik");
        int b = scanner.nextInt();
        GenericBox<Result> genericBox = divide(a, b);
        if (genericBox.isPresent()){
            Result result = genericBox.getContent();
            System.out.println(result.fraction + " + " + result.remainder+"/" + b);
        } else {
            System.out.println("Nie udało się uzyskać wyniku!");
        }
    }

    public static GenericBox<Result> divide(int a, int b){
        if (b == 0){
            return new GenericBox<>(0,null);
        }
        Result result = new Result();
        result.fraction = a / b;
        result.remainder = a % b;
        return new GenericBox<>(0, result);
    }
}
