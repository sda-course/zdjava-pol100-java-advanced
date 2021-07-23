package day3;

public class PizzaBoxDemo {
    public static void main(String[] args) {
        PizzaBox<Pizza> stringPizzaBox = new PizzaBox<>(new Pizza());
        PizzaBox<PepperoniPizza> box = new PizzaBox<>(new PepperoniPizza());
    }
}
