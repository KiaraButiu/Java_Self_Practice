package replit.StringMethods;

import java.util.Scanner;

public class FirstAndLastLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();

        input.close();

        boolean firstLetter = word.startsWith("a");
        System.out.println("Starts with a: " + firstLetter);

        boolean lastLetter = word.endsWith("e");
        System.out.println("Ends with e: " + lastLetter);



    }
}
