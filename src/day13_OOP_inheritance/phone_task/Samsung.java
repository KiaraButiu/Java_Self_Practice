package day13_OOP_inheritance.phone_task;

public class Samsung extends IPhone {
    public Samsung(String brand, String model, String size, String color, double price) {
        super(brand, model, size, color, price);
    }

    @Override
    public void faceTime(String phoneNumber) {
        System.out.println("Unable to facetime with this device");
    }
}


/* Create a class named 'Samsung' with these specifications:
   Attributes:
       - Same as IPhone.

   Encapsulation:
       - Same conditions as IPhone.

   Constructor:
       - Same as IPhone.

   Actions:
       - call(phoneNumber): Display "calling the number [phoneNumber]".
       - text(phoneNumber): Display "texting to the number [phoneNumber]".
       - toString(): Prints the information of the Samsung object.*/