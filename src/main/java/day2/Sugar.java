package day2;

import java.math.BigDecimal;
//bez klasy anonimowej musielibyśmy zadeklarować taką klasę
//i utworzyć obiekt klasy Sugar.
public class Sugar implements Valuable{
    @Override
    public BigDecimal price() {
        return new BigDecimal("50");
    }
}
