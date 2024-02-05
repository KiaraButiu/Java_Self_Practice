package day05_loop_statement.nested_loop;
// Write a program that prints the square pattern which has the same
//      number of stars and number of rows with any given number.
// Hint: use two spaces between the stars.
public class SquarePattern {
    public static void main(String[] args) {

        for ( int i = 1; i <= 6 ; i++) {
            for (int j = 1; j <= 6 ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
