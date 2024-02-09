package day12_OOP_encapsulation;

public class Item {
    private String name;
    private double unitPrice;
    private int quantity;

    public String getName() {
        if (name.isEmpty() || name.isBlank()) {
            System.err.println("Name cannot be empty or blank: " + name);
            System.exit(1);
        }
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (!(Character.isLetterOrDigit(ch) || ch == ' ')) {
                System.err.println("Name cannot contain any special characters other than space.");
                System.exit(1);
            }
            if(!(Character.isLetter(name.charAt(0)))){
                System.err.println("Name must start with letters.");
                System.exit(1);
            }
        }
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            System.err.println("Name cannot be empty or blank: " + name);
            System.exit(1);
        }
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (!(Character.isLetterOrDigit(ch) || ch == ' ')) {
                System.err.println("Name cannot contain any special characters other than space.");
                System.exit(1);
            }
            if(!(Character.isLetter(name.charAt(0)))){
                System.err.println("Name must start with letters.");
                System.exit(1);
            }
        }
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0){
            System.err.println("Unit price cannot be negative: " + unitPrice);
            System.exit(1);
        }
        this.unitPrice = unitPrice;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0){
            System.err.println("Quantity cannot be zero: " + quantity);
        }
        this.quantity = quantity;
    }

    public Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost(){
        return unitPrice * quantity;
    }

    public String toString() {
        return "Items{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", Total Cost= " + calcCost() +
                '}';
    }


}

/* Create a custom class named Item with the following specifications:

	Attributes:
		name
		unitPrice
		quantity

	Ensure encapsulation for all fields.
		Conditions:
			The name cannot be empty or blank.
			The name cannot contain any special characters other than space.
			The name must start with letters.
			The unitPrice cannot be negative.
			The quantity cannot be negative.

	Add a constructor that enables the user to set all fields during object creation.

	Actions:
		calcCost(): Returns the total cost.
		toString(): Displays the name, unit price, quantity, and total cost calculated by calcCost() when the object is printed.

	Create another class named ItemClients, create multiple item objects, and test each function of the item object.
*/