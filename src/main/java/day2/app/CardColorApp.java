package day2.app;

import day2.enumtype.CardColor;
import day2.enumtype.Direction;

import java.util.Scanner;

public class CardColorApp {
    //stary nie nie zalecany sposób tworzenia wyliczeń
    static final int HEART = 1;
    static final int PONIEDZIALEK = 1;

    public static void main(String[] args) {
        CardColor cardColor = CardColor.HEART;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz kolor karty: ");
        String color = scanner.next();
        switch (color) {
            case "kier":
                cardColor = CardColor.HEART;
                break;
            case "pik":
                cardColor = CardColor.SPADES;
                break;
        }
        System.out.println("Wybrałeś: " + cardColor.name());
        //Nie da się porównywać stałych różnych typów!!!!
        //System.out.println(Direction.CLUB == CardColor.CLUB);
        System.out.println(CardColor.HEART == cardColor);
        System.out.println(HEART == PONIEDZIALEK);
        //Jeśli w stałych wyliczeniowych mamy pola z punktami, to ten switch jest zbędny
//        switch (cardColor) {
//            case HEART:
//                System.out.println("Punkty " + 40);
//                break;
//            case SPADES:
//                System.out.println("Punkty " + 50);
//                break;
//            case CLUB:
//                System.out.println("Punkty " + 20);
//                break;
//
//        }
        System.out.println("Liczba punktów " + cardColor.getPoints());
    }
}
