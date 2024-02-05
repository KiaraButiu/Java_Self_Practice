package day08_string_method;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split or No Split (Yes or No)?");
        String answer = input.nextLine().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.err.println("Invalid answer, please insert Yes or No");
            answer = input.nextLine().toLowerCase();

        }
        if (answer.equals("no")) {
            System.out.println("Proceed single payment");
            return;
        }
        System.out.println("Enter the number of people: ");
        int numberOfPeople = input.nextInt();

        System.out.println("Enter the check amount: ");
        int checkAmount = input.nextInt();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String serviceQuality = input.next().toLowerCase();

        input.close();

        double totalTip = 0;

        if (serviceQuality.equals("poor")) {
            totalTip = checkAmount * 0.05;
        } else if (serviceQuality.equals("fair")) {
            totalTip = checkAmount * 0.10;
        } else if (serviceQuality.equals("good")) {
            totalTip = checkAmount * 0.15;
        } else if (serviceQuality.equals("great")) {
            totalTip = checkAmount * 0.20;
        } else if (serviceQuality.equals("excellent")) {
            totalTip = checkAmount * 0.25;
        } else {
            totalTip = totalTip;
        }

        double totalToPay = checkAmount + totalTip;

        System.out.println("Number of people entered: " + numberOfPeople);
        System.out.println("Total to pay: " + totalToPay);
        System.out.println("Total tip: " + totalTip);
        System.out.println("Total per person: " + totalToPay / numberOfPeople);
        System.out.println("Tip per person: " + totalTip / numberOfPeople);
    }
}


/* Create a class called TipCalculator and write a program for a tip calculator. There will be different service
quality benchmarks that will determine the tip given. There will also be the ability to calculate based on the
number of people in the party and whether there is a split of the bill.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

      The program should ask the user to enter:
          - Split or No split (Yes or No),
          - Enter the number of people (number)
          - Enter the check amount (number)
          - Service Quality (String)


      And display the output in the following format:

            Example:
                  Split or No Split (Yes or No)?
                  Input: Yes
                  Enter the number of people:
                  Input: 4
                  Enter the check amount:
                  Input: 476
                  How was the service quality? (Excellent/Great/Good/Fair/Poor)
                  Input: Excellent

            Output:
                 Number of people entered: 4
                 Total to pay: 595.0
                 Total tip: 119.0
                 Total per person: 148.75
                 Tip per person: 29.75*/
