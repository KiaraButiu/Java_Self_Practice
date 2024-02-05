package day04_selection_statements.IfStatementLabs;

public class MovieTicketBooking2 {
    public static void main(String[] args) {
        int age = -30;

        if (age < 0 || age > 150) {
            System.err.println("Age cannot be negative or greater than 150");
            System.exit(1);
        }
      String result;

        if (age >= 0 && age <= 2) {
            result = "Infant";
        } else if (age >= 3 && age <= 12) {
            result = "Kid";
        } else if (age >= 13 && age <= 20) {
            result = "Teenager";
        } else if (age >= 21 && age <= 64) {
            result = "Adult";
        } else if (age > 64 ) {
            result = "Senior";
        } else {
            result = "Invalid";
        }
            System.out.println(result);

            switch (result) {
                case "Infant":
                    System.out.println("Free tickets for infants");
                    break;
                case "Kids", "Teenagers":
                    System.out.println("Ticket is $8");
                    break;
                case "Adult":
                    System.out.println("Ticket is $12");
                    break;
                case "Senior":
                    System.out.println("Ticket is $10");
                    break;

            }
        }
    }


/*
2. Create a Java class named MovieTicketBooking with the following requirements:

    2.1 A variable named age is given. Define the age groups and their respective age ranges:
            Infant: 0 to 2 years
            Kid: 3 to 12 years
            Teenager: 13 to 20 years
            Adult: 21 to 64 years
            Senior: Greater than 64 years

    2.2 Assign ticket prices based on the age groups:
            Infant: $0
            Kid & Teenager: $8
            Adult: $12
            Senior: $10

    2.3 Display the output in the following format:
            Example 1:
                age = 2

                Output:
                    Free tickets for infants

            Example 2:
                age = 38

                Output:
                    The ticket price for your age is $12

    Ensure that the program accurately determines the user's age group and provides the correct ticket price based on the specified criteria.
 */