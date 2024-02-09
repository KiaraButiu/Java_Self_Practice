package day11_class_and_object_p2.RestaurantTask;

import java.util.Arrays;

public class LocalRestaurant {
    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("Edward", "1309 Hill Born Dr. Hanover, MD", 5);
        System.out.println(restaurant1);

        Server server1 = new Server("Johnny", 1234, 14,true);
        Server server2 = new Server("Jane", 4321, 14,false);
        Server server3 = new Server("Joe", 5678, 14, true);

        Server[] servers = {server1, server2, server3};


        Chef chef1 = new Chef("Amy", 9876, 35, true);
        Chef chef2 = new Chef("Ben",0123, 28, false);

        Chef[] chefs = {chef1,chef2};

        restaurant1.hireServer(servers);
        System.out.println(Arrays.toString(servers));

        restaurant1.hireChef(chefs);
        System.out.println(Arrays.toString(chefs));

        System.out.println(restaurant1);

    }

}
/*    Create a class named LocalRestaurant with a main method:
	Create a Restaurant object
	Create an array of servers and chefs with their information set
	Add the initial servers and chefs to the respective ArrayLists in the Restaurant object
	Print the whole restaurant's information*/
