package day12_OOP_encapsulation;

public class CandyClient {
    public static void main(String[] args) {
        Candy candy1 = new Candy ("Hershey", 5, 3.5, true );

        System.out.println(candy1.getBrand());
        System.out.println(candy1.getQuantity());
        System.out.println(candy1.getPrice());
        System.out.println(candy1.isHasPeanuts());
        System.out.println(candy1);

        Candy candy2 = new Candy("M&M", 3, 2, false);
        System.out.println(candy2);
    }
}
