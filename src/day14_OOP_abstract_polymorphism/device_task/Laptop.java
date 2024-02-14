package day14_OOP_abstract_polymorphism.device_task;

public class Laptop extends PersonalComputer{
    public Laptop(String brand, String model, String size, String color, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, color, price, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Laptop is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Laptop is OFF");
    }
}
