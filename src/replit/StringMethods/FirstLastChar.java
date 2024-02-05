package replit.StringMethods;

import java.util.Scanner;

public class FirstLastChar {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String word = input.next();

        //  String firstLetter = word.substring(0,1);
        char firstLetter = word.charAt(0);
        System.out.println("first letter: " + firstLetter);

        char lastLetter = word.charAt(word.length()-1);
        System.out.println("last letter: " + lastLetter);





    }
}


