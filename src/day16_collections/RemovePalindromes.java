package day16_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovePalindromes {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                "Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam"
        ));

        List<String> list2 = new ArrayList<>();      // to store words that are not palindromes

        for (String each : list) {
            if (!isPalindrome(each)){           // if each string is NOT palindrome
                list2.add(each);                // add to list 2
            }
        }
        System.out.println(list2);
    }

    public static boolean isPalindrome(String str){     // Palindrome: words that will read the same in reverse

        StringBuilder word = new StringBuilder(str);
        word.reverse();

        if (word.toString().equalsIgnoreCase(str)){
            return true;
        } else{
            return false;
        }
    }
}
/*  Create a class named RemovePalindromes and write a program that removes all palindrome strings
from a given list of strings. The removal should be performed without using the removeIf method.

         Example:
            list = {"Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                     "reviver", "racecar", "madam"}

         Output:
            {"Java", "Python", "Cydeo", "Car"} */