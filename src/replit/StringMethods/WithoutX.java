package replit.StringMethods;

import java.util.Scanner;

public class WithoutX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();

        if (word.toLowerCase().startsWith("x")){
            word = word.substring(1);
        }
        if (word.toLowerCase().endsWith("x")){
            word = word.substring(0,word.length()-1);
        }
        System.out.println(word);
    }
}

/* If `word` starts with or ends with `x` or `X` print the String without those `x` characters
> - If there is no `x` or `X` as the first or last character print the `word` untouched*/
