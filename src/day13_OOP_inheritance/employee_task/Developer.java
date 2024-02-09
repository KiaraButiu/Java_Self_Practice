package day13_OOP_inheritance.employee_task;

public class Developer extends Employee{

    private String programmingLanguage;

    public Developer(String name, String employeeId, String jobTitle, String companyName, double salary, String programmingLanguage) {
        super(name, employeeId, jobTitle, companyName, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is coding in " + programmingLanguage + ".");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", programmingLanguage='" + programmingLanguage + '\'';
    }
}
