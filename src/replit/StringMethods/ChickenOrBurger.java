package replit.StringMethods;

import java.util.Scanner;

public class ChickenOrBurger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String order = input.next();

        if (order.equals("burger")){
            System.out.println("Your total is $12.55");

        }else if (order.equals("chicken")){
            System.out.println("Your total is $9.75");

        }else{
            System.out.println("Invalid Order");
        }


    }
}
/* Use `String methods` and `if statements` for the fast food company's menu.
There is two main orders: A Burger meal or a Chicken meal. The cashier will have an input `order`
that will be used to determine the price. Use the following information to determine the price of the order:

> - burger: $12.55
> - chicken: $9.75
*/
