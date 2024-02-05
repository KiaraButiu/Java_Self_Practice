package day05_loop_statement;
// 0 1 1 2 3 5 8 13 21
public class FibonacciSequence {
    public static void main(String[] args) {
         int num1 = 0;
         int num2 = 1;
         int sum = 0;

        for (int i = 0; i <= 9; i++) {

            System.out.print(num1 + " ");

     // compute the next number in the series
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;

        }
    }
}
