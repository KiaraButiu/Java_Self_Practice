package day04_selection_statements.lab;
// Write if-else statement that assigns 0 to the variable B and assigns
// 1 to the variable C if the variable A is less than 10.
// Otherwise, it should assign -99 to the variable B and assign 0 to the variable C.
public class IfElseStatement2 {

    public static void main(String[] args) {

        int a = 9;
        int b = 5;
        int c = 7;

        if ( a < 10) {
            b = 0;
            c = 1;
        } else {
            b = -99;
            c = 0;
        }
        System.out.println("b =" + b);
        System.out.println("c =" +c);
    }
}
