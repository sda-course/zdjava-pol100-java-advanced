package day2.app;

import java.util.Arrays;
import java.util.Scanner;

public class MenuApp {
    static double a;
    static double b;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Menu menu = new Menu(
                Arrays.asList(
                        new MenuItem("Wpisz liczbę a", 1,
                                new MenuAction() {
                                    @Override
                                    public void execute() {
                                        System.out.println("Podaj liczbę dziesiętną:");
                                        a = scanner.nextDouble();
                                    }
                                }
                        ),
                        new MenuItem("Wpisz liczbę b", 2,
                                new MenuAction() {
                                    @Override
                                    public void execute() {
                                        System.out.println("Podaj liczbę dziesiętną:");
                                        b = scanner.nextDouble();
                                    }
                                }
                        ),
                        new MenuItem("Oblicz a + b", 3,
                                new MenuAction() {
                                    @Override
                                    public void execute() {
                                        System.out.println("Wynik: " + (a + b));
                                    }
                                }),
                        new MenuItem("Wyjście", 0, new MenuAction() {
                            @Override
                            public void execute() {
                                System.exit(0);
                            }
                        })
                )
        );
        while(true) {
            menu.print();
            int option = scanner.nextInt();
            menu.executeAction(option);
        }
    }
}
