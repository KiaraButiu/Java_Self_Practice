package day07_class_and_object;

public class EmployeeClient {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Kiara";
        employee1.age = 28;
        employee1.gender = 'F';
        employee1.jobTitle = "SDET";
        employee1.salary = 120_000;

        employee1.work();

        System.out.println(employee1);

        Employee employee2 = new Employee();
        employee2.name = "Edward";
        employee2.age = 28;
        employee2. gender = 'M';
        employee2. jobTitle = "Entrepreneur";
        employee2.salary = 150_000;
        employee2.work();

        System.out.println(employee2);
    }


    }



