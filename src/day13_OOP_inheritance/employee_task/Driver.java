package day13_OOP_inheritance.employee_task;

public class Driver extends Employee{

    private String typeOfVehicle;

    public Driver(String name, String employeeId, String jobTitle, String companyName, double salary, String typeOfVehicle) {
        super(name, employeeId, jobTitle, companyName, salary);
        this.typeOfVehicle = typeOfVehicle;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is driving a " + typeOfVehicle + ".");
    }

    @Override
    public String toString() {
        return super.toString() +
                " typeOfVehicle='" + typeOfVehicle;
    }
}
