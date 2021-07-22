package day2.interfaces;

public class Square implements Shape{
    @Override
    public void draw(String canvas) {
        System.out.println(canvas + " : Square");
    }
}
