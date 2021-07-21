package day2;

import java.math.BigDecimal;

public class Cooker implements Valuable{
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
}
