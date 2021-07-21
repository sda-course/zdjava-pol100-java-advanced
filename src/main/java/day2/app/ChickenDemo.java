package day2.app;

import day2.inner.Chicken;

public class ChickenDemo {
    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        //Niemożliwe jest utworzenie jajko poza klasą Chicken, bo konstruktor jest prywatny
        Chicken.Egg egg1 = chicken.getEgg();
        System.out.println("Jajko kurczaka  o wadze: " + egg1.getWeight());
    }
}
