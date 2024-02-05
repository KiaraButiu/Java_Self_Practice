package day07_class_and_object;

public class RectangleClient {
    public static void main(String[] args) {
        
        Rectangle rectangleArea = new Rectangle();
        rectangleArea.width= 4;
        rectangleArea.length= 6;

        System.out.println(rectangleArea.calculateArea(4,6));

        Rectangle rectanglePerimeter = new Rectangle();
        rectanglePerimeter.width= 4;
        rectanglePerimeter.length = 6;
        rectanglePerimeter.calculatePerimeter(6,4);

        System.out.println(rectanglePerimeter.calculatePerimeter(6,4));








        }
    }
