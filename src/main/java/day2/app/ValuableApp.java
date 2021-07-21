package day2.app;

import day1.model.Guitar;
import day1.model.MusicalInstrument;
import day1.model.Panel;
import day2.Catalog;
import day2.Cooker;
import day2.Description;
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
            if (product instanceof Panel){
                System.out.println(product + " jest instancją klasy Panel");
                Panel panel = (Panel) product;
                System.out.println("Szerokość: " + panel.getWidth());
            }
            if(product instanceof Guitar){
                Guitar guitar = (Guitar) product;
                System.out.println("Producent gitary: " + guitar.getProducer());
            }
            sum = sum.add(product.price());
        }
        System.out.println("Suma zamówienia: " + sum);
        Cooker cooker = (Cooker) products.get(0);
        if (cooker instanceof Catalog){
            System.out.println("Kuchenka jest instancją Catalog");
        }
        if (cooker instanceof Description){
            System.out.println("Kuchenka jest instancją Description");
        }
        //deklarujemy obiekt klasy anonimowej implementującej interfesj
        Valuable sugar = new Valuable() {
            @Override
            public BigDecimal price() {
                return new BigDecimal("50");
            }
        };

        products.add(sugar);
        Catalog tvSet = new Catalog() {
            @Override
            public String describe() {
                return "Telewizor 50 cali";
            }

            @Override
            public BigDecimal price() {
                return new BigDecimal("2000");
            }
        };
        products.add(tvSet);
        //Wykorzystanie klasy anonimowej do tworzenia obiektów klasy abstrakcyjnej
        MusicalInstrument flute = new MusicalInstrument("Amati") {
            @Override
            public void sound(int note, int interval) {
                System.out.println("Flute " + note +" " + interval);
            }
        };
    }
}
