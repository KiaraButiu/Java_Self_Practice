package day11_class_and_object_p2;

public class PizzaClient {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("small", 0, 0);
        Pizza pizza2 = new Pizza("MEDIUM", 5,5);
        Pizza pizza3 = new Pizza("larGe", 1,7);

        System.out.println("pizza1 = " + pizza1);
        System.out.println("pizza2 = " + pizza2);
        System.out.println("pizza3 = " + pizza3);


    }


}
