package day14_OOP_abstract_polymorphism.car_task;

public class BMW extends Car{
    public BMW(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Push the start button to start " + getMake() + " " + getModel());
    }

    @Override
    public void drive() {
        System.out.println(getMake()+ " " + getModel() + " is being driven.");
    }


}
/* 7. Create a Subclass of Car Named 'BMW' */