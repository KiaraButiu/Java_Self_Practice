package day10_wrapperclass_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateElement {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        list.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(list);

    }
}
/* Create a class called DuplicateElements and write a program with the following specifications:
   3.1 Given an ArrayList, duplicate each element in the list.

		 	Example:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,5,1,2,3,4,5];

*/