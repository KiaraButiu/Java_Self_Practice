package replit.StringMethods;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();


        if (word.length() == 5) {
            StringBuilder reverseWord = new StringBuilder(word);
            reverseWord.reverse();
            System.out.println(reverseWord);

        } else if (word.length() < 5) {
            System.out.println("Too short!");

        }else if (word.length() > 5){
            System.out.println("Too long!");

        }else{
            System.out.println("Invalid character");
        }

    }
}
/* ### Use `String methods` and `if statements` to reverse a String that is five characters long.
If the given `word` is not five characters long, it will not be reversed. Use the following to output a value:

> - If the `word` is less than 5 characters: print `Too short!`
> - If the `word` is more than 5 characters: print `Too long!`
> - If the `word` is 5 characters: print the `reversed version` of the String.
Reading characters from the end to the beginning.
*/