package day04_selection_statements.lab;
// Write an if else statement that assigns 1 to the variable B
// if the variable A is less than 10 and assign 1 to the variable C if the
// variable A is greater than 10. If the variable A is equal to 10 then
// the variable B and C both should be assigned with 0.

public class MultibranchIf {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 7;

        if (a < 10){
            b = 1;

        } else if (a > 10){
            c = 1;

        } else {
            b = 0;
            c = 0;
        }
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
