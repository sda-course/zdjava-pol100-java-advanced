package day1.model;

import java.math.BigDecimal;

public class BorderedPanel extends Panel{
    public int borderLength;
    public BigDecimal borderPriceUnit;
    public BorderedPanel(int width, int height, BigDecimal borderPriceUnit) {
        super(width, height);
        borderLength =  2 * (width + height);
        this.borderPriceUnit = borderPriceUnit;
    }

    public BorderedPanel(int width, int height, int borderLength, BigDecimal borderPriceUnit) {
        super(width, height);
        this.borderLength = borderLength;
        this.borderPriceUnit = borderPriceUnit;
    }

    public int getBorderLength() {
        return borderLength;
    }

    @Override
    public BigDecimal price(BigDecimal priceUnit) {
        return super.price(priceUnit)
                .add(new BigDecimal(borderLength).multiply(borderPriceUnit));
    }

    @Override
    public String toString() {
        return "BorderedPanel{" +
                "borderLength=" + borderLength +
                "} " + super.toString();
    }
}
