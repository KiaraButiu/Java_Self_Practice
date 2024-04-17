package day04_selection_statements.IfStatementLabs;

public class FINRA {
    public static void main(String[] args) {
        int number = 15;

        if (number % 3 == 0 && number % 5 == 0 ) {
            System.out.println("FINDRA");
        } else if ( number % 3 ==0){
            System.out.println("FIN");
        } else if ( number % 5 == 0){
            System.out.println("DRA");
        } else {
            System.out.println("Invalid");
        }
    }
}
