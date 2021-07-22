package day2.app.menu;

import day2.app.MenuItem;

import java.util.List;

public class Menu {
    private final List<MenuItem> itemList;

    public Menu(List<MenuItem> itemList) {
        this.itemList = itemList;
    }

    public void print(){
        for(MenuItem item: itemList){
            System.out.println(item.getOption() + ". " + item.getLabel());
        }
    }

    public void executeAction(int option){
        for(MenuItem item: itemList){
            if (item.getOption() == option){
                item.getAction().execute();
            }
        }
    }
}
