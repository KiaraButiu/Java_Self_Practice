package day14_OOP_abstract_polymorphism.car_task;

public class Toyota extends Car {

    public Toyota(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Push to start button to start " + getModel());
    }

    @Override
    public void drive() {
        System.out.println("Toyota " + getModel() + "is being driven.");
    }


}
