package day14_OOP_abstract_polymorphism.device_task;



public class Phone extends Device {

    public Phone(String brand, String model, String size, String color, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, color, price, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn(){
        System.out.println(getBrand() + " " +  getModel() + " is ON" );
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " " +  getModel() + " is OFF" );
    }
    public void call(long phoneNum){
        System.out.println("Calling " + phoneNum);
    }
    public void text(long phoneNum){
        System.out.println("Texting " + phoneNum);
    }

    @Override
    public String toString() {
        return super.toString();
}
}

/*  Create a Child Abstract Class of Device Named 'Phone':
    - Extra Non-Abstract Methods:
        - call(long phoneNum)
        - text(long phoneNum)
        - toString()  */