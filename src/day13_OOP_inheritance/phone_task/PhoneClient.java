package day13_OOP_inheritance.phone_task;

public class PhoneClient {

    public static void main(String[] args) {

        IPhone iphone = new IPhone("Apple","14", "Promax", "Purple", 1200);
        System.out.println(iphone);
        iphone.faceTime("410-897-6547");

        System.out.println("______________________");

        Samsung samsung = new Samsung("Samsung", "Galaxy S24", "Max", "Silver", 300);
        System.out.println(samsung);
        samsung.text("240-908-7893");
        samsung.faceTime(" ");

        System.out.println("______________________");

        Nokia nokia = new Nokia("Nokia", "3310", "Standard", "White", 80);
        System.out.println(nokia);
        nokia.call("443-865-1757");

        System.out.println("______________________");

        IPhone iphone2 = new IPhone(" ", "Iphone 13", "max", "Yellow", 0 );
        System.out.println(iphone2);

    }
}
/*  Create a class named "PhoneClients":
   - Create multiple objects representing different phones.
   - Test the methods and variables of each object. */