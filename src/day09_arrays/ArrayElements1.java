package day09_arrays;

public class ArrayElements1 {
    public static void main(String[] args) {

//    1.1 Create an array of integers with a length of 100.
        int[] numbers = new int[100];

//    1.2 Assign values from 1 to 100 to the indexes of the array.
        numbers = new int[100];
        int length = numbers.length;
        System.out.print("Array length: " + length);
        System.out.println();

    // 1.3
        displayElements(numbers);                   System.out.println();
    // 1.4
        displayReverse(numbers);                    System.out.println();
    // 1.5
        divisibleBy5(numbers);
    }

//    1.3 Display the array elements in a single line separated by spaces.
    public static void displayElements (int[] arr){

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }


//  1.4 Display the array elements in a single line in reversed order, separated by spaces.
    public static void displayReverse (int[] arr){
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }


//  1.5 Display all evenly divisible elements by 5 in a single line separated by spaces.
    public static void divisibleBy5 (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0){
                System.out.print(arr[i] + " ");
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