package day05_loop_statement;
/* Calculate the sum of even and odd numbers between 1 and 100 (exclusive)
then print the result as below. */
public class SumOfEveOddNum2 {
    public static void main(String[] args) {

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i <= 100; i++) {

             if (i % 2 ==0) {
                 sumEven += i;
             } else {
                 sumOdd += i;
             }

            }
        System.out.println("Sum of Even " + sumEven);
        System.out.println("Sum of Odd " + sumOdd);
        }
    }