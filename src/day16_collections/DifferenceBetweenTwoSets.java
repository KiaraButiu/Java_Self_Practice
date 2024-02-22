package day16_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DifferenceBetweenTwoSets {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(1, 2, 3, 5));

        Set<Integer> set2 = new HashSet<>();
        set2.addAll(Arrays.asList(2, 3, 4));


        Set<Integer> set3 = new HashSet<>(set1);
        set3.removeAll(set2);           // removes elements present in set2

        System.out.println(set3);
    }


}
/* 4. Create a class named DifferenceBetweenTwoSets and write a program that calculates the difference
 between two sets of integers (elements in the first set but not in the second) and displays the result.

         Example:
            Set1 = {1, 2, 3, 5}
            Set2 = {2, 3, 4}

         Output:
            {1, 5}  */