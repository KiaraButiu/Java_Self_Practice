package day04_selection_statements.lab;
// Write a program that calculates the average of Math, Chemistry and Biology
// score and prints the grade table.

// A: 90-100    B: 80-89    C: 70-79   D: 60-69   F: 0-59
public class GradeTable {
    public static void main(String[] args) {

        double math = 60.0;
        double chemistry = 50.0;
        double biology = 70.0;

        double average = 60.0;              // average: (math + chem + bio)/3

        if (average >= 90 && average <= 100) {
            System.out.println("Average is" + average);
            System.out.println("Grade is A");

        } else if (average >= 80 && average < 90) {
            System.out.println("Average is" + average);
            System.out.println("Grade is B");

        } else if (average >= 70 && average < 80) {
            System.out.println("Average is" + average);
            System.out.println("Grade is C");

        } else if (average >= 60 && average < 70) {
            System.out.println("Average is" + average);
            System.out.println("Grade is D");

        } else if (average >= 0 && average < 50) {
            System.out.println("Average is" + average);
            System.out.println("Grade is C");

        } else {
            System.out.println("Invalid Average/Grade");
        }

    }

}