package shapes;

import java.awt.*;

public class Circle extends Shape {
    // instance variables
    private double radius;

    // constructors
    public Circle() {
        super(1);
        radius = 1;
    }

    public Circle(double radius) {
        super(0);
        setRadius(radius);

    }

    // getter and setter methods
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius Must be greater than zero");
        }
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
}
