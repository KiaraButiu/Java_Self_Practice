package day10_wrapperclass_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SameFirstAndLast {
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));

        for (int i = 0; i < list.size(); i++) {
            String initials = list.get(i);
            if (initials.toLowerCase() .charAt(0) == initials.charAt(initials.length()-1)){
                list.remove(initials);
                i--;        // ensure to not skip element
            }
        }
        System.out.println(list);
    }
}
/* Create a class called SameFirstAndLast and write a program with the following specifications:
    11.1 Given an ArrayList of strings, remove elements if the first and last characters of the string are the same.

			Example:
				list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}

			output:
				["Lan", "Ebrahim", "Farida"]

*/