package day08_string_method;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your email address:");
        String email = input.nextLine();            //mike_tyson@gmail.com

        if (email.contains("_")){
            int emailUnderscore = email.indexOf("_");
            int emailAt = email.indexOf("@");

            email = email.substring(0,emailUnderscore) + email.substring(emailUnderscore,emailAt);
            email = email.substring(emailUnderscore +1 ,emailAt) + "_" + email.substring(0, emailUnderscore) + "@gmail.com";

            System.out.println(email);
        }else{
            System.out.println(email);
        }

    }
}
/* 4. Create a class called EmailTask1. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that can swap the first name with the last name in the email
(separated by an underscore). If the email doesn't contain an underscore, print the given input email.

        Example:
              Input:
                 mike_tyson@gmail.com

              Output:
                  tyson_mike@gmail.com
*/
