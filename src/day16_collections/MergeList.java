package day16_collections;

import java.util.*;

public class MergeList {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(30, 40, 50, 60, 70, 80, 90, 100));



        Set<Integer> list3 = new TreeSet<>(list1);      // ascending order, no duplicates
        list3.addAll(list2);

        System.out.println(list3);


    }

}
/* 2. Create a class named MergeLists and write a program that merges two given lists of integers into a third list.
Ensure that the third list contains no duplicate elements and maintains the original order of elements from the input lists.

         Example:
            list1 = {10, 20, 30, 40, 50, 60, 70}
            list2 = {30, 40, 50, 60, 70, 80, 90, 100}

         Output:
            list3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100} */