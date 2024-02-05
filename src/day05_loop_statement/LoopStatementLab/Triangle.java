package day05_loop_statement.LoopStatementLab;
/* Create a class named Triangle and use a nested loop to
display the following shape on the console:
*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * * * *
* * * * * * * *
* * * * * * * * *
* * * * * * * * * *  */

public class Triangle {
    public static void main(String[] args) {
        int row = 10;

        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
