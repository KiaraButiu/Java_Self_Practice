package day05_loop_statement.LoopStatementLab;
/*1. Create a class named Rectangle. Use a loop to print the following shape on the console:

			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *

 */
public class Rectangle {
    public static void main(String[] args) {

        for (int i = 1; i <= 9 ; i++) {
            for (int j = 1; j <= 7 ; j++) {
                System.out.print(" * ");
            }
            System.out.println( );
        }
    }
}
