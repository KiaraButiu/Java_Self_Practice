package day04_selection_statements.SwitchStatementLab;

public class Calculator {
    public static void main(String[] args) {
        double n1 = 10, n2 = 20;

        char operator = '+';
        switch (operator) {

            case '+' -> System.out.println(n1 + n2);
            case '-' -> System.out.println(n1 - n2);
            case '*' -> System.out.println(n1 * n2);
            case '/' -> System.out.println(n1 / n2);
            default -> System.out.println("Invalid Operator");

        }
    }
}
