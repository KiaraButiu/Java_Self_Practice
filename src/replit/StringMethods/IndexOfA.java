package replit.StringMethods;

import java.util.Scanner;

public class IndexOfA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();

        int a = word.indexOf("a");
        System.out.println(a);
    }
}
/*Use `String methods` to find the index of the letter `a` in the given `word`. Print the index of the character:

> Index of a: $index number
 */