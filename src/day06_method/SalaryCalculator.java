package day06_method;
/*Create a class named SalaryCalculator and create a method named salary that takes hourly rate (double)
and weekly hours (int) and returns the salary.
Example:
		double income = salary(45, 40);
Output:
		93600.0                         */
public class SalaryCalculator {

    public static void main(String[] args) {
        double income = salary(45, 40);
        System.out.println(income);
    }

    public static double salary (double hourly, int weekly){
        double salaryCalculator = hourly * weekly * 52;
        return salaryCalculator;
    }

}
