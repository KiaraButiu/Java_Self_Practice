package day11_class_and_object_p2.RestaurantTask;

public class Server {

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean isFullTime;

    public Server(String name, int employeeID, double hourlyRate, boolean isFullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.isFullTime = isFullTime;
    }

    public void makeOrder(){
        System.out.println(name + " is making an order");
    }

    public void washDishes(){
        System.out.println(name + " is washing the dishes");
    }

    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
/* Create a custom class named Server with similar specifications:

	Attributes:
			name (String)
			employeeID (int)
			hourlyRate (double)
			fullTime (boolean)

	Add A constructor that can set all the fields.

    Actions:
		makeOrder(): prints server's name + " is making an order"
		washDishes(): prints server's name + " is washing the dishes"
		toString(): returns a string representation of a server, including full-time or part-time status

*/
