package replit.StringMethods;

import java.util.Scanner;

public class BooleanHasJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();

        boolean isValid = (word.startsWith("java") || word.substring(1).startsWith("java"));
        System.out.println(isValid);

    }
}

/*Use `String methods` to check if the given `word` contains the text `java`, but not anywhere in the String.
The `java` text must be in either position 0 or position 1 of the String. If the text `java` appears in
any other position it is not valid and is not considered to be found in the String. Output a `boolean value, true or false`.*/
