package day2.interfaces;

public class Point implements Shape{
    @Override
    public void draw(String canvas) {
        System.out.println(canvas + " : Point");
    }
}
