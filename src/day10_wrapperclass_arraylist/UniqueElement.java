package day10_wrapperclass_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueElement {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));

        list.removeIf(number -> list.indexOf(number) != list.lastIndexOf(number));
       // remove if the first number occurred in the list is also the last time it occurred, then it is unique

        System.out.println(list);



    }
}
/* Create a class called UniqueElements and write a program with the following specifications:
   9.1 Given an ArrayList, display the unique elements without using any loops.

			Example:
				list = [1, 1, 2, 3, 3, 4, 5, 5]

			output:
				[2, 4]  */
