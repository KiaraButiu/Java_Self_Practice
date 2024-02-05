package day04_selection_statements.lab;
// Write a program that returns the greatest of given two numbers.

public class GreatestNumber {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 2;

        if (num1 > num2){
            System.out.println("num1 is greater than num2");

        }else if (num2 > num1){
            System.out.println("num2 is greater than num1");

        }else{
            System.out.println("the number is equal");
        }
    }
}
