package day3;

public class PizzaBox<T extends Pizza>{
    private T pizza;


    public PizzaBox(T pizza) {
        this.pizza = pizza;
    }

    public T getPizza() {
        return pizza;
    }

    public void setPizza(T pizza) {
        this.pizza = pizza;
    }

}
