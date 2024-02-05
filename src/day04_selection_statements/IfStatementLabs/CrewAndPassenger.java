package day04_selection_statements.IfStatementLabs;

public class CrewAndPassenger {
    public static void main(String[] args) {

        int number = 75;


        if (number == 50) {
            System.out.println("20 crew, 30 passengers");
        } else if (number == 75) {
            System.out.println("25 crew, 50 passengers");
        } else if (number == 100) {
            System.out.println("30 crew, 70 passengers");
        } else {
            System.out.println("Not Valid");
        }

    }
}