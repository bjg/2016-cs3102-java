package ie.tcd.cs3102;

/**
 * Created by brian on 17/01/2017.
 */
public class Circle extends Shape{
    double r;
    int c;

    Circle(double x, double y, double r, int c) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.c = c;
    }

    public double area() {
        return Math.PI * r * r;
    }
    public double perimeter() {
        return 2 * Math.PI * r;
    }
    public int color() {
        return c;
    }
}
