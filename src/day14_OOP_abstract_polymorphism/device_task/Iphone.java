package day14_OOP_abstract_polymorphism.device_task;

public class Iphone extends Phone implements AppleApps,Downloadable {

    public Iphone(String brand, String model, String size, String color, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, color, price, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadable() {
        System.out.println("Downloading app from the App Store");
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " " + getModel() + " is ON");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " " + getModel() + " is OFF");
    }
}
/*   Create the Following Subclasses of Phone:
    - 'Iphone':
        - Extends Phone class.
        - Implements Downloadable & AppleApps interfaces.
    */