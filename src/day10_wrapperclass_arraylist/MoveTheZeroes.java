package day10_wrapperclass_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveTheZeroes {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        Collections.sort(list);
        System.out.println(list);       // [0, 0, 0, 0, 1, 2, 3, 4]

        Collections.rotate(list,4);
        System.out.println(list);

    }
}
/* Create a class called MoveTheZeros and write a program with the following specifications:
   5.1 Given an ArrayList, move all zeros to the last indexes of the ArrayList.

	            Example:
	                list: {1,0,2,0,3,0,4,0}

	            output:
	                [1, 2, 3, 4, 0, 0, 0, 0]
*/