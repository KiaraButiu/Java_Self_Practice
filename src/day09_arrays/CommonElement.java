package day09_arrays;

public class CommonElement {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};

        for (int i = 0; i < arr1.length; i++) {             //i = arr1
            for (int j = 0; j < arr2.length; j++) {      //j = arr2
                if (arr1[i] == arr2[j]){
                    System.out.println(arr2[j]);
                }
            }
        }
    }
}
/* Create a class named CommonElements and write a program that prints out the common elements from two integer arrays.

			Example:
				arr1: {1,2,3,4,5}
				arr2: {4,5,6,7,8}

			Output:
				4
				5

*/