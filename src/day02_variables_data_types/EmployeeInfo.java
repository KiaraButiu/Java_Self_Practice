package m10_variables_data_types;

import java.security.KeyStore;

public class EmployeeInfo {
    public static void main(String[] args) {

        String employeeName = "Shay";
        int age = 24;
        char gender = 'F';
        String companyName = "Apple Inc";
        String jobTitle = "SDET";
        double yearsOfExperience = 2.5;
        int salary = 12_000;
        boolean isFullTime = true;
        boolean isMarried = false;
        String employeeId = "B101";

        System.out.println("Employee Name:" + employeeName + "\n" + "Gender: " + gender + "\n" + "Age: " + age);
        System.out.println("Employee ID:" + employeeId + "\n" + "Job Title " + jobTitle + "\n" + "Company name:" + companyName);
        System.out.println("Full Time:" + isFullTime + "\n" + "Years of work experience:" + yearsOfExperience + " years");
        System.out.println("Salary:" + salary + ".0" + "\n" + "Married:" + isMarried);
    }
}
