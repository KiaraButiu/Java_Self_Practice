package day06_method;
/* Create a class named MaximumAndMinimum:
	2.1 Create a method named max that returns the maximum number between two integer numbers.
	2.2 Create a method named max that returns the maximum number between two double numbers.
	2.3 Create a method named min that returns the minimum number between two integer numbers.
	2.4 Create a method named min that returns the minimum number between two double numbers.
Example1:
        double n = max(10.5, 30.2);
Output:
        30.2
Example2:
    	int m = min(100, 200);
Output:
    	100     */
public class MaximumAndMinimum {
    public static void main(String[] args) {
        int maxI = max(10,20);
        System.out.println(maxI);

        double maxD = max(10.5,30.2);
        System.out.println(maxD);

        int minI = min(20, 65);
        System.out.println(minI);

        double minD = min(22.2, 87.2);
        System.out.println(minD);

    }
    public static int max (int n1, int n2){
        if (n1 > n2){
            return n1;
        } else {
            return n2;
        }
    }
    public static double max (double n1, double n2){
        if (n1 > n2){
            return n1;
        } else {
            return n2;
        }
    }
    public static int min ( int m1, int m2){
        if (m1 < m2){
            return m1;
        } else {
            return m2;
        }
    }
    public static double min (double m1, double m2){
        if (m1 < m2){
            return m1;
        } else {
            return m2;
        }
    }

}
