package day12_OOP_encapsulation;

public class CircleClient {
    public static void main(String[] args) {

        Circle circle2 = new Circle(7);
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Area: " + circle2.calcArea());
        System.out.println("Perimeter: " + circle2.calcPerimeter());

        Circle circle1 = new Circle(-5);
        System.out.println(circle1.getRadius());
    }
}
