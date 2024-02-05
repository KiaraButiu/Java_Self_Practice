package replit.StringMethods;

import java.util.Scanner;

public class WithoutFirstLastChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();

        String firstLetter = word.substring(1);
        System.out.println(firstLetter);

        String lastLetter = word.substring(0,word.length()-1);
        System.out.println(lastLetter);


    }
}
/*Use `String methods` to print the given `word` without the first character and another output of the `word` without the last character. The value of the `word` will be input from a Scanner, but you only need to interact with the String variable. Output in the following format:

> without first letter: $word without the first character

> without last letter: $word without the last character
 */
