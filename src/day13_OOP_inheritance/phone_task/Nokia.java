package day13_OOP_inheritance.phone_task;

public class Nokia extends IPhone {

    public Nokia(String brand, String model, String size, String color, double price) {
        super(brand, model, size, color, price);
    }

    @Override
    public void faceTime(String phoneNumber) {
        System.out.println("Unable to facetime in this device");
    }
}
/* Create a class named 'Nokia' with these specifications:
   Attributes:
       - Same as IPhone.

   Encapsulation:
       - Same conditions as IPhone.

   Constructor:
       - Same as IPhone.

   Actions:
       - call(phoneNumber): Display "calling the number [phoneNumber]".
       - text(phoneNumber): Display "texting to the number [phoneNumber]".
       - toString(): Prints the information of the Nokia object.*/