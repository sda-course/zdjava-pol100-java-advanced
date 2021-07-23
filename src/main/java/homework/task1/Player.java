package homework.task1;

import java.time.LocalDate;
import java.util.Arrays;

public class Player extends Person{
    private final int points;
    private String[] games;

    public Player(String name, LocalDate date, int points, String[] games) {
        super(name, date);
        this.points = points;
        this.games = games;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", points=" + points +
                ", games=" + Arrays.toString(games) +
                "} " + super.toString();
    }
}
