package day04_selection_statements.lab;
// Write a program using switch statement that displays different messages for given
// laptop models like “apple”, “dell”, or “acer” laptop models and.
// If it is “apple”, display “Apple-no virus”
// If it is “dell”, display “Tough one”
// If it is “acer”, display “Not recommended”
// Else show “Do not buy that one!”
public class SwitchStatement {
    public static void main(String[] args) {

        String laptopModel = "dell";

        switch (laptopModel) {

            case "apple" -> System.out.println("Apple-no virus ");
            case "dell" -> System.out.println("Tough one");
            case "acer" -> System.out.println("Not recommended");
            default -> System.out.println("Do not buy that one!");


        }











    }
}
