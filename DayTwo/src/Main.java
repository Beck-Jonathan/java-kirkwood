import shapes.*;
public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Shape  rect = new Rectangle();
        Circle circle2 = new Circle(3);
        System.out.println(circle1.getNumSides()); //0
        System.out.println(rect.getNumSides());
        System.out.println(circle2.getNumSides());
        System.out.println(circle2.getRadius());

        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(3,4);
        System.out.println(rect2.getNumSides());
        System.out.println(rect2.getArea());
        System.out.println(circle2.getArea());
    }
}