package day2.app;

import day1.model.Guitar;
import day1.model.Panel;
import day2.Cooker;
import day2.Valuable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ValuableApp {
    public static void main(String[] args) {
        List<Valuable> products = new ArrayList<>();
        products.add(new Cooker(2000, "Bosch",new BigDecimal("2010")));
        products.add(new Panel(300,400));
        products.add(new Guitar("Gibson", true));
        BigDecimal sum = BigDecimal.ZERO;
        for(Valuable product: products){
            sum = sum.add(product.price());
        }
        System.out.println("Suma zamówienia: " + sum);
    }
}
