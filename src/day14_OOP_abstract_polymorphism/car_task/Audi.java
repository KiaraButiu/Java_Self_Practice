package day14_OOP_abstract_polymorphism.car_task;

public class Audi extends Car implements AutoPark {
    public Audi(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Push the start button to start " + getMake() + " " + getModel());
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " is being driven.");
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " autopark is working.");
    }

}


/* Create two Subclasses of Car ('Audi' and 'Mercedes') that Implement the AutoPark Interface.*/