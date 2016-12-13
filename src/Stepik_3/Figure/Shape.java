package Stepik_3.Figure;

/**
 * Created by qurub on 13.12.2016.
 */
public class Shape {
    private final Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public double getArea() {
        return Double.NaN;
    }
}
