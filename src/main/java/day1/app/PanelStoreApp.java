package day1.app;

import day1.model.BorderedPanel;
import day1.model.Panel;
import day1.model.PanelWithHoles;

import java.math.BigDecimal;

public class PanelStoreApp {
    public static void main(String[] args) {
        Panel[] panels = new Panel[5];
        int last = -1;
        //... wprowadzanie danych w pętli
        String panelType = "basic";
        switch (panelType){
            case "basic":
                panels[++last] = new Panel(200,400);
                break;
            case "bordered":
                panels[++last] = new BorderedPanel(600,400, new BigDecimal("0.01"));
                break;
            default:
                System.out.println("Nieznany rodzaj panelu!");
        }
        //dodajmy kilka na piechotę, zamiast wpisywać z klawiatury
        panels[++last] = new BorderedPanel(600,800, new BigDecimal("0.02"));
        panels[++last] = new Panel(800,400);
        panels[++last] = new Panel(600, 800);
        panels[++last] = new PanelWithHoles(200,200, 5);
        //wyświetlenie cen paneli
        for(Panel panel: panels){
            System.out.print(panel + " ");
            System.out.println(panel.price(new BigDecimal("0.02")));
        }
    }
}
