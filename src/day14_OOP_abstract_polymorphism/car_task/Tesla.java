package day14_OOP_abstract_polymorphism.car_task;

public class Tesla extends Car implements AutoPark, AutoPilot{
    public Tesla(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }
    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " autopark is working.");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " " + getModel() + "is a self-driving car.");
    }

    @Override
    public void start() {
        System.out.println("Push the start button to start " + getMake() + " " + getModel());

    }
    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " is being driven.");

    }
}

/* 9. Create two Subclasses of Car ('Tesla' and 'Nio') that Implement both AutoPark and AutoPilot Interfaces.*/