package day03_operators;
// Write a program that calculates the area and perimeter of the given rectangle.
// Area of rectangle:           area=length×width
// Perimeter of rectangle:      perimeter=2×(length+width)
public class Rectangle {
    public static void main(String[] args) {

        double length = 4.5;
        int width = 2;

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("The area of the rectangle is " + area);
        System.out.println("The perimeter of the rectangle is " + perimeter);






    }
}
