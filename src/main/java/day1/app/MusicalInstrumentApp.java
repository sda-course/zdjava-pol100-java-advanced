package day1.app;

import day1.model.Guitar;
import day1.model.MusicalInstrument;
import day1.model.Piano;

import java.util.LinkedList;
import java.util.List;

public class MusicalInstrumentApp {
    public static void main(String[] args) {
        List<MusicalInstrument> instruments = new LinkedList<>();
        instruments.add(new Piano("Legnica",4.5));
        instruments.add(new Guitar("Gibson", true));
        MusicalInstrument instrument = new Guitar("Amati", false);
        for(MusicalInstrument i: instruments){
            i.sound(1, 1);
        }

    }
}
