package day2.enumtype;

public enum CardColor {
    //final static public CarColor DIAMOND = new CardColor(40, "Dzwonek);
    DIAMOND(30, "Karo"),
    HEART(40, "Kier"),
    SPADES(50, "Pik"),
    CLUB(20, "Trefl");

    private final int points;

    private final String polishName;


    CardColor(int points, String polishName) {
        this.points = points;
        this.polishName = polishName;
    }

    public int getPoints() {
        return points;
    }

    public String getPolishName() {
        return polishName;
    }
}
