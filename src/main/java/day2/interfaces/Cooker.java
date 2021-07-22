package day2.interfaces;

import java.math.BigDecimal;

public class Cooker implements Catalog{
    private final int power;
    private final String name;
    private final BigDecimal price;

    public Cooker(int power, String name, BigDecimal price) {
        this.power = power;
        this.name = name;
        this.price = price;
    }


    @Override
    public BigDecimal price() {
        return price;
    }


    @Override
    public String describe() {
        return "Power: " + power +", name: " + name + ", price: " + price;
    }
}
