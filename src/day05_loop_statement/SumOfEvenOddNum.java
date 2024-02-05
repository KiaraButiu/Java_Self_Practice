package day05_loop_statement;
/* Calculate the sum of even and odd numbers between 1 and 100 (exclusive) 
then print the result as below. */
public class SumOfEvenOddNum {
    public static void main(String[] args) {

        int sumEven = 0;
        int sumOdd = 0;

 // SUM OF EVEN:
        for (int i = 0; i < 100 ; i += 2) {
            sumEven += i;
        }

 // SUM OF ODD:
        for (int i = 1; i < 100 ; i += 2) {
            sumOdd += i;

        }
        System.out.println("Sum of Even " + sumEven);
        System.out.println("Sum of Odd " + sumOdd);

    }
}
