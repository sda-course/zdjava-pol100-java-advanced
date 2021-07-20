package day1.model;
/*
Można też zdefiniować klasy abstrakcyjne dla instrumentów klawiszowych, szarpanych i dete.

 */
public class Piano extends MusicalInstrument{
    private double octaveNumber;

    public Piano(String producer, double octaveNumber) {
        super(producer);
        this.octaveNumber = octaveNumber;
    }


    @Override
    public void sound(int note, int interval) {
        System.out.println("Piano: " + note + " " + interval);
    }
}
