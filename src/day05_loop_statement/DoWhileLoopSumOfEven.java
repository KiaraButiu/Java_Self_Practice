package day05_loop_statement;
// Calculate the sum of even number between 1 and 10.
// Then print result using "do-while" loop.

public class DoWhileLoopSumOfEven {
    public static void main(String[] args) {
 // For Loop:
        int sumEven = 0;

        for (int i = 0; i <=10 ; i +=2) {
            sumEven += i;
        }
        System.out.println("Sum of even number is " + sumEven);

 // While Loop:

        int num = 0;
        int sumE = 0;

        while (num <=10 ){
            if (num % 2 == 0){
                sumE = sumE + num;
            }
            num++;
        }
        System.out.println(sumE);


    }

}

