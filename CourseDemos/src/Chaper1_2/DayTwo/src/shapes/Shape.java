package shapes;

public abstract class Shape {
    //instance variables
    private int numSides;

    // constructor
    public Shape(int numSides) {
        // calling the setter methods
        setNumSides(numSides);
    }

    // getter and setter methods
    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        // assign the parameter to the instance variable
        if (numSides < 0) {
            throw new IllegalArgumentException("Invalid number of sides");
        }
        this.numSides = numSides;

    }
    abstract double getArea();
    //every get area is found differently
    //every child class will have it's own method, and every child class has to include one

}
