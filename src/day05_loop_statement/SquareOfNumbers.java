package day05_loop_statement;

public class SquareOfNumbers {
    public static void main(String[] args) {

        System.out.println(" Number|" + "   Square of Number");
        System.out.println("------------------------");
        for (int number = 1; number <=9 ; number++) {
            System.out.println("\t" + number + "  |     " +(number * number));
        }
        for (int number = 10; number <= 10; number++) {
            System.out.println("\t" + number + " |     " + (number * number));

        }
    }
}
