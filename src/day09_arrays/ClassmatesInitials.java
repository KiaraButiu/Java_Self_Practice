package day09_arrays;

import java.util.Arrays;

public class ClassmatesInitials {
    public static void main(String[] args) {

        String[] classmates = {"Edward Nicolas", "Kiara Donna", "Amahara Grace", "Mary Dominic","Regine Lucas",
                                "Katherine Lopez", "Michelle Solis", "RJ Belleza", "Mayumi Butiu", "Kirk Lorena" };

        String[] initials = printInitials(classmates);
        System.out.println(Arrays.toString(initials));

    }
    public static String[] printInitials(String[] names){

        String[] initials = new String[names.length];       // to get the length of 1D array

        for (int i = 0; i < names.length; i++) {            // to get each array name
            String eachName = names[i];                     // element

            initials[i] = eachName.charAt(0) + "." + eachName.charAt(eachName.indexOf(" ") + 1);
        }
        return initials;
    }
}
/* Create a class named ClassMatesInitials and write a program with the following specifications:
   2.1 Create an array of strings named classmates.
   2.2 Store full names of 10 classmates.
   2.3 Print the initials of each student's name in separate lines.  */