package day05_loop_statement;
// Write a program that prints the multiplication table for any given number.

public class MultiplicationTable {
    public static void main(String[] args) {

        System.out.println("Multiplication table for 7");
        System.out.println("---------------------------");

        for (int i = 1; i <=10  ; i++) {
            System.out.println("7 x " + i + " = " + (i * 7));
        }

    }
}
