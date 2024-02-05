package day04_selection_statements.SwitchStatementLab;

public class NumberOfDays {
    public static void main(String[] args) {
        int month = 5;

        switch (month) {

            case 1 -> System.out.println("31 days");
            case 2 -> System.out.println("28 days");
            case 3 -> System.out.println("31 days");
            case 4 -> System.out.println("30 days");
            case 5 -> System.out.println("31 days");
            case 6 -> System.out.println("30 days");
            case 7 -> System.out.println("31 days");
            case 8 -> System.out.println("31 days");
            case 9 -> System.out.println("30 days");
            case 10 -> System.out.println("31 days");
            case 11 -> System.out.println("30 days");
            case 12 -> System.out.println("31 days");
            default -> System.out.println("Invalid");

        }
    }
}
