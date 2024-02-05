package replit.StringMethods;

import java.util.Scanner;

public class MergeWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word1 = input.next();
        String word2 = input.next();
        String word3;

        if ((word1.length() == 3) && (word2.length() == 3)){
            String mergeWords ="" + word1.charAt(0) + word2.charAt(0) + word1.charAt(1) + word2.charAt(1) +
                    word1.charAt(2) + word2.charAt(2);

            System.out.println(mergeWords);

        }else{
            System.out.println("cannot merge");
        }


    }
}
/* ## Use `String methods` and `if statements` to  combine the two given String variables, `word1` and `word2` together,
but only combine them if the Strings are only three character long. If either String is not three characters long,
do not merge them together and instead print `cannot merge`. If both Strings are three characters long then merge them
 together in the following format and print the merged String:

#### The Strings will be merged by taking the first character of the first word,
then the first character of the second word, then the second character of the first word, etc... */