package day1.model;

public class Guitar extends MusicalInstrument{
    private final boolean isElectric;

    public Guitar(String producer, boolean isElectric) {
        super(producer);
        this.isElectric = isElectric;
    }

    @Override
    public void sound(int note, int interval) {
        System.out.println("Guitar: " + note + " " + interval);
    }
}
