package day14_OOP_abstract_polymorphism.device_task;

public class Samsung extends Phone implements Downloadable,AndroidApps {

    public Samsung(String brand, String model, String size, String color, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, color, price, hasBattery, hasPowerButton);
    }
    @Override
    public void downloadable() {
        System.out.println("Downloading app from the Galaxy Store");
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
/*'Samsung':
        - Extends Phone class.
        - Implements Downloadable & AndroidApps interfaces.  */