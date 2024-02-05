package day05_loop_statement.nested_loop;

public class StairPattern {
    public static void main(String[] args) {

        for (int i = 1; i <= 6 ; i++) {
            System.out.print("#");

            for (int j = 1; j < i ; j++) {
                System.out.print(" ");
            }
            System.out.println("# ");
        }
    }
}
