package day10_wrapperclass_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates2 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3,4,4,5,6,7));
        
        System.out.println("list = " + list);
        
        List <Integer> uniquelist = new ArrayList<>();      // to store unique elements.

        for (Integer each : list) {             // to obtain each element
            if (uniquelist.contains(each)){     // if unique list contains unique element, skip
                continue;                       // skip
            }
            uniquelist.add(each);
        }
        System.out.println("uniquelist = " + uniquelist);
    }
}
/* Create a class called RemoveDuplicates and write a program with the following specifications:
   8.1 Given an ArrayList of integers, remove duplicated numbers.

			Example:
				list = [1,1,2,2,3,3,4,4,5,6,7]

			Output:
				[1,2,3,4,5,6,7]
*/