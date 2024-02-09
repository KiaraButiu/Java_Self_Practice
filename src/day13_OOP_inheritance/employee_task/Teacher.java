package day13_OOP_inheritance.employee_task;

public class Teacher extends Employee{

    public Teacher(String name, String employeeId, String jobTitle, String companyName, double salary) {
        super(name, employeeId, jobTitle, companyName, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is teaching.");
    }
}
