package day11_class_and_object_p2;

public class EmployeeClient {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Edward", 28, 'M', "Business Owner", 130_000);
        System.out.println("employee1 = " + employee1);
        employee1.work();

        Employee employee2 = new Employee("Kiara", 29, 'F', "SDET", 120_000);
        System.out.println("employee2 = " + employee2);
        employee2.work();
    }
}
