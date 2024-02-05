package day04_selection_statements.lab;
// Write an if statement that assigns 20 to the variable A
// if variable B 50 and c is greater and equal to 100
public class IfStatement3 {
    public static void main(String[] args) {

        int a = 10;
        int b = 50;
        int c = 100;

        if ( b == 50 && c >= 100 );{
            a = 20;
        }

        System.out.println("a = " + a);
    }
}
