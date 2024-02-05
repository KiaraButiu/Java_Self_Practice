package day04_selection_statements.IfStatementLabs;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 23;
        int b = 18;
        int c = 15;

        if ((a > c && c > b) || (a < c && c < b)) {
            System.out.println( c + " is the median number");
        }  else if (( a > b && b > c) || ( a < b && b < c)) {
            System.out.println(b + " is the median number");
        } else {
            System.out.println(a + " is the median");
        }


    }

}