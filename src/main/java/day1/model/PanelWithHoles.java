package day1.model;

import java.math.BigDecimal;

//Zdefiniuj klasę, która przechowuje liczbę otworów i oblicza cenę jako
//sumę ceny powierzchni plus liczba otworów razy stała HOLE_PRICE
public class PanelWithHoles extends Panel {
    public static final BigDecimal HOLE_PRICE = BigDecimal.TEN;
    private int holeCount;

    public PanelWithHoles(int width, int height, int holeCount) {
        super(width, height);
        this.holeCount = holeCount;
    }

    @Override
    public BigDecimal price(BigDecimal priceUnit) {
        return super.price(priceUnit).add(HOLE_PRICE.multiply(BigDecimal.valueOf(holeCount)));
    }

    public int getHoleCount() {
        return holeCount;
    }
}
