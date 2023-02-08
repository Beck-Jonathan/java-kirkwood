package shapes;

public class Cylinder extends Shape {
    //instance variables
    private Circle circle;
    private double height;

    //contrcutor
    public Cylinder() {
        super(3);
        //radius=1;
        height = 1;
        circle = new Circle();
    }

    public Cylinder(double height, Circle circle) {
        super(3);
        setHeight(height);
        setCircle(circle);
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("The height  must be greater than zero");
        }
        this.height = height;
    }

    @Override
    public double getArea() {
        //2 pi r h + 2 pi r r
        return 2 * Math.PI * circle.getRadius() * this.height + 2 * circle.getArea();
    }
    public double getVolume() {
        // area of circle times height
        return circle.getArea()*this.height;
    }
}
