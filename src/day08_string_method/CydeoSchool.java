package day08_string_method;

import java.util.Scanner;

public class CydeoSchool {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String firstName = input.nextLine();

        System.out.println("Enter last name: ");
        String lastName = input.nextLine();

        input.close();

        System.out.println(reformat(firstName) + " " + reformat(lastName));

//        firstName = firstName.substring(0,1).toUpperCase()+ firstName.substring(1).toLowerCase();
//        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
//
//        System.out.println(firstName + " " + lastName);

    }
    public static String reformat (String name){
        return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    }
}

/*Write a program that asks the user to enter first and last names and then prints the full name in regular format
(first character in uppercase).

        Example:
              Input:
                  firstName = "cyDEo";
                  lastName = "SCHOOL";

              Output:
                   Cydeo School  */
