package day16_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(20, 15, 10, 20, 30, 10, 20, 15, 0));

        System.out.println(list);


        List<Integer> uniqueList = new ArrayList<>();       // to store unique elements

        for (Integer each : list) {                         // to obtain each element in the list
            if (uniqueList.contains(each)) {                // if unique element is contained in the list
                continue;                                   // skip
            }
            uniqueList.add(each);                           // otherwise, add element to the unique list
        }
        Collections.sort(uniqueList);                       // to sort element

        System.out.println(uniqueList);

    }
}
/*1. Create a class named RemoveDuplicates and write a program that takes a list of integers,
removes any duplicate values, and returns the elements in sorted order.

         Example:
            {20, 15, 10, 20, 30, 10, 20, 15, 0}

         Output:
            {0, 10, 15, 20, 30}  */