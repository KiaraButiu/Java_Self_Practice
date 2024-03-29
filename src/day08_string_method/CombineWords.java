package day08_string_method;

import java.util.Scanner;

public class CombineWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String word1 = scanner.next();
        System.out.print("Enter the second word: ");
        String word2 = scanner.next();

        if (word1.charAt(word1.length() -1)== word2.charAt(0)){
            word1 = word1 + word2.substring(1);
            System.out.println(word1);
        }else{
            word1 = word1 + word2;
            System.out.println(word1);
        }
    }
}
/* Create a class named CombineWords. Ask the user to enter two words. Then, add them together and print. But if the
last letter of the first word and the first letter of the second word are the same, print that character once.

        Example:
              Input:
                 one
                 eight

              Output:
                   oneight
*/
