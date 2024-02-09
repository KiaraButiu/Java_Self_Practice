package day12_OOP_encapsulation;

public class RectangleClient {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(6, 7);
        rectangle1.setWidth(6);
        rectangle1.setLength(7);
        System.out.println(rectangle1.calcArea());
        System.out.println(rectangle1.calcPerimeter());

        System.out.println(rectangle1);

       Rectangle rectangle2 = new Rectangle(0,3);
       rectangle2.setWidth(0);
       rectangle2.setLength(3);
    }
}
