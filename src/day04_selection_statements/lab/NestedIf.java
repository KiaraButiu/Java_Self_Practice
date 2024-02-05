package day04_selection_statements.lab;
// Write a program that returns the greatest of given two numbers.
// using Nested If Statement

public class NestedIf {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 4;

        if (num1 != num2) {
            System.out.println("Not Equal");

            if (num1 > num2){
                System.out.println("Num1 is greater than Num2");

            } else if (num2 > num1){
                System.out.println("Num2 is greater than Num1");
            }
        } else {
            System.out.println("Equal");
        }




    }
}
