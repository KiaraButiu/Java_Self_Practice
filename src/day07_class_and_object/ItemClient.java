package day07_class_and_object;

public class ItemClient {
    public static void main(String[] args) {

        Item item1= new Item();
        item1.itemName = "apples";
        item1.quantity = 7;
        item1.unitPrice = 1.50;

        item1.calcCost();

        Item item2 = new Item();
        item2.itemName = "avocados";
        item2.quantity = 5;
        item2.unitPrice = 2.25;

        item2.calcCost();
    }
}
