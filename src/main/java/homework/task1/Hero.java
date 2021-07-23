package homework.task1;

import java.time.LocalDate;

public class Hero extends Person{
    public Hero(String batman, LocalDate of) {
        super(batman,of);
    }

    @Override
    public String toString() {
        return "Bohater " + name + " urodzona w " + birthDate;
    }
}
