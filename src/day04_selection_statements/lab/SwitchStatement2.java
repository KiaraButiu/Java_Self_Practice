package day04_selection_statements.lab;
// Write a program using switch statement to display traffic light colors using following logic:
//'R' or 'r' -> "Red"
//'Y' or 'y' -> “Yellow"
// 'G' or 'g' -> "Green"
public class SwitchStatement2 {
    public static void main(String[] args) {

        String trafficLightColor = "Y";

        switch (trafficLightColor) {

            case "R":
            case "r":
                System.out.println("Red");
                break;

            case "Y":
            case "y":
                System.out.println("Yellow");
                break;

            case "G":
            case "g":
                System.out.println("Green");
                break;

            default:
                System.out.println("Invalid Color");



        }


    }
}
