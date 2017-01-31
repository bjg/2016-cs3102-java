package ie.tcd.cs3102;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Shape rect = new Rect(10, 20, 40, 50);
        Shape circle = new Circle(30, 30, 10, 0x554466);

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(rect);
        shapes.add(circle);

        for (Shape shape : shapes) {
            System.out.println(shape.area());
        }
    }
}
