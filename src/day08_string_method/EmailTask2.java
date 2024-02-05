package day08_string_method;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email address: ");
        String emailAddress= input.next();              // craig_federighi@apple.com

        String firstName = emailAddress.substring(0,emailAddress.indexOf('_'));
        String lastName = emailAddress.substring(emailAddress.indexOf('_') +1,emailAddress.indexOf('@'));
        String domain = emailAddress.substring(emailAddress.indexOf('@') +1,emailAddress.indexOf('.'));
        String dotCom = ".com";


        firstName= firstName.substring(0,1).toUpperCase() + firstName.substring(1);
    //    System.out.println(firstName);

        lastName= lastName.substring(0,1).toUpperCase() + lastName.substring(1);
     //    System.out.println(lastName);

        System.out.println("First name: " + firstName + "\n" + "Last name: " + lastName + "\n" + "Domain: " + domain);


    }
}
/* Create a class called EmailTask2. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that will print out information about the user based on the email.
Print the first name, last name, and domain. First and last names should be printed with the proper format.
(uppercase first letter and remaining lowercase)

        Example:
              Input:
                 craig_federighi@apple.com

              Output:
                   First name: Craig
                   Last name: Federighi
                   Domain: apple   */