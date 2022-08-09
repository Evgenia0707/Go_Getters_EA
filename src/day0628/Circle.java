package day0628;

public class Circle {

    //define a class called as Circle for the purpose of simple geometrical calculations.

    //define two fields radius(necessary for all calculations)
    //and numberOfCircle(keep the info of how many object was created from this class).
    //decide the type of your variables (static or instance)

    private double radius;
    private static int numberOfCircle;

    //create default and parameterized constructors
    //default constructor should increase the number of object when a new object created

    public Circle() {
        numberOfCircle++;
    }
    public Circle(double radius) {
        setRadius(radius);
        numberOfCircle++;
    }

    //parameterized constructor should increase the number of object when a new object created.
    //and not allowed to initialize object with the radius value lower than Zero.

    //create getter and setter methods for radius.
    //getter
    public double getRadius() {
        return radius;
    }

    //setter if the value of radius is lower than zero keep the previous value.
    public void setRadius(double radius) { //we defined the constraints and make a detailed contract with user.
        if (radius < 0){
            System.err.println("Radius can not be lower than zero. Previous value has kept");
           System.exit(1);
        }
            this.radius = radius;
        }
    //do not allow any object to change value of static variable just get the current
    //value of numberOfCircle

    public static int getNumberOfCircle() {
        return numberOfCircle;
    }
    //calculate area of Circle
    public double calcArea() {
        if (radius == 0){
            System.err.println("Invalid number");
            System.exit(1);
        }
        return 3.14 * getRadius() * getRadius();
    }
    //calculate perimeter of Circle
    public double calcPerimeter() {
        if (radius == 0 ){
            System.err.println("Invalid number");
            System.exit(1);
        }
        return getRadius() * 2 * 3.14;
    }
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
