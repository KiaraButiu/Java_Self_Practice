package day13_OOP_inheritance.employee_task;

public class EmployeeClient {

    public static void main(String[] args) {

        Tester tester = new Tester("Kiara", "12345",
                "Full-stack SDET", "Costco", 118_000);
        tester.work();
        System.out.println(tester);

        System.out.println("----------------");

        Developer developer = new Developer("Josue", "0987", "Developer",
                "CitiBank", 124_000, "Python");
        developer.work();
        System.out.println(developer);

        System.out.println("----------------");

        Teacher teacher = new Teacher("Mary", "5678", "ESL-Teacher",
                "PG County", 102_000);
        teacher.work();
        System.out.println(teacher);

        System.out.println("----------------");

        Driver driver = new Driver("Jack", "0001", "School bus driver",
                "Howard County Public School", 45_000, "school bus");
        driver.work();
        System.out.println(driver);
    }
}
