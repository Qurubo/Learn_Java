package Stepik_3.Figure;

/**
 * Created by qurub on 13.12.2016.
 */
public class Point {
    private final double x;
    private final double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public double getX() {

        return x;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
