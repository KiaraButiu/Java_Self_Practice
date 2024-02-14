package day14_OOP_abstract_polymorphism.device_task;

public abstract class Device {

    private final String brand, model;
    private final String size;
    private String color;
    private double price;
    private boolean hasBattery;
    private boolean hasPowerButton;

    public Device(String brand, String model, String size, String color, double price, boolean hasBattery, boolean hasPowerButton) {

        if (brand == null || brand.isBlank() || brand.isEmpty()){
            throw new RuntimeException("Brand cannot be null, empty or blank.");
        }
        if (model == null || model.isBlank() || model.isEmpty()){
            throw new RuntimeException("Model cannot be null, empty or blank.");
        }
        if (size == null || size.isBlank() || size.isEmpty()){
            throw new RuntimeException("Brand cannot be null, empty or blank.");
        }

        this.brand = brand;
        this.model = model;
        this.size = size;
        setColor(color);
        setPrice(price);
        this.hasBattery = hasBattery;
        this.hasPowerButton = hasPowerButton;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()){
            throw new RuntimeException("Color cannot be null, empty or blank: " + getColor());
        }
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0){
            throw new RuntimeException("Price cannot be zero or a negative number: " + getPrice());
        }
        this.price = price;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public abstract void turnOn();
    public abstract void turnOff();
    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
/*Device Task Requirements:

1. Create an Abstract Class Named 'Device':
    - Variables:
        - final brand
        - final model
        - price
        - color
        - final size
        - hasBattery
        - hasPowerButton
    - Encapsulate all fields.
    - Constructor: Initializes all fields.
    - Conditions:
        - brand, model, color, and size must not be null or empty.
        - price must be positive.
    - Abstract Methods:
        - turnOn()
        - turnOff()
    - Non-Abstract Method:
        - toString()

2. Create a Child Abstract Class of Device Named 'Phone':
    - Extra Non-Abstract Methods:
        - call(long phoneNum)
        - text(long phoneNum)
        - toString()

3. Create a Child Abstract Class of Device Named 'Computer':
    - Add extra methods as needed.

4. Create an Interface Named 'Downloadable':
    - Abstract Method:
        - downloadApp()

5. Create a Child Interface of Downloadable Named 'AndroidApps':
    - Variables:
        - AppStoreName
        - OS

6. Create a Child Interface of Downloadable Named 'AppleApps':
    - Variables:
        - AppStoreName
        - OS

7. Create the Following Subclasses of Phone:
    - 'Iphone':
        - Extends Phone class.
        - Implements Downloadable & AppleApps interfaces.
    - 'Samsung':
        - Extends Phone class.
        - Implements Downloadable & AndroidApps interfaces.
    - 'Google':
        - Extends Phone class.
        - Implements Downloadable & AndroidApps interfaces.

8. Create the Following Subclasses of Computer:
    - 'PersonalComputer':
        - Desktop
        - Laptop

9. Create a Class Named 'DeviceShop':
    - Instantiate an object from each concrete class.
    - Test all functions of each object.
    - Analyze the relationships between the classes.
 */