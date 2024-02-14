package day14_OOP_abstract_polymorphism.device_task;

public class DeviceShop {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone", "15", "Pro-Max", "Purple", 1020, true, true);
        iphone.turnOn();
        iphone.turnOff();
        iphone.downloadable();
        iphone.call(123456);
        iphone.text(123456);
        System.out.println(iphone);

        Laptop laptop = new Laptop("Apple", "Macbook Pro", "15", "Midnight Black", 2400, true, true);
        laptop.turnOn();
        laptop.turnOff();
        System.out.println(laptop);




    }
}
