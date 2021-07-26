package day5.functional;
// a + b
// a - b
// a / b
// a * b

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

@FunctionalInterface
interface ArithmeticOperator{
    double apply(double a, double b);
}

class Addition implements ArithmeticOperator{
    @Override
    public double apply(double a, double b) {
        return a + b;
    }
}

class Divide implements ArithmeticOperator{

    @Override
    public double apply(double a, double b) {
        return a / b;
    }
}
public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        ArithmeticOperator discount = new Addition();
        discount = new Divide();
        discount = new ArithmeticOperator() {
            @Override
            public double apply(double a, double b) {
                return a - b * 0.1;
            }
        };
        //Wyrażenie lambda, odpowiednik klasy anonimowej powyżej
        //Implementuje interfejsy funkcyjne, tylko z jedną metodą!!!
        discount = (a, b) -> a - b * 0.1;
        ArithmeticOperator mul = (a, b) -> a * b;

        System.out.println(discount.apply(30 ,5));
        System.out.println(mul.apply(3, 6));
        Predicate<Double> isGreaterThanTen = a -> a > 10;
        System.out.println(isGreaterThanTen.test(11d));
        BiPredicate<Double, Double> isFirstGreaterThanSecond = (a, b) -> a > b;
        System.out.println(isFirstGreaterThanSecond.test(11d, 45d));
        List<Double> numbers = List.of(4d, 5d, 6.7d, 6d, 7d ,2d ,5d);
        int count = 0;

        for(double number: numbers){
            if (number == 2){
                count++;
            }
        }
        System.out.println(count);
        //z wykorzystanie lambd robiny to samo co wyżej
        count = countNumbers(numbers, x -> x == 2);
        System.out.println(count);
        System.out.println(countNumbers(numbers, x -> x > 5));
        System.out.println(countNumbers(numbers, x -> {
            double a = x % 3;
            if (a == 0){
                return true;
            } else {
                return false;
            }
        }));
    }

    public static int countNumbers(List<Double> numbers, Predicate<Double> predicate){
        int count = 0;
        for(double number: numbers){
            if (predicate.test(number)){
                count++;
            }
        }
        return count;
    }
}
