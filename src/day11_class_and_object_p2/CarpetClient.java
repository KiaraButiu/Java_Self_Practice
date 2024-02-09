package day11_class_and_object_p2;

public class CarpetClient {

    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(7.5, 8, 20,false);
        Carpet carpet2 = new Carpet(10,20, 200, true);


        System.out.println("carpet1 = " + carpet1);
        System.out.println("carpet2 = " + carpet2);
    }
}
