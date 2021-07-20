package day1.model;

abstract public class MusicalInstrument {
    private final String producer;

    protected MusicalInstrument(String producer) {
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    abstract public void sound(int note, int interval);

}
