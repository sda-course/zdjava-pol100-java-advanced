package day2.inner;

public class Chicken {
    private String name;

    public static class Egg{
        private double weight;

        private Egg(double weight) {
            this.weight = weight;
        }

        public double getWeight() {
            return weight;
        }
    }

    public Egg getEgg(){
        Egg egg = new Egg(45);
        egg.weight = 100;
        return egg;
    }
}
