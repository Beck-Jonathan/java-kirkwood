import shapes.*;
public class Main {
    public static void main(String[] args) {
        //parent class = super
        //child class = this
        //we instantiated two circles, and two rectangles
        // that means we called methods on the objects
        //this are non static, as we are called the name of circle.num(sides)

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

        Cylinder cylinder1 = new Cylinder(); //height is 1, radius is 1
        Cylinder cylinder2 = new Cylinder(4,circle2); //height is 4, radius is 3
        System.out.printf("%.1f\n",cylinder1.getArea()); // 12.6
        System.out.printf("%.1f\n",cylinder2.getVolume()); // 113.1

    }
}