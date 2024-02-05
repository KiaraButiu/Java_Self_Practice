package replit.StringMethods;

import java.util.Scanner;

public class HalfTwice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();

        String halfTwice = word.substring(0,word.length()/2);
        System.out.println(halfTwice.concat(halfTwice));

    }
}
/* Use `String methods` to print the first half of the given `word`,
twice. Find the beginning half of the String and concatenation it twice. */