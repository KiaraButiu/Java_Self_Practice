package replit.StringMethods;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word =input.next();

        if (word.length() %2 == 0){
            word = word.substring(word.length()/2 -1,word.length()/2 +1);
            System.out.println(word);
        }else{
            word = word.substring(word.length()/2, word.length() -3);
            System.out.println(word);
        }
    }
}
/*Use `String methods` and `if statements` to find the middle character/s of the given `word` variable.
The value of the `word` will be input from a Scanner, but you only need to interact with the String variable.
Output in the following format:

Note: Odd length words will have one middle character, but even length words will have two middle character,
so use the length of the Strings to determine what the output should be.
 */
