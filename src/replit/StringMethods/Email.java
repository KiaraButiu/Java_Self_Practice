package replit.StringMethods;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter email: ");
        String email = input.next();

        int underScore = email.indexOf("_");
        int At = email.indexOf("@");
        int dotCom = email.indexOf(".com");

        String firstName = email.substring(0, underScore);
        String lastName = email.substring(underScore + 1, At);
        String domain = email.substring(At + 1, dotCom);

        System.out.println("First name: " + capitalInitial(firstName) + "\n" + "Last name: " + capitalInitial(lastName)
        + "\n" + "Domain: " + capitalInitial(domain));

    }
    public static String capitalInitial(String name){
        return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    }
}
/*Use `String methods` to divide the given `email` into separate parts. The email will always be in this format:

firstName_lastName@domain.com

Pull apart and print the first name, last name, and domain. When printing the values all three should be in proper
capitalization format - The first letter of each word is uppercase and the rest are lowercase.
Output in the following format:
First name: $first name
Last name: $last name
Domain: $domain */
