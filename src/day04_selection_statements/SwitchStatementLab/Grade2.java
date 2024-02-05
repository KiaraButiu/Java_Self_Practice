package day04_selection_statements.SwitchStatementLab;

public class Grade2 {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {

            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Great Job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
            default:
                System.out.println("Invalid Grade");
        }



    }
}
