package day09_arrays;

import java.util.Arrays;

public class ArrayElements {
    public static void main(String[] args) {

    // 1.1 Create an array of integers with a length of 100.
        int[] number = new int[100];
        int length = number.length;
        System.out.println("Array length: " + length);

    // 1.2 Assign values from 1 to 100 to the indexes of the array.
    // 1.3 Display the array elements in a single line separated by spaces.
        for (int i = 0; i < number.length; i++) {
            number[i] = i + 1;
            System.out.print(number[i] + " ");
        }
        System.out.println();


    //  1.4 Display the array elements in a single line in reversed order, separated by spaces.
        for (int j = number.length - 1; j >= 0; j--) {
            System.out.print(number[j] + " ");
        }
        System.out.println();


    //  1.5 Display all evenly divisible elements by 5 in a single line separated by spaces.
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 5 == 0){
                System.out.print(number[i] + " ");
        }
        }



    }
}
/*
1. Create a class named ArrayElements and write a program with the following specifications:
   1.1 Create an array of integers with a length of 100.
   1.2 Assign values from 1 to 100 to the indexes of the array.
   1.3 Display the array elements in a single line separated by spaces.
   1.4 Display the array elements in a single line in reversed order, separated by spaces.
   1.5 Display all evenly divisible elements by 5 in a single line separated by spaces.
*/