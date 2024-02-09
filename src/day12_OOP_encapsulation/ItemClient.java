package day12_OOP_encapsulation;

public class ItemClient {
    public static void main(String[] args) {
        Item item1 = new Item("Nike Shoes", 120, 1);

        System.out.println(item1.getName());
        System.out.println(item1.getUnitPrice());
        System.out.println(item1.getQuantity());
        System.out.println(item1);

        Item item2 = new Item("$am", 6.75, 1);

        item2.setName("$am");
        System.out.println(item2.getName());
    }
}
