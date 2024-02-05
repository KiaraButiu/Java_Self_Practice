package day03_operators;

public class SalaryCalculator {
    public static void main(String[] args) {

        double hourlyRate = 50.0;
        int weeklyHours = 45;
        double stateTaxRate = 0.06;
        double federalTaxRate = .26;
        int workWeek = 52;
//      52 work weeks in a year

        double salaryBeforeTax = hourlyRate * weeklyHours * workWeek;
        double stateTax = salaryBeforeTax * stateTaxRate;
        double federalTax = salaryBeforeTax * federalTaxRate;
        double totalTax = federalTax + stateTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: " + salaryBeforeTax);
        System.out.println("Federal tax is: " + federalTax);
        System.out.println("State tax is: " + stateTax);
        System.out.println("Total tax is: " + totalTax);
        System.out.println("Net income is: " + salaryAfterTax);













    }
}
