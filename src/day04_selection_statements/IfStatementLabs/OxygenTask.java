package day04_selection_statements.IfStatementLabs;

public class OxygenTask {
    public static void main(String[] args) {
        int oxygenLevel = 75;


        if (oxygenLevel >= 90) {
            System.out.println("Your tank is full");
        } else if (oxygenLevel <= 89 && oxygenLevel >= 80) {
            System.out.println("Still okay");
        } else if (oxygenLevel <= 79 && oxygenLevel >= 70){
            System.out.println("Don't go too far");
        } else if (oxygenLevel <= 69 && oxygenLevel >= 60){
            System.out.println("Start to head back");
        } else if (oxygenLevel <= 59 && oxygenLevel >= 50 ){
            System.out.println("Be careful, you're at 50%");
        } else {
            System.out.println("Need Inspection");
        }
    }
}
