package day14_OOP_abstract_polymorphism.device_task;

public class Desktop extends PersonalComputer{
    public Desktop(String brand, String model, String size, String color, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, color, price, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Desktop is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Desktop is OFF");
    }
}
