package day05_loop_statement.nested_loop;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int num1 = 1; num1 <= 9  ; num1++) {
            for (int num2 = 0; num2 <=9 ; num2++) {
                System.out.print("\t" + num1 +  " * " +  num2 + " = " + (num1 * num2) + "\t");
                }
            System.out.println( );
            }
        }
    }

