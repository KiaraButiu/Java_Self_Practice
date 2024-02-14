package day14_OOP_abstract_polymorphism.car_task;

public class CarClient {
    public static void main(String[] args) {

        Honda honda = new Honda("Honda", "Civic", 2017, 27_000, "Red");
        honda.start();
        honda.drive();
        System.out.println(honda);

        System.out.println("-----------------------------");

        BMW bmw = new BMW("BMW", "X1 SUV", 2024, 40_500, "White");
        bmw.start();
        bmw.drive();
        System.out.println(bmw);

        System.out.println("-----------------------------");

        Audi audi = new Audi("Audi", "S5 Cabriolet", 2018, 66_100, "Silver");
        audi.start();
        audi.drive();
        audi.autoPark();
        System.out.println(audi.getModel() + " has auto-pilot: " +  Audi.hasAutoPark);
        System.out.println(audi);

        System.out.println("-----------------------------");

        Tesla tesla = new Tesla("Tesla", "Cyberbeast", 2024, 96_390, "Black");
        tesla.start();
        tesla.drive();
        tesla.autoPark();
        tesla.selfDrive();
        System.out.println(tesla.getModel() + " has auto-pilot: " + Tesla.hasAutoPark);
        System.out.println(tesla.getModel() + " has self-drive mode: " + Tesla.hasAutoPilot);
        System.out.println(tesla);

        System.out.println("-----------------------------");

        CydeoCar cydeoCar = new CydeoCar("Cydeo", "B33", 2024, 123_000, "Pink");
        cydeoCar.start();
        cydeoCar.drive();
        cydeoCar.autoPark();
        cydeoCar.selfDrive();
        cydeoCar.fly();
        System.out.println(cydeoCar.getModel()+ " has auto-pilot: " + CydeoCar.hasAutoPark);
        System.out.println(cydeoCar.getModel() + " has self-drive mode: " + CydeoCar.hasAutoPilot);
        System.out.println(cydeoCar.getModel() + " has fly-mode: " + CydeoCar.hasAutoPilot);
        System.out.println(cydeoCar);




    }
}
/*
Create a Class Named 'CarClients':
    - Instantiate an object from each concrete class.
    - Test all functions of each object.
    - Analyze the relationships between the classes */