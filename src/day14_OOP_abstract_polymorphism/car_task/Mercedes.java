package day14_OOP_abstract_polymorphism.car_task;

public class Mercedes extends Car implements AutoPark {
    public Mercedes(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " autopark is working.");
    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }
}

/* Create two Subclasses of Car ('Audi' and 'Mercedes') that Implement the AutoPark Interface.*/
