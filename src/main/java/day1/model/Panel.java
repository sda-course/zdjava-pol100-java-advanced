package day1.model;

import day2.Valuable;

import java.math.BigDecimal;

public class Panel implements Valuable {
    private int width;
    private int height;

    public Panel(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public BigDecimal price(BigDecimal priceUnit){
        return priceUnit.multiply(BigDecimal.valueOf(area()));
    }

    private int area(){
        return width * height;
    }

    @Override
    public String toString() {
        return "Panel{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public BigDecimal price() {
        return price(new BigDecimal("0.1"));
    }
}
