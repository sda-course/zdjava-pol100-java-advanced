package day1.model;

import day2.interfaces.Valuable;

import java.math.BigDecimal;

abstract public class MusicalInstrument implements Valuable {
    private final String producer;

    protected MusicalInstrument(String producer) {
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    abstract public void sound(int note, int interval);

    @Override
    public BigDecimal price() {
        return new BigDecimal("300");
    }
}
