package day09_arrays;

import java.util.Arrays;

public class ClassmatesReverse {
    public static void main(String[] args) {
        String[] classmates = {"Edward Nicolas", "Kiara Donna", "Amahara Grace", "Mary Dominic", "Regine Lucas",
                "Katherine Lopez", "Michelle Solis", "RJ Belleza", "Mayumi Butiu", "Kirk Lorena"};

        String[] reversedInitials = new String[classmates.length];

        for (int i = classmates.length -1, j = 0; i >= 0; i--, j++) {            // j = new reversed classmates array
            reversedInitials[j] = classmates[i];
        //    System.out.println(reversedInitials[j]);
            reversedInitials[j] = classmates[i].charAt(0) +"." + classmates[i].charAt(classmates[i].indexOf(" ") + 1);

            System.out.println(reversedInitials[j]);
        }
    }
}
/* Create a class named ClassMatesReversed and write a program with the following specifications:
   6.1 Create an array of strings named classmates.
   6.2 Store full names of 10 classmates.
   6.3 Reverse each student's name and print them on separate lines.
*/