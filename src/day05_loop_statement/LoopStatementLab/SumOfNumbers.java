package day05_loop_statement.LoopStatementLab;
/* 4. Create a class named SumOfNumbers and write a program to calculate the sum of all numbers between 1 and any given number.
Example 1:
		number = 100
Output:
		5050
Example 2:
        number = 50
Output:
		1275 */

public class SumOfNumbers {
    public static void main(String[] args) {
        int num = 50;
        int sumOfNum =0;

        for (int i = 0; i <= num ; i++) {
            sumOfNum += i;
        }
        System.out.print(sumOfNum);
    }
}

