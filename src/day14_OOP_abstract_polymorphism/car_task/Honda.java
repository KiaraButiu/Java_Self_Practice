package day14_OOP_abstract_polymorphism.car_task;

public class Honda extends Car{
    public Honda(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Insert key to start to start " + getMake() + " " + getModel());
    }

    @Override
    public void drive() {
        System.out.println(getMake()+ " " + getModel() + " is being driven." );
    }
}
