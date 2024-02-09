package day12_OOP_encapsulation;

public class Circle {

    private int radius;

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        if (radius <= 0){
            System.err.println("Radius cannot be negative or zero: " + radius);
            System.exit(1); // terminates program
        }
        this.radius = radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }
    public double calcArea(){
        return Math.round(radius * radius * Math.PI);
    }
    public double calcPerimeter(){
        return 2 * radius * Math.PI;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", Area= " + calcArea() +
                ", Perimeter= " + calcPerimeter() +
                '}';
    }
}
/* Create a custom class named Circle with the following specifications:

	Attributes:
		radius

	Ensure encapsulation for the field.
		Condition:
			The radius cannot be set to a negative or zero value.

	Add a constructor that allows the user to set the field during object creation.

	Actions:
		calcArea(): Calculates and returns the area of the circle object.
		calcPerimeter(): Calculates and returns the perimeter of the circle object.
		toString(): Displays the radius, area, and perimeter of the circle when the object is printed.

	Create another class named CircleClients, create multiple circle objects, and test each function of the circle object.*/