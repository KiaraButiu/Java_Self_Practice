package day06_method;

public class MathUtility {

    public static void main(String[] args) {

        int resultI = calculate(10, '+', 20);
        System.out.println(resultI);

        double resultD = calculate(2.5,'*',3.0 );
        System.out.println(resultD);

        System.out.println(square(8));

        System.out.println(square(1.5));

        System.out.println(cube(3));

        System.out.println(cube(2.5));


    }

    public static int calculate (int n1, char operator, int n2){
        int result;
        if (operator == '+'){
            result = n1 + n2;
        }else if (operator == '-'){
            result = n1 - n2;
        }else if (operator == '*'){
            result = n1 * n2;
        } else if (operator == '/'){
            result = n1 / n2;
        }else{
            return 0;
        }
        return result;
    }
    public static double calculate (double n1, char operator, double n2){
        double result;
        if (operator == '+'){
            result = n1 + n2;
        }else if (operator == '-'){
            result = n1 - n2;
        }else if (operator == '*'){
            result = n1 * n2;
        } else if (operator == '/'){
            result = n1 / n2;
        }else{
            return 0;
        }
        return result;
    }
    public static int square (int num){
        return num * num;
    }
    public static double square (double num){
        return num * num;
    }
    public static int cube (int num){
        return num*num*num;
    }
    public static double cube (double num){
        return num*num*num;
    }
}
