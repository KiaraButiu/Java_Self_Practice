package day05_loop_statement;

public class EvenNumbers {
    public static void main(String[] args) {

/*  1.  Print the even numbers which starts from 0
        and ends at 10 (inclusive) in the same line with a space between the numbers. */

        for (int i = 2; i <= 10 ; i += 2) {

 //           or if ( i % 2 == 0)

            System.out.print(i + " ");
        }


    }
}
