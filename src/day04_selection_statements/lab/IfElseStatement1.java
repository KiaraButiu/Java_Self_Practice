package day04_selection_statements.lab;
//      if (condition) {
//          statement to execute
//      } else {
//          statement to execute
//      }

// Write an if-else statement that assigns 20 to variable Y
// if the variable X is greater than 100. Otherwise, it should assign 0 to the variable Y.
public class IfElseStatement1 {

    public static void main(String[] args) {

        int x = 110 ;
        int y = 50;

        if ( x > 100) {
            y = 20;
        } else {
            y = 0;
        }
        System.out.println("y = " + y);
    }
}
