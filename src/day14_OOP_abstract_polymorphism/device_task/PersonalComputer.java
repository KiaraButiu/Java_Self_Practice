package day14_OOP_abstract_polymorphism.device_task;

public class PersonalComputer extends Computer {
    public PersonalComputer(String brand, String model, String size, String color, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, color, price, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Personal computer is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Personal computer is OFF");;
    }
}
/* Create the Following Subclasses of Computer:
    - 'PersonalComputer':
        - Desktop
        - Laptop */