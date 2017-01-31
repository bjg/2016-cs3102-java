package ie.tcd.cs3102;

/**
 * Created by brian on 17/01/2017.
 */
public class Rect extends Shape {
    double w, h;

    Rect(double x, double y, double w, double h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public double area() {
        return w * h;
    }
    public double perimeter() {
        return 2 * (w + h);
    }
}

