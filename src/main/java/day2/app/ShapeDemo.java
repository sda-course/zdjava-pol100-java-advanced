package day2.app;

import day2.interfaces.Point;
import day2.interfaces.Shape;
import day2.interfaces.Square;

import java.util.ArrayList;
import java.util.List;

public class ShapeDemo {
    public static void main(String[] args) {
        List<Shape> picture = new ArrayList<>();
        picture.add(new Point());
        picture.add(new Square());
        for(Shape shape: picture){
            shape.draw("canvas");
        }
    }
}
