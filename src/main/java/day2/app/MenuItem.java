package day2.app;

public class MenuItem {
    private final String label;
    private final int option;
    private final MenuAction action;


    public MenuItem(String label, int option, MenuAction action) {
        this.label = label;
        this.option = option;
        this.action = action;
    }

    public String getLabel() {
        return label;
    }

    public int getOption() {
        return option;
    }

    public MenuAction getAction() {
        return action;
    }
}
