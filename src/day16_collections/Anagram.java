package day16_collections;

import java.util.HashSet;
import java.util.Set;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "ccddabaa";

      /*   Set<Character> set1 = new HashSet<>();
        for (char each : str1.toCharArray()) {          //to obtain each character
            set1.add(each);
        }

        Set<Character> set2 = new HashSet<>();
        for (char each : str2.toCharArray()) {
            set2.add(each);
        }

        boolean isAnagram = set1.equals(set2);
        System.out.println("Example 1: " + isAnagram);  */

        System.out.println(isAnagram(str1,str2));
    }

    public static boolean isAnagram(String str1, String str2) {

        Set<Character> set1 = new HashSet<>();          // Set to remove duplicates
        for (char each1 : str1.toCharArray()) {         // convert String to Char and use for each loop
            set1.add(each1);                            // add each character to set1
        }

        Set<Character> set2 = new HashSet<>();
        for (char each2 : str2.toCharArray()) {
            set2.add(each2);
        }

        if (set1.equals(set2)) {
            return true;
        } else {
            return false;
        }
    }
}
/* Create a class named Anagram and write a program that checks if two strings are anagrams of each other,
considering only the distinct characters in each string (ignoring duplicates).

         Example1:
            str1 = "abcd"
            str2 = "ccddabaa"

         Output:
            true


         Example2:
            str1 = "xyze"
            str2 = "xyzd"

         Output:
            false */