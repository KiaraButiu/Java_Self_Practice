package day07_scanner;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score:");
        double grade = input.nextDouble();

        String result;

        if (grade >= 90 && grade <= 100){
            result = "Your grade is A";
        }else if (grade >= 80 && grade <= 90){
            result = "Your grade is B";
        }else if (grade >= 70 && grade <= 80){
            result = "Your grade is C.";
        } else if (grade >= 70 && grade <=60) {
            result = "Your grade is D.";
        }if (grade < 0 || grade > 100){
                result = "Invalid Score.";
        }else{
            result= "Failed";
        }

        System.out.println(result);

        input.close();
    }
}
/* Create a class named GradeReport and write a program asking the user to enter their score and print the student's grade.

  If the user enters an invalid score (negative or more than 100), print "Invalid Score."

        Example:
             Enter your score:
             Input: 85

        Output:
             Your grade is B */

