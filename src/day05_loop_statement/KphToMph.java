package day05_loop_statement;
// 1 mile = 0.62 kilometer
public class KphToMph {
    public static void main(String[] args) {

        System.out.println("KPH " + "\t" + " MPH" );

        System.out.println("-------------");

        for (int kph = 20; kph <= 140 ; kph += 10) {
            System.out.println(kph + "\t\t" + (kph * 0.62));
            
        }
    }
}
