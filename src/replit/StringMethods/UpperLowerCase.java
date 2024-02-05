package replit.StringMethods;

import java.util.Locale;
import java.util.Scanner;

public class UpperLowerCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();

        System.out.println("word: " + word);

        String upperCase = word.toUpperCase();
        System.out.println("uppercase: " + upperCase);

        String lowerCase = word.toLowerCase();
        System.out.println("lowercase: " + lowerCase);
    }
}
